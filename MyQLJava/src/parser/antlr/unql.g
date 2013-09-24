grammar unql;
options {backtrack=true; memoize=true;}

@parser::header
{
package parser.antlr;

import ast_unql.*;
import ast_unql.binaryexpr.*;
import ast_unql.primaryexpr.*;
import ast_unql.statement.*;
import ast_unql.transaction.*;
import ast_unql.unaryexpr.*;

}
@parser::members {
    @Override
    public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
    }
}

@lexer::header
{
package parser.antlr;
}
	
transaction returns [Transaction result]
	@init {ArrayList<IStatement> list = new ArrayList<IStatement>(); }
	: 'BEGIN' Ident (s=statement {list.add($s.result);})* 'END' EOF { $result = new Transactions(list, new Ident($Ident.text)); }
	| (s=statement {list.add($s.result);})* EOF { $result = new StatementList(list); }
	;
	
statement returns [IStatement result]
	: s=select { $result = $s.result; } (op=('UNION ALL'|'INTERSECT'|'EXCEPT') sel=select { $result = new Compound($result,$sel.result,$op.text); })*
	| 'CREATE' e=expr ';' { $result = new Create($e.result); }
	| 'INSERT' 'INTO' e=expr ';' { $result = new Insert($e.result); }
	| 'UPDATE' e=expr ';' { $result = new Update($e.result); }
	| 'DELETE' e=expr ';' { $result = new Delete($e.result); }
	| 'COMMIT' i=ident ';' { $result = new Commit($i.result); }
	| 'ROLLBACK' i=ident ';' { $result = new Rollback($i.result); }
	| e=expr ';'  { $result = $e.result; }
	;

select returns [Select result]
	@init {ArrayList<ISelectElement> list = new ArrayList<ISelectElement>(); }
	:'SELECT' s=selectClause 'FROM' n=Ident (se=selectElements { list.add($se.result); })* ';' { $result = new Select($s.result, new Ident($n.text), list); }
	;
	
selectElements returns [ISelectElement result]
	: 'WHERE' e=expr { $result = new Where($e.result); }
	| 'GROUP' 'BY' s=selectClause { $result = new Group($s.result); }
	| 'ORDER' 'BY' s=selectClause { $result = new Order($s.result); }
	| 'LIMIT' e=expr { $result = new Limit($e.result); }
	| 'OFFSET' e=expr { $result = new Offset($e.result); }
	;

selectClause returns [SelectClause result]
	@init {ArrayList<IStatement> list = new ArrayList<IStatement>(); }
	: '{' j=json '}' { list.add($j.result); result = new SelectClause(list); }
	| '(' s=select ')' { list.add($s.result); result = new SelectClause(list); }
	| e=expr { list.add($e.result); } (',' sel=selectClause { list.addAll($sel.result.getList()); })* { $result = new SelectClause(list); } 
	;
	
json returns [JSONObject result]
	@init {ArrayList<JSONPair> list = new ArrayList<JSONPair>(); }
	:  (j=jsonpair { list.add($j.result); })* { $result = new JSONObject(list); }
	;
	
jsonpair returns [JSONPair result]
	: i=ident ':' e=expr { $result = new JSONPair($i.result,$e.result); }
	;
	
expr returns [Expr result]
	: l=andExpr { $result = $l.result; }
	;
	
andExpr returns [Expr result]
    :   left=orExpr { $result=$left.result; } ( '&&' right=orExpr { $result = new And($result, right); } )*
    ;
    

orExpr returns [Expr result]
    :   left=comparisonExpr { $result = $left.result; } ( '||' right=comparisonExpr { $result = new Or($result, right); } )*
    ;
	
comparisonExpr returns [Expr result]
    :   left=addExpr { $result=$left.result; } ( op=('<'|'<='|'>'|'>='|'=='|'!='|'<>') right=addExpr 
    { 
      if ($op.text.equals("<")) {
        $result = new LT($result, right);
      }
      if ($op.text.equals("<=")) {
        $result = new LEq($result, right);      
      }
      if ($op.text.equals(">")) {
        $result = new GT($result, right);
      }
      if ($op.text.equals(">=")) {
        $result = new GEq($result, right);      
      }
      if ($op.text.equals("==")) {
        $result = new Eq($result, right);
      }
      if ($op.text.equals("!=") || $op.text.equals("<>")) {
        $result = new NEq($result, right);
      }
    })*
    ;

addExpr returns [Expr result]
    :   left=mulExpr { $result=$left.result; } ( op=('+' | '-') right=mulExpr
    { 
      if ($op.text.equals("+")) {
        $result = new Add($result, right);
      }
      if ($op.text.equals("-")) {
        $result = new Sub($result, right);      
      }
    })*
    ;
    
mulExpr returns [Expr result]
    :   lhs=unExpr { $result=$lhs.result; } ( op=( '*' | '/' ) rhs=unExpr 
    { 
      if ($op.text.equals("*")) {
        $result = new Mul($result, rhs);
      }
      if ($op.text.equals("/")) {
        $result = new Div($result, rhs);      
      }
    })*
    ;
    
unExpr returns [Expr result]
    :  '+' x=unExpr { $result = new Pos($x.result); }
    |  '-' x=unExpr { $result = new Neg($x.result); }
    |  'NOT' x=unExpr { $result = new Not($x.result); }
    |  x=atomicalExpr    { $result = $x.result; }
    ;
		
atomicalExpr returns [Expr result]
	: Int { $result = new Int(Integer.parseInt($Int.text)); }
	| Str { $result = new Str($Str.text); }
	| Bool { $result = new Bool(Boolean.parseBoolean($Bool.text)); }
	| Ident { $result = new Ident($Ident.text); }
	| All { $result = new All(); }
	| '(' x=andExpr ')' { $result = $x.result; }
	;

ident returns [Ident result]
	: left=Ident { $result = new Ident($left.text); } ( '.' right=Ident { $result = new Loc($result, new Ident($right.text)); } )*
	;
    
// Tokens
WS  :	(' ' | '\t' | '\n' | '\r') { $channel=HIDDEN; }
    ;

COMMENT 
     : '/*' .* '*/' { $channel=HIDDEN; }
     | '//' .* '\n' { $channel=HIDDEN; }
    ;

Bool: ('true'|'True'|'TRUE'|'false'|'False'|'FALSE');

Ident:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.')*;

Int: ('0'..'9')+;

Str:   ('"' .* '"' | '“' .* '”');

All: '*';
