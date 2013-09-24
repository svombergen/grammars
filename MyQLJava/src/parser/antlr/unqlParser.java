// $ANTLR 3.4 unql.g 2013-09-24 08:07:30

package parser.antlr;

import ast_unql.*;
import ast_unql.binaryexpr.*;
import ast_unql.primaryexpr.*;
import ast_unql.statement.*;
import ast_unql.transaction.*;
import ast_unql.unaryexpr.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class unqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "All", "Bool", "COMMENT", "Ident", "Int", "Str", "WS", "'!='", "'&&'", "'('", "')'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "';'", "'<'", "'<='", "'<>'", "'=='", "'>'", "'>='", "'BEGIN'", "'BY'", "'COMMIT'", "'CREATE'", "'DELETE'", "'END'", "'EXCEPT'", "'FROM'", "'GROUP'", "'INSERT'", "'INTERSECT'", "'INTO'", "'LIMIT'", "'NOT'", "'OFFSET'", "'ORDER'", "'ROLLBACK'", "'SELECT'", "'UNION ALL'", "'UPDATE'", "'WHERE'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int All=4;
    public static final int Bool=5;
    public static final int COMMENT=6;
    public static final int Ident=7;
    public static final int Int=8;
    public static final int Str=9;
    public static final int WS=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public unqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public unqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[60+1];
         

    }

    public String[] getTokenNames() { return unqlParser.tokenNames; }
    public String getGrammarFileName() { return "unql.g"; }


        @Override
        public void reportError(RecognitionException e) {
            throw new RuntimeException(e);
        }



    // $ANTLR start "transaction"
    // unql.g:28:1: transaction returns [Transaction result] : ( 'BEGIN' Ident (s= statement )* 'END' EOF | (s= statement )* EOF );
    public final Transaction transaction() throws RecognitionException {
        Transaction result = null;

        int transaction_StartIndex = input.index();

        Token Ident1=null;
        IStatement s =null;


        ArrayList<IStatement> list = new ArrayList<IStatement>(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return result; }

            // unql.g:30:2: ( 'BEGIN' Ident (s= statement )* 'END' EOF | (s= statement )* EOF )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||(LA3_0 >= All && LA3_0 <= Bool)||(LA3_0 >= Ident && LA3_0 <= Str)||LA3_0==13||LA3_0==15||LA3_0==17||(LA3_0 >= 30 && LA3_0 <= 32)||LA3_0==37||LA3_0==41||(LA3_0 >= 44 && LA3_0 <= 45)||LA3_0==47) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // unql.g:30:4: 'BEGIN' Ident (s= statement )* 'END' EOF
                    {
                    match(input,28,FOLLOW_28_in_transaction60); if (state.failed) return result;

                    Ident1=(Token)match(input,Ident,FOLLOW_Ident_in_transaction62); if (state.failed) return result;

                    // unql.g:30:18: (s= statement )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= All && LA1_0 <= Bool)||(LA1_0 >= Ident && LA1_0 <= Str)||LA1_0==13||LA1_0==15||LA1_0==17||(LA1_0 >= 30 && LA1_0 <= 32)||LA1_0==37||LA1_0==41||(LA1_0 >= 44 && LA1_0 <= 45)||LA1_0==47) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // unql.g:30:19: s= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_transaction67);
                    	    s=statement();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    if ( state.backtracking==0 ) {list.add(s);}

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match(input,33,FOLLOW_33_in_transaction73); if (state.failed) return result;

                    match(input,EOF,FOLLOW_EOF_in_transaction75); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Transactions(list, new Ident((Ident1!=null?Ident1.getText():null))); }

                    }
                    break;
                case 2 :
                    // unql.g:31:4: (s= statement )* EOF
                    {
                    // unql.g:31:4: (s= statement )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= All && LA2_0 <= Bool)||(LA2_0 >= Ident && LA2_0 <= Str)||LA2_0==13||LA2_0==15||LA2_0==17||(LA2_0 >= 30 && LA2_0 <= 32)||LA2_0==37||LA2_0==41||(LA2_0 >= 44 && LA2_0 <= 45)||LA2_0==47) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // unql.g:31:5: s= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_transaction85);
                    	    s=statement();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    if ( state.backtracking==0 ) {list.add(s);}

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_transaction91); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new StatementList(list); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, transaction_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "transaction"



    // $ANTLR start "statement"
    // unql.g:34:1: statement returns [IStatement result] : (s= select (op= ( 'UNION ALL' | 'INTERSECT' | 'EXCEPT' ) sel= select )* | 'CREATE' e= expr ';' | 'INSERT' 'INTO' e= expr ';' | 'UPDATE' e= expr ';' | 'DELETE' e= expr ';' | 'COMMIT' i= ident ';' | 'ROLLBACK' i= ident ';' |e= expr ';' );
    public final IStatement statement() throws RecognitionException {
        IStatement result = null;

        int statement_StartIndex = input.index();

        Token op=null;
        Select s =null;

        Select sel =null;

        Expr e =null;

        Ident i =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }

            // unql.g:35:2: (s= select (op= ( 'UNION ALL' | 'INTERSECT' | 'EXCEPT' ) sel= select )* | 'CREATE' e= expr ';' | 'INSERT' 'INTO' e= expr ';' | 'UPDATE' e= expr ';' | 'DELETE' e= expr ';' | 'COMMIT' i= ident ';' | 'ROLLBACK' i= ident ';' |e= expr ';' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            case 47:
                {
                alt5=4;
                }
                break;
            case 32:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            case 44:
                {
                alt5=7;
                }
                break;
            case All:
            case Bool:
            case Ident:
            case Int:
            case Str:
            case 13:
            case 15:
            case 17:
            case 41:
                {
                alt5=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // unql.g:35:4: s= select (op= ( 'UNION ALL' | 'INTERSECT' | 'EXCEPT' ) sel= select )*
                    {
                    pushFollow(FOLLOW_select_in_statement111);
                    s=select();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = s; }

                    // unql.g:35:38: (op= ( 'UNION ALL' | 'INTERSECT' | 'EXCEPT' ) sel= select )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==34||LA4_0==38||LA4_0==46) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // unql.g:35:39: op= ( 'UNION ALL' | 'INTERSECT' | 'EXCEPT' ) sel= select
                    	    {
                    	    op=(Token)input.LT(1);

                    	    if ( input.LA(1)==34||input.LA(1)==38||input.LA(1)==46 ) {
                    	        input.consume();
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return result;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_select_in_statement128);
                    	    sel=select();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    if ( state.backtracking==0 ) { result = new Compound(result,sel,(op!=null?op.getText():null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // unql.g:36:4: 'CREATE' e= expr ';'
                    {
                    match(input,31,FOLLOW_31_in_statement137); if (state.failed) return result;

                    pushFollow(FOLLOW_expr_in_statement141);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,21,FOLLOW_21_in_statement143); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Create(e); }

                    }
                    break;
                case 3 :
                    // unql.g:37:4: 'INSERT' 'INTO' e= expr ';'
                    {
                    match(input,37,FOLLOW_37_in_statement150); if (state.failed) return result;

                    match(input,39,FOLLOW_39_in_statement152); if (state.failed) return result;

                    pushFollow(FOLLOW_expr_in_statement156);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,21,FOLLOW_21_in_statement158); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Insert(e); }

                    }
                    break;
                case 4 :
                    // unql.g:38:4: 'UPDATE' e= expr ';'
                    {
                    match(input,47,FOLLOW_47_in_statement165); if (state.failed) return result;

                    pushFollow(FOLLOW_expr_in_statement169);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,21,FOLLOW_21_in_statement171); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Update(e); }

                    }
                    break;
                case 5 :
                    // unql.g:39:4: 'DELETE' e= expr ';'
                    {
                    match(input,32,FOLLOW_32_in_statement178); if (state.failed) return result;

                    pushFollow(FOLLOW_expr_in_statement182);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,21,FOLLOW_21_in_statement184); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Delete(e); }

                    }
                    break;
                case 6 :
                    // unql.g:40:4: 'COMMIT' i= ident ';'
                    {
                    match(input,30,FOLLOW_30_in_statement191); if (state.failed) return result;

                    pushFollow(FOLLOW_ident_in_statement195);
                    i=ident();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,21,FOLLOW_21_in_statement197); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Commit(i); }

                    }
                    break;
                case 7 :
                    // unql.g:41:4: 'ROLLBACK' i= ident ';'
                    {
                    match(input,44,FOLLOW_44_in_statement204); if (state.failed) return result;

                    pushFollow(FOLLOW_ident_in_statement208);
                    i=ident();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,21,FOLLOW_21_in_statement210); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Rollback(i); }

                    }
                    break;
                case 8 :
                    // unql.g:42:4: e= expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement219);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,21,FOLLOW_21_in_statement221); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = e; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "statement"



    // $ANTLR start "select"
    // unql.g:45:1: select returns [Select result] : 'SELECT' s= selectClause 'FROM' n= Ident (se= selectElements )* ';' ;
    public final Select select() throws RecognitionException {
        Select result = null;

        int select_StartIndex = input.index();

        Token n=null;
        SelectClause s =null;

        ISelectElement se =null;


        ArrayList<ISelectElement> list = new ArrayList<ISelectElement>(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }

            // unql.g:47:2: ( 'SELECT' s= selectClause 'FROM' n= Ident (se= selectElements )* ';' )
            // unql.g:47:3: 'SELECT' s= selectClause 'FROM' n= Ident (se= selectElements )* ';'
            {
            match(input,45,FOLLOW_45_in_select244); if (state.failed) return result;

            pushFollow(FOLLOW_selectClause_in_select248);
            s=selectClause();

            state._fsp--;
            if (state.failed) return result;

            match(input,35,FOLLOW_35_in_select250); if (state.failed) return result;

            n=(Token)match(input,Ident,FOLLOW_Ident_in_select254); if (state.failed) return result;

            // unql.g:47:42: (se= selectElements )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36||LA6_0==40||(LA6_0 >= 42 && LA6_0 <= 43)||LA6_0==48) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // unql.g:47:43: se= selectElements
            	    {
            	    pushFollow(FOLLOW_selectElements_in_select259);
            	    se=selectElements();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { list.add(se); }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,21,FOLLOW_21_in_select265); if (state.failed) return result;

            if ( state.backtracking==0 ) { result = new Select(s, new Ident((n!=null?n.getText():null)), list); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, select_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "select"



    // $ANTLR start "selectElements"
    // unql.g:50:1: selectElements returns [ISelectElement result] : ( 'WHERE' e= expr | 'GROUP' 'BY' s= selectClause | 'ORDER' 'BY' s= selectClause | 'LIMIT' e= expr | 'OFFSET' e= expr );
    public final ISelectElement selectElements() throws RecognitionException {
        ISelectElement result = null;

        int selectElements_StartIndex = input.index();

        Expr e =null;

        SelectClause s =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }

            // unql.g:51:2: ( 'WHERE' e= expr | 'GROUP' 'BY' s= selectClause | 'ORDER' 'BY' s= selectClause | 'LIMIT' e= expr | 'OFFSET' e= expr )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            case 42:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // unql.g:51:4: 'WHERE' e= expr
                    {
                    match(input,48,FOLLOW_48_in_selectElements283); if (state.failed) return result;

                    pushFollow(FOLLOW_expr_in_selectElements287);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Where(e); }

                    }
                    break;
                case 2 :
                    // unql.g:52:4: 'GROUP' 'BY' s= selectClause
                    {
                    match(input,36,FOLLOW_36_in_selectElements294); if (state.failed) return result;

                    match(input,29,FOLLOW_29_in_selectElements296); if (state.failed) return result;

                    pushFollow(FOLLOW_selectClause_in_selectElements300);
                    s=selectClause();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Group(s); }

                    }
                    break;
                case 3 :
                    // unql.g:53:4: 'ORDER' 'BY' s= selectClause
                    {
                    match(input,43,FOLLOW_43_in_selectElements307); if (state.failed) return result;

                    match(input,29,FOLLOW_29_in_selectElements309); if (state.failed) return result;

                    pushFollow(FOLLOW_selectClause_in_selectElements313);
                    s=selectClause();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Order(s); }

                    }
                    break;
                case 4 :
                    // unql.g:54:4: 'LIMIT' e= expr
                    {
                    match(input,40,FOLLOW_40_in_selectElements320); if (state.failed) return result;

                    pushFollow(FOLLOW_expr_in_selectElements324);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Limit(e); }

                    }
                    break;
                case 5 :
                    // unql.g:55:4: 'OFFSET' e= expr
                    {
                    match(input,42,FOLLOW_42_in_selectElements331); if (state.failed) return result;

                    pushFollow(FOLLOW_expr_in_selectElements335);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Offset(e); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, selectElements_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "selectElements"



    // $ANTLR start "selectClause"
    // unql.g:58:1: selectClause returns [SelectClause result] : ( '{' j= json '}' | '(' s= select ')' |e= expr ( ',' sel= selectClause )* );
    public final SelectClause selectClause() throws RecognitionException {
        SelectClause result = null;

        int selectClause_StartIndex = input.index();

        JSONObject j =null;

        Select s =null;

        Expr e =null;

        SelectClause sel =null;


        ArrayList<IStatement> list = new ArrayList<IStatement>(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }

            // unql.g:60:2: ( '{' j= json '}' | '(' s= select ')' |e= expr ( ',' sel= selectClause )* )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==45) ) {
                    alt9=2;
                }
                else if ( ((LA9_2 >= All && LA9_2 <= Bool)||(LA9_2 >= Ident && LA9_2 <= Str)||LA9_2==13||LA9_2==15||LA9_2==17||LA9_2==41) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case All:
            case Bool:
            case Ident:
            case Int:
            case Str:
            case 15:
            case 17:
            case 41:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // unql.g:60:4: '{' j= json '}'
                    {
                    match(input,49,FOLLOW_49_in_selectClause358); if (state.failed) return result;

                    pushFollow(FOLLOW_json_in_selectClause362);
                    j=json();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,51,FOLLOW_51_in_selectClause364); if (state.failed) return result;

                    if ( state.backtracking==0 ) { list.add(j); result = new SelectClause(list); }

                    }
                    break;
                case 2 :
                    // unql.g:61:4: '(' s= select ')'
                    {
                    match(input,13,FOLLOW_13_in_selectClause371); if (state.failed) return result;

                    pushFollow(FOLLOW_select_in_selectClause375);
                    s=select();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,14,FOLLOW_14_in_selectClause377); if (state.failed) return result;

                    if ( state.backtracking==0 ) { list.add(s); result = new SelectClause(list); }

                    }
                    break;
                case 3 :
                    // unql.g:62:4: e= expr ( ',' sel= selectClause )*
                    {
                    pushFollow(FOLLOW_expr_in_selectClause386);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { list.add(e); }

                    // unql.g:62:36: ( ',' sel= selectClause )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            int LA8_2 = input.LA(2);

                            if ( (synpred21_unql()) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // unql.g:62:37: ',' sel= selectClause
                    	    {
                    	    match(input,16,FOLLOW_16_in_selectClause391); if (state.failed) return result;

                    	    pushFollow(FOLLOW_selectClause_in_selectClause395);
                    	    sel=selectClause();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    if ( state.backtracking==0 ) { list.addAll(sel.getList()); }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { result = new SelectClause(list); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, selectClause_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "selectClause"



    // $ANTLR start "json"
    // unql.g:65:1: json returns [JSONObject result] : (j= jsonpair )* ;
    public final JSONObject json() throws RecognitionException {
        JSONObject result = null;

        int json_StartIndex = input.index();

        JSONPair j =null;


        ArrayList<JSONPair> list = new ArrayList<JSONPair>(); 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }

            // unql.g:67:2: ( (j= jsonpair )* )
            // unql.g:67:5: (j= jsonpair )*
            {
            // unql.g:67:5: (j= jsonpair )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Ident) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // unql.g:67:6: j= jsonpair
            	    {
            	    pushFollow(FOLLOW_jsonpair_in_json428);
            	    j=jsonpair();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { list.add(j); }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            if ( state.backtracking==0 ) { result = new JSONObject(list); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, json_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "json"



    // $ANTLR start "jsonpair"
    // unql.g:70:1: jsonpair returns [JSONPair result] : i= ident ':' e= expr ;
    public final JSONPair jsonpair() throws RecognitionException {
        JSONPair result = null;

        int jsonpair_StartIndex = input.index();

        Ident i =null;

        Expr e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }

            // unql.g:71:2: (i= ident ':' e= expr )
            // unql.g:71:4: i= ident ':' e= expr
            {
            pushFollow(FOLLOW_ident_in_jsonpair452);
            i=ident();

            state._fsp--;
            if (state.failed) return result;

            match(input,20,FOLLOW_20_in_jsonpair454); if (state.failed) return result;

            pushFollow(FOLLOW_expr_in_jsonpair458);
            e=expr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = new JSONPair(i,e); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, jsonpair_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "jsonpair"



    // $ANTLR start "expr"
    // unql.g:74:1: expr returns [Expr result] : l= andExpr ;
    public final Expr expr() throws RecognitionException {
        Expr result = null;

        int expr_StartIndex = input.index();

        Expr l =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }

            // unql.g:75:2: (l= andExpr )
            // unql.g:75:4: l= andExpr
            {
            pushFollow(FOLLOW_andExpr_in_expr478);
            l=andExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = l; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, expr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "expr"



    // $ANTLR start "andExpr"
    // unql.g:78:1: andExpr returns [Expr result] : left= orExpr ( '&&' right= orExpr )* ;
    public final Expr andExpr() throws RecognitionException {
        Expr result = null;

        int andExpr_StartIndex = input.index();

        Expr left =null;

        Expr right =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }

            // unql.g:79:5: (left= orExpr ( '&&' right= orExpr )* )
            // unql.g:79:9: left= orExpr ( '&&' right= orExpr )*
            {
            pushFollow(FOLLOW_orExpr_in_andExpr503);
            left=orExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =left; }

            // unql.g:79:47: ( '&&' right= orExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // unql.g:79:49: '&&' right= orExpr
            	    {
            	    match(input,12,FOLLOW_12_in_andExpr509); if (state.failed) return result;

            	    pushFollow(FOLLOW_orExpr_in_andExpr513);
            	    right=orExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result = new And(result, right); }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, andExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "orExpr"
    // unql.g:83:1: orExpr returns [Expr result] : left= comparisonExpr ( '||' right= comparisonExpr )* ;
    public final Expr orExpr() throws RecognitionException {
        Expr result = null;

        int orExpr_StartIndex = input.index();

        Expr left =null;

        Expr right =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }

            // unql.g:84:5: (left= comparisonExpr ( '||' right= comparisonExpr )* )
            // unql.g:84:9: left= comparisonExpr ( '||' right= comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_orExpr548);
            left=comparisonExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result = left; }

            // unql.g:84:57: ( '||' right= comparisonExpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==50) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // unql.g:84:59: '||' right= comparisonExpr
            	    {
            	    match(input,50,FOLLOW_50_in_orExpr554); if (state.failed) return result;

            	    pushFollow(FOLLOW_comparisonExpr_in_orExpr558);
            	    right=comparisonExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result = new Or(result, right); }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, orExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "comparisonExpr"
    // unql.g:87:1: comparisonExpr returns [Expr result] : left= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' | '<>' ) right= addExpr )* ;
    public final Expr comparisonExpr() throws RecognitionException {
        Expr result = null;

        int comparisonExpr_StartIndex = input.index();

        Token op=null;
        Expr left =null;

        Expr right =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }

            // unql.g:88:5: (left= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' | '<>' ) right= addExpr )* )
            // unql.g:88:9: left= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' | '<>' ) right= addExpr )*
            {
            pushFollow(FOLLOW_addExpr_in_comparisonExpr589);
            left=addExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =left; }

            // unql.g:88:48: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' | '<>' ) right= addExpr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11||(LA13_0 >= 22 && LA13_0 <= 27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // unql.g:88:50: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' | '<>' ) right= addExpr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==11||(input.LA(1) >= 22 && input.LA(1) <= 27) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_addExpr_in_comparisonExpr615);
            	    right=addExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { 
            	          if ((op!=null?op.getText():null).equals("<")) {
            	            result = new LT(result, right);
            	          }
            	          if ((op!=null?op.getText():null).equals("<=")) {
            	            result = new LEq(result, right);      
            	          }
            	          if ((op!=null?op.getText():null).equals(">")) {
            	            result = new GT(result, right);
            	          }
            	          if ((op!=null?op.getText():null).equals(">=")) {
            	            result = new GEq(result, right);      
            	          }
            	          if ((op!=null?op.getText():null).equals("==")) {
            	            result = new Eq(result, right);
            	          }
            	          if ((op!=null?op.getText():null).equals("!=") || (op!=null?op.getText():null).equals("<>")) {
            	            result = new NEq(result, right);
            	          }
            	        }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, comparisonExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "comparisonExpr"



    // $ANTLR start "addExpr"
    // unql.g:111:1: addExpr returns [Expr result] : left= mulExpr (op= ( '+' | '-' ) right= mulExpr )* ;
    public final Expr addExpr() throws RecognitionException {
        Expr result = null;

        int addExpr_StartIndex = input.index();

        Token op=null;
        Expr left =null;

        Expr right =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }

            // unql.g:112:5: (left= mulExpr (op= ( '+' | '-' ) right= mulExpr )* )
            // unql.g:112:9: left= mulExpr (op= ( '+' | '-' ) right= mulExpr )*
            {
            pushFollow(FOLLOW_mulExpr_in_addExpr649);
            left=mulExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =left; }

            // unql.g:112:48: (op= ( '+' | '-' ) right= mulExpr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15||LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // unql.g:112:50: op= ( '+' | '-' ) right= mulExpr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==15||input.LA(1)==17 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mulExpr_in_addExpr667);
            	    right=mulExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { 
            	          if ((op!=null?op.getText():null).equals("+")) {
            	            result = new Add(result, right);
            	          }
            	          if ((op!=null?op.getText():null).equals("-")) {
            	            result = new Sub(result, right);      
            	          }
            	        }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, addExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "addExpr"



    // $ANTLR start "mulExpr"
    // unql.g:123:1: mulExpr returns [Expr result] : lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* ;
    public final Expr mulExpr() throws RecognitionException {
        Expr result = null;

        int mulExpr_StartIndex = input.index();

        Token op=null;
        Expr lhs =null;

        Expr rhs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }

            // unql.g:124:5: (lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* )
            // unql.g:124:9: lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )*
            {
            pushFollow(FOLLOW_unExpr_in_mulExpr704);
            lhs=unExpr();

            state._fsp--;
            if (state.failed) return result;

            if ( state.backtracking==0 ) { result =lhs; }

            // unql.g:124:45: (op= ( '*' | '/' ) rhs= unExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==All||LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // unql.g:124:47: op= ( '*' | '/' ) rhs= unExpr
            	    {
            	    op=(Token)input.LT(1);

            	    if ( input.LA(1)==All||input.LA(1)==19 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unExpr_in_mulExpr724);
            	    rhs=unExpr();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    if ( state.backtracking==0 ) { 
            	          if ((op!=null?op.getText():null).equals("*")) {
            	            result = new Mul(result, rhs);
            	          }
            	          if ((op!=null?op.getText():null).equals("/")) {
            	            result = new Div(result, rhs);      
            	          }
            	        }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, mulExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "mulExpr"



    // $ANTLR start "unExpr"
    // unql.g:135:1: unExpr returns [Expr result] : ( '+' x= unExpr | '-' x= unExpr | 'NOT' x= unExpr |x= atomicalExpr );
    public final Expr unExpr() throws RecognitionException {
        Expr result = null;

        int unExpr_StartIndex = input.index();

        Expr x =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }

            // unql.g:136:5: ( '+' x= unExpr | '-' x= unExpr | 'NOT' x= unExpr |x= atomicalExpr )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt16=1;
                }
                break;
            case 17:
                {
                alt16=2;
                }
                break;
            case 41:
                {
                alt16=3;
                }
                break;
            case All:
            case Bool:
            case Ident:
            case Int:
            case Str:
            case 13:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // unql.g:136:8: '+' x= unExpr
                    {
                    match(input,15,FOLLOW_15_in_unExpr759); if (state.failed) return result;

                    pushFollow(FOLLOW_unExpr_in_unExpr763);
                    x=unExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Pos(x); }

                    }
                    break;
                case 2 :
                    // unql.g:137:8: '-' x= unExpr
                    {
                    match(input,17,FOLLOW_17_in_unExpr774); if (state.failed) return result;

                    pushFollow(FOLLOW_unExpr_in_unExpr778);
                    x=unExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Neg(x); }

                    }
                    break;
                case 3 :
                    // unql.g:138:8: 'NOT' x= unExpr
                    {
                    match(input,41,FOLLOW_41_in_unExpr789); if (state.failed) return result;

                    pushFollow(FOLLOW_unExpr_in_unExpr793);
                    x=unExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Not(x); }

                    }
                    break;
                case 4 :
                    // unql.g:139:8: x= atomicalExpr
                    {
                    pushFollow(FOLLOW_atomicalExpr_in_unExpr806);
                    x=atomicalExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = x; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, unExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "unExpr"



    // $ANTLR start "atomicalExpr"
    // unql.g:142:1: atomicalExpr returns [Expr result] : ( Int | Str | Bool | Ident | All | '(' x= andExpr ')' );
    public final Expr atomicalExpr() throws RecognitionException {
        Expr result = null;

        int atomicalExpr_StartIndex = input.index();

        Token Int2=null;
        Token Str3=null;
        Token Bool4=null;
        Token Ident5=null;
        Expr x =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }

            // unql.g:143:2: ( Int | Str | Bool | Ident | All | '(' x= andExpr ')' )
            int alt17=6;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt17=1;
                }
                break;
            case Str:
                {
                alt17=2;
                }
                break;
            case Bool:
                {
                alt17=3;
                }
                break;
            case Ident:
                {
                alt17=4;
                }
                break;
            case All:
                {
                alt17=5;
                }
                break;
            case 13:
                {
                alt17=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // unql.g:143:4: Int
                    {
                    Int2=(Token)match(input,Int,FOLLOW_Int_in_atomicalExpr831); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Int(Integer.parseInt((Int2!=null?Int2.getText():null))); }

                    }
                    break;
                case 2 :
                    // unql.g:144:4: Str
                    {
                    Str3=(Token)match(input,Str,FOLLOW_Str_in_atomicalExpr838); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Str((Str3!=null?Str3.getText():null)); }

                    }
                    break;
                case 3 :
                    // unql.g:145:4: Bool
                    {
                    Bool4=(Token)match(input,Bool,FOLLOW_Bool_in_atomicalExpr845); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Bool(Boolean.parseBoolean((Bool4!=null?Bool4.getText():null))); }

                    }
                    break;
                case 4 :
                    // unql.g:146:4: Ident
                    {
                    Ident5=(Token)match(input,Ident,FOLLOW_Ident_in_atomicalExpr852); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new Ident((Ident5!=null?Ident5.getText():null)); }

                    }
                    break;
                case 5 :
                    // unql.g:147:4: All
                    {
                    match(input,All,FOLLOW_All_in_atomicalExpr859); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = new All(); }

                    }
                    break;
                case 6 :
                    // unql.g:148:4: '(' x= andExpr ')'
                    {
                    match(input,13,FOLLOW_13_in_atomicalExpr866); if (state.failed) return result;

                    pushFollow(FOLLOW_andExpr_in_atomicalExpr870);
                    x=andExpr();

                    state._fsp--;
                    if (state.failed) return result;

                    match(input,14,FOLLOW_14_in_atomicalExpr872); if (state.failed) return result;

                    if ( state.backtracking==0 ) { result = x; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, atomicalExpr_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "atomicalExpr"



    // $ANTLR start "ident"
    // unql.g:151:1: ident returns [Ident result] : left= Ident ( '.' right= Ident )* ;
    public final Ident ident() throws RecognitionException {
        Ident result = null;

        int ident_StartIndex = input.index();

        Token left=null;
        Token right=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }

            // unql.g:152:2: (left= Ident ( '.' right= Ident )* )
            // unql.g:152:4: left= Ident ( '.' right= Ident )*
            {
            left=(Token)match(input,Ident,FOLLOW_Ident_in_ident891); if (state.failed) return result;

            if ( state.backtracking==0 ) { result = new Ident((left!=null?left.getText():null)); }

            // unql.g:152:52: ( '.' right= Ident )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // unql.g:152:54: '.' right= Ident
            	    {
            	    match(input,18,FOLLOW_18_in_ident897); if (state.failed) return result;

            	    right=(Token)match(input,Ident,FOLLOW_Ident_in_ident901); if (state.failed) return result;

            	    if ( state.backtracking==0 ) { result = new Loc(result, new Ident((right!=null?right.getText():null))); }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, ident_StartIndex); }

        }
        return result;
    }
    // $ANTLR end "ident"

    // $ANTLR start synpred21_unql
    public final void synpred21_unql_fragment() throws RecognitionException {
        SelectClause sel =null;


        // unql.g:62:37: ( ',' sel= selectClause )
        // unql.g:62:37: ',' sel= selectClause
        {
        match(input,16,FOLLOW_16_in_synpred21_unql391); if (state.failed) return ;

        pushFollow(FOLLOW_selectClause_in_synpred21_unql395);
        sel=selectClause();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_unql

    // Delegated rules

    public final boolean synpred21_unql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_unql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_28_in_transaction60 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Ident_in_transaction62 = new BitSet(new long[]{0x0000B223C002A3B0L});
    public static final BitSet FOLLOW_statement_in_transaction67 = new BitSet(new long[]{0x0000B223C002A3B0L});
    public static final BitSet FOLLOW_33_in_transaction73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_transaction75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_transaction85 = new BitSet(new long[]{0x0000B221C002A3B0L});
    public static final BitSet FOLLOW_EOF_in_transaction91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_statement111 = new BitSet(new long[]{0x0000404400000002L});
    public static final BitSet FOLLOW_set_in_statement118 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_select_in_statement128 = new BitSet(new long[]{0x0000404400000002L});
    public static final BitSet FOLLOW_31_in_statement137 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_statement141 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement150 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_statement152 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_statement156 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_statement165 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_statement169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_statement178 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_statement182 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_statement191 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ident_in_statement195 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_statement204 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ident_in_statement208 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_select244 = new BitSet(new long[]{0x000202000002A3B0L});
    public static final BitSet FOLLOW_selectClause_in_select248 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_select250 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Ident_in_select254 = new BitSet(new long[]{0x00010D1000200000L});
    public static final BitSet FOLLOW_selectElements_in_select259 = new BitSet(new long[]{0x00010D1000200000L});
    public static final BitSet FOLLOW_21_in_select265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_selectElements283 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_selectElements287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_selectElements294 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_selectElements296 = new BitSet(new long[]{0x000202000002A3B0L});
    public static final BitSet FOLLOW_selectClause_in_selectElements300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_selectElements307 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_selectElements309 = new BitSet(new long[]{0x000202000002A3B0L});
    public static final BitSet FOLLOW_selectClause_in_selectElements313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_selectElements320 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_selectElements324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_selectElements331 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_selectElements335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_selectClause358 = new BitSet(new long[]{0x0008000000000080L});
    public static final BitSet FOLLOW_json_in_selectClause362 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_selectClause364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_selectClause371 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_select_in_selectClause375 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_selectClause377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_selectClause386 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_selectClause391 = new BitSet(new long[]{0x000202000002A3B0L});
    public static final BitSet FOLLOW_selectClause_in_selectClause395 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_jsonpair_in_json428 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ident_in_jsonpair452 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_jsonpair454 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_expr_in_jsonpair458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_expr478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_andExpr503 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_andExpr509 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_orExpr_in_andExpr513 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_comparisonExpr_in_orExpr548 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_orExpr554 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_comparisonExpr_in_orExpr558 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_addExpr_in_comparisonExpr589 = new BitSet(new long[]{0x000000000FC00802L});
    public static final BitSet FOLLOW_set_in_comparisonExpr597 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_addExpr_in_comparisonExpr615 = new BitSet(new long[]{0x000000000FC00802L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr649 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_set_in_addExpr657 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr667 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_unExpr_in_mulExpr704 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_set_in_mulExpr712 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_unExpr_in_mulExpr724 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_15_in_unExpr759 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_unExpr_in_unExpr763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_unExpr774 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_unExpr_in_unExpr778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_unExpr789 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_unExpr_in_unExpr793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicalExpr_in_unExpr806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_atomicalExpr831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Str_in_atomicalExpr838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_atomicalExpr845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ident_in_atomicalExpr852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_All_in_atomicalExpr859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atomicalExpr866 = new BitSet(new long[]{0x000002000002A3B0L});
    public static final BitSet FOLLOW_andExpr_in_atomicalExpr870 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atomicalExpr872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ident_in_ident891 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ident897 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Ident_in_ident901 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16_in_synpred21_unql391 = new BitSet(new long[]{0x000202000002A3B0L});
    public static final BitSet FOLLOW_selectClause_in_synpred21_unql395 = new BitSet(new long[]{0x0000000000000002L});

}