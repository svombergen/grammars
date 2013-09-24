// $ANTLR 3.4 unql.g 2013-09-24 08:07:31

package parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class unqlLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public unqlLexer() {} 
    public unqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public unqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "unql.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:6:7: ( '!=' )
            // unql.g:6:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:7:7: ( '&&' )
            // unql.g:7:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:8:7: ( '(' )
            // unql.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:9:7: ( ')' )
            // unql.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:10:7: ( '+' )
            // unql.g:10:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:11:7: ( ',' )
            // unql.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:12:7: ( '-' )
            // unql.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:13:7: ( '.' )
            // unql.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:14:7: ( '/' )
            // unql.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:15:7: ( ':' )
            // unql.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:16:7: ( ';' )
            // unql.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:17:7: ( '<' )
            // unql.g:17:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:18:7: ( '<=' )
            // unql.g:18:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:19:7: ( '<>' )
            // unql.g:19:9: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:20:7: ( '==' )
            // unql.g:20:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:21:7: ( '>' )
            // unql.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:22:7: ( '>=' )
            // unql.g:22:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:23:7: ( 'BEGIN' )
            // unql.g:23:9: 'BEGIN'
            {
            match("BEGIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:24:7: ( 'BY' )
            // unql.g:24:9: 'BY'
            {
            match("BY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:25:7: ( 'COMMIT' )
            // unql.g:25:9: 'COMMIT'
            {
            match("COMMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:26:7: ( 'CREATE' )
            // unql.g:26:9: 'CREATE'
            {
            match("CREATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:27:7: ( 'DELETE' )
            // unql.g:27:9: 'DELETE'
            {
            match("DELETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:28:7: ( 'END' )
            // unql.g:28:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:29:7: ( 'EXCEPT' )
            // unql.g:29:9: 'EXCEPT'
            {
            match("EXCEPT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:30:7: ( 'FROM' )
            // unql.g:30:9: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:31:7: ( 'GROUP' )
            // unql.g:31:9: 'GROUP'
            {
            match("GROUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:32:7: ( 'INSERT' )
            // unql.g:32:9: 'INSERT'
            {
            match("INSERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:33:7: ( 'INTERSECT' )
            // unql.g:33:9: 'INTERSECT'
            {
            match("INTERSECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:34:7: ( 'INTO' )
            // unql.g:34:9: 'INTO'
            {
            match("INTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:35:7: ( 'LIMIT' )
            // unql.g:35:9: 'LIMIT'
            {
            match("LIMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:36:7: ( 'NOT' )
            // unql.g:36:9: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:37:7: ( 'OFFSET' )
            // unql.g:37:9: 'OFFSET'
            {
            match("OFFSET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:38:7: ( 'ORDER' )
            // unql.g:38:9: 'ORDER'
            {
            match("ORDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:39:7: ( 'ROLLBACK' )
            // unql.g:39:9: 'ROLLBACK'
            {
            match("ROLLBACK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:40:7: ( 'SELECT' )
            // unql.g:40:9: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:41:7: ( 'UNION ALL' )
            // unql.g:41:9: 'UNION ALL'
            {
            match("UNION ALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:42:7: ( 'UPDATE' )
            // unql.g:42:9: 'UPDATE'
            {
            match("UPDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:43:7: ( 'WHERE' )
            // unql.g:43:9: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:44:7: ( '{' )
            // unql.g:44:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:45:7: ( '||' )
            // unql.g:45:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:46:7: ( '}' )
            // unql.g:46:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:156:5: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // unql.g:156:7: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:160:6: ( '/*' ( . )* '*/' | '//' ( . )* '\\n' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='/') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='*') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='/') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // unql.g:160:8: '/*' ( . )* '*/'
                    {
                    match("/*"); 



                    // unql.g:160:13: ( . )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='*') ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1=='/') ) {
                                alt1=2;
                            }
                            else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
                                alt1=1;
                            }


                        }
                        else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // unql.g:160:13: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match("*/"); 



                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // unql.g:161:8: '//' ( . )* '\\n'
                    {
                    match("//"); 



                    // unql.g:161:13: ( . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\n') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // unql.g:161:13: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match('\n'); 

                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:164:5: ( ( 'true' | 'True' | 'TRUE' | 'false' | 'False' | 'FALSE' ) )
            // unql.g:164:7: ( 'true' | 'True' | 'TRUE' | 'false' | 'False' | 'FALSE' )
            {
            // unql.g:164:7: ( 'true' | 'True' | 'TRUE' | 'false' | 'False' | 'FALSE' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt4=1;
                }
                break;
            case 'T':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='r') ) {
                    alt4=2;
                }
                else if ( (LA4_2=='R') ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'f':
                {
                alt4=4;
                }
                break;
            case 'F':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='a') ) {
                    alt4=5;
                }
                else if ( (LA4_4=='A') ) {
                    alt4=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // unql.g:164:8: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // unql.g:164:15: 'True'
                    {
                    match("True"); 



                    }
                    break;
                case 3 :
                    // unql.g:164:22: 'TRUE'
                    {
                    match("TRUE"); 



                    }
                    break;
                case 4 :
                    // unql.g:164:29: 'false'
                    {
                    match("false"); 



                    }
                    break;
                case 5 :
                    // unql.g:164:37: 'False'
                    {
                    match("False"); 



                    }
                    break;
                case 6 :
                    // unql.g:164:45: 'FALSE'
                    {
                    match("FALSE"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Ident"
    public final void mIdent() throws RecognitionException {
        try {
            int _type = Ident;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:166:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )
            // unql.g:166:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // unql.g:166:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // unql.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Ident"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:168:4: ( ( '0' .. '9' )+ )
            // unql.g:168:6: ( '0' .. '9' )+
            {
            // unql.g:168:6: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // unql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Str"
    public final void mStr() throws RecognitionException {
        try {
            int _type = Str;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:170:4: ( ( '\"' ( . )* '\"' | '“' ( . )* '”' ) )
            // unql.g:170:8: ( '\"' ( . )* '\"' | '“' ( . )* '”' )
            {
            // unql.g:170:8: ( '\"' ( . )* '\"' | '“' ( . )* '”' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\u201C') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // unql.g:170:9: '\"' ( . )* '\"'
                    {
                    match('\"'); 

                    // unql.g:170:13: ( . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\"') ) {
                            alt7=2;
                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // unql.g:170:13: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // unql.g:170:22: '“' ( . )* '”'
                    {
                    match('\u201C'); 

                    // unql.g:170:26: ( . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\u201D') ) {
                            alt8=2;
                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\u201C')||(LA8_0 >= '\u201E' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // unql.g:170:26: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match('\u201D'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Str"

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // unql.g:172:4: ( '*' )
            // unql.g:172:6: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "All"

    public void mTokens() throws RecognitionException {
        // unql.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | WS | COMMENT | Bool | Ident | Int | Str | All )
        int alt10=48;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // unql.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // unql.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // unql.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // unql.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // unql.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // unql.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // unql.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // unql.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // unql.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // unql.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // unql.g:1:70: T__21
                {
                mT__21(); 


                }
                break;
            case 12 :
                // unql.g:1:76: T__22
                {
                mT__22(); 


                }
                break;
            case 13 :
                // unql.g:1:82: T__23
                {
                mT__23(); 


                }
                break;
            case 14 :
                // unql.g:1:88: T__24
                {
                mT__24(); 


                }
                break;
            case 15 :
                // unql.g:1:94: T__25
                {
                mT__25(); 


                }
                break;
            case 16 :
                // unql.g:1:100: T__26
                {
                mT__26(); 


                }
                break;
            case 17 :
                // unql.g:1:106: T__27
                {
                mT__27(); 


                }
                break;
            case 18 :
                // unql.g:1:112: T__28
                {
                mT__28(); 


                }
                break;
            case 19 :
                // unql.g:1:118: T__29
                {
                mT__29(); 


                }
                break;
            case 20 :
                // unql.g:1:124: T__30
                {
                mT__30(); 


                }
                break;
            case 21 :
                // unql.g:1:130: T__31
                {
                mT__31(); 


                }
                break;
            case 22 :
                // unql.g:1:136: T__32
                {
                mT__32(); 


                }
                break;
            case 23 :
                // unql.g:1:142: T__33
                {
                mT__33(); 


                }
                break;
            case 24 :
                // unql.g:1:148: T__34
                {
                mT__34(); 


                }
                break;
            case 25 :
                // unql.g:1:154: T__35
                {
                mT__35(); 


                }
                break;
            case 26 :
                // unql.g:1:160: T__36
                {
                mT__36(); 


                }
                break;
            case 27 :
                // unql.g:1:166: T__37
                {
                mT__37(); 


                }
                break;
            case 28 :
                // unql.g:1:172: T__38
                {
                mT__38(); 


                }
                break;
            case 29 :
                // unql.g:1:178: T__39
                {
                mT__39(); 


                }
                break;
            case 30 :
                // unql.g:1:184: T__40
                {
                mT__40(); 


                }
                break;
            case 31 :
                // unql.g:1:190: T__41
                {
                mT__41(); 


                }
                break;
            case 32 :
                // unql.g:1:196: T__42
                {
                mT__42(); 


                }
                break;
            case 33 :
                // unql.g:1:202: T__43
                {
                mT__43(); 


                }
                break;
            case 34 :
                // unql.g:1:208: T__44
                {
                mT__44(); 


                }
                break;
            case 35 :
                // unql.g:1:214: T__45
                {
                mT__45(); 


                }
                break;
            case 36 :
                // unql.g:1:220: T__46
                {
                mT__46(); 


                }
                break;
            case 37 :
                // unql.g:1:226: T__47
                {
                mT__47(); 


                }
                break;
            case 38 :
                // unql.g:1:232: T__48
                {
                mT__48(); 


                }
                break;
            case 39 :
                // unql.g:1:238: T__49
                {
                mT__49(); 


                }
                break;
            case 40 :
                // unql.g:1:244: T__50
                {
                mT__50(); 


                }
                break;
            case 41 :
                // unql.g:1:250: T__51
                {
                mT__51(); 


                }
                break;
            case 42 :
                // unql.g:1:256: WS
                {
                mWS(); 


                }
                break;
            case 43 :
                // unql.g:1:259: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 44 :
                // unql.g:1:267: Bool
                {
                mBool(); 


                }
                break;
            case 45 :
                // unql.g:1:272: Ident
                {
                mIdent(); 


                }
                break;
            case 46 :
                // unql.g:1:278: Int
                {
                mInt(); 


                }
                break;
            case 47 :
                // unql.g:1:282: Str
                {
                mStr(); 


                }
                break;
            case 48 :
                // unql.g:1:286: All
                {
                mAll(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\11\uffff\1\51\2\uffff\1\54\1\uffff\1\56\16\44\4\uffff\3\44\13\uffff"+
        "\1\44\1\111\30\44\1\uffff\3\44\1\146\10\44\1\160\17\44\1\uffff\1"+
        "\44\1\u0081\5\44\1\u0087\1\44\1\uffff\7\44\3\u0090\1\44\1\u0092"+
        "\4\44\1\uffff\2\u0090\1\u0097\2\44\1\uffff\1\u009a\1\44\1\u009c"+
        "\4\44\1\u00a1\1\uffff\1\u0090\1\uffff\1\u00a2\1\u00a3\1\u00a4\1"+
        "\u00a5\1\uffff\1\u00a6\1\44\1\uffff\1\u00a8\1\uffff\1\44\1\u00aa"+
        "\1\uffff\1\u00ab\6\uffff\1\44\1\uffff\1\44\2\uffff\1\44\1\u00af"+
        "\1\u00b0\2\uffff";
    static final String DFA10_eofS =
        "\u00b1\uffff";
    static final String DFA10_minS =
        "\1\11\10\uffff\1\52\2\uffff\1\75\1\uffff\1\75\1\105\1\117\1\105"+
        "\1\116\1\101\1\122\1\116\1\111\1\117\1\106\1\117\1\105\1\116\1\110"+
        "\4\uffff\1\162\1\122\1\141\13\uffff\1\107\1\56\1\115\1\105\1\114"+
        "\1\104\1\103\1\117\1\154\1\114\1\117\1\123\1\115\1\124\1\106\1\104"+
        "\2\114\1\111\1\104\1\105\2\165\1\125\1\154\1\111\1\uffff\1\115\1"+
        "\101\1\105\1\56\1\105\1\115\1\163\1\123\1\125\2\105\1\111\1\56\1"+
        "\123\1\105\1\114\1\105\1\117\1\101\1\122\2\145\1\105\1\163\1\116"+
        "\1\111\2\124\1\uffff\1\120\1\56\1\145\1\105\1\120\2\122\1\56\1\124"+
        "\1\uffff\1\105\1\122\1\102\1\103\1\116\1\124\1\105\3\56\1\145\1"+
        "\56\1\124\2\105\1\124\1\uffff\3\56\1\124\1\123\1\uffff\1\56\1\124"+
        "\1\56\1\101\1\124\1\40\1\105\1\56\1\uffff\1\56\1\uffff\4\56\1\uffff"+
        "\1\56\1\105\1\uffff\1\56\1\uffff\1\103\1\56\1\uffff\1\56\6\uffff"+
        "\1\103\1\uffff\1\113\2\uffff\1\124\2\56\2\uffff";
    static final String DFA10_maxS =
        "\1\u201c\10\uffff\1\57\2\uffff\1\76\1\uffff\1\75\1\131\1\122\1\105"+
        "\1\130\1\141\1\122\1\116\1\111\1\117\1\122\1\117\1\105\1\120\1\110"+
        "\4\uffff\2\162\1\141\13\uffff\1\107\1\172\1\115\1\105\1\114\1\104"+
        "\1\103\1\117\1\154\1\114\1\117\1\124\1\115\1\124\1\106\1\104\2\114"+
        "\1\111\1\104\1\105\2\165\1\125\1\154\1\111\1\uffff\1\115\1\101\1"+
        "\105\1\172\1\105\1\115\1\163\1\123\1\125\1\105\1\117\1\111\1\172"+
        "\1\123\1\105\1\114\1\105\1\117\1\101\1\122\2\145\1\105\1\163\1\116"+
        "\1\111\2\124\1\uffff\1\120\1\172\1\145\1\105\1\120\2\122\1\172\1"+
        "\124\1\uffff\1\105\1\122\1\102\1\103\1\116\1\124\1\105\3\172\1\145"+
        "\1\172\1\124\2\105\1\124\1\uffff\3\172\1\124\1\123\1\uffff\1\172"+
        "\1\124\1\172\1\101\1\124\1\40\1\105\1\172\1\uffff\1\172\1\uffff"+
        "\4\172\1\uffff\1\172\1\105\1\uffff\1\172\1\uffff\1\103\1\172\1\uffff"+
        "\1\172\6\uffff\1\103\1\uffff\1\113\2\uffff\1\124\2\172\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\uffff"+
        "\1\17\17\uffff\1\47\1\50\1\51\1\52\3\uffff\1\55\1\56\1\57\1\60\1"+
        "\53\1\11\1\15\1\16\1\14\1\21\1\20\32\uffff\1\23\34\uffff\1\27\11"+
        "\uffff\1\37\20\uffff\1\31\5\uffff\1\35\10\uffff\1\54\1\uffff\1\22"+
        "\4\uffff\1\32\2\uffff\1\36\1\uffff\1\41\2\uffff\1\44\1\uffff\1\46"+
        "\1\24\1\25\1\26\1\30\1\33\1\uffff\1\40\1\uffff\1\43\1\45\3\uffff"+
        "\1\42\1\34";
    static final String DFA10_specialS =
        "\u00b1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\1\1\46\3\uffff\1\2\1\uffff"+
            "\1\3\1\4\1\47\1\5\1\6\1\7\1\10\1\11\12\45\1\12\1\13\1\14\1\15"+
            "\1\16\2\uffff\1\44\1\17\1\20\1\21\1\22\1\23\1\24\1\44\1\25\2"+
            "\44\1\26\1\44\1\27\1\30\2\44\1\31\1\32\1\42\1\33\1\44\1\34\3"+
            "\44\6\uffff\5\44\1\43\15\44\1\41\6\44\1\35\1\36\1\37\u1f9e\uffff"+
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\4\uffff\1\50",
            "",
            "",
            "\1\52\1\53",
            "",
            "\1\55",
            "\1\57\23\uffff\1\60",
            "\1\61\2\uffff\1\62",
            "\1\63",
            "\1\64\11\uffff\1\65",
            "\1\70\20\uffff\1\66\16\uffff\1\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\13\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101\1\uffff\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\106\37\uffff\1\105",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\11\uffff\1\156",
            "\1\157",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0091",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009b",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a7",
            "",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00a9",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | WS | COMMENT | Bool | Ident | Int | Str | All );";
        }
    }
 

}