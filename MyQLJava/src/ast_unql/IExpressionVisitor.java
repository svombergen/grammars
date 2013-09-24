package ast_unql;

import ast_unql.binaryexpr.Add;
import ast_unql.binaryexpr.And;
import ast_unql.binaryexpr.Div;
import ast_unql.binaryexpr.Eq;
import ast_unql.binaryexpr.GEq;
import ast_unql.binaryexpr.GT;
import ast_unql.binaryexpr.LEq;
import ast_unql.binaryexpr.LT;
import ast_unql.binaryexpr.Mul;
import ast_unql.binaryexpr.NEq;
import ast_unql.binaryexpr.Or;
import ast_unql.binaryexpr.Sub;
import ast_unql.primaryexpr.Bool;
import ast_unql.primaryexpr.Ident;
import ast_unql.primaryexpr.Int;
import ast_unql.primaryexpr.Loc;
import ast_unql.primaryexpr.Str;
import ast_unql.unaryexpr.Neg;
import ast_unql.unaryexpr.Not;
import ast_unql.unaryexpr.Pos;

public interface IExpressionVisitor<T> {
	T visit(Add exp);	
	T visit(Div exp);	
	T visit(Mul exp);	
	T visit(Sub exp);	
	T visit(And exp);	
	T visit(Eq exp);	
	T visit(GEq exp);	
	T visit(GT exp);	
	T visit(LEq exp);	
	T visit(LT exp);	
	T visit(NEq exp);	
	T visit(Or exp);
	
	T visit(Neg exp);
	T visit(Pos exp);
	T visit(Not exp);
	
	T visit(Ident exp);
	T visit(Int exp);
	T visit(Str exp);
	T visit(Bool exp);
	T visit(Loc loc);
}
