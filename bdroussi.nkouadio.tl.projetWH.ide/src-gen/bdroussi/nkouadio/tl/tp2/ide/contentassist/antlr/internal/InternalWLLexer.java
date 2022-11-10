package bdroussi.nkouadio.tl.tp2.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWLLexer extends Lexer {
    public static final int RULE_MAJ=6;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_MIN=7;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_DEC=8;
    public static final int RULE_WS=14;
    public static final int RULE_VARIABLE=4;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalWLLexer() {;} 
    public InternalWLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWL.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:11:7: ( 'nop' )
            // InternalWL.g:11:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:12:7: ( 'nil' )
            // InternalWL.g:12:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:13:7: ( 'function' )
            // InternalWL.g:13:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:14:7: ( ':' )
            // InternalWL.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:15:7: ( 'read' )
            // InternalWL.g:15:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:16:7: ( '%' )
            // InternalWL.g:16:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:17:7: ( 'write' )
            // InternalWL.g:17:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:18:7: ( ',' )
            // InternalWL.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:19:7: ( ';' )
            // InternalWL.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:20:7: ( ':=' )
            // InternalWL.g:20:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:21:7: ( 'if' )
            // InternalWL.g:21:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:22:7: ( 'then' )
            // InternalWL.g:22:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:23:7: ( 'fi' )
            // InternalWL.g:23:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:24:7: ( 'else' )
            // InternalWL.g:24:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:25:7: ( 'while' )
            // InternalWL.g:25:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:26:7: ( 'do' )
            // InternalWL.g:26:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:27:7: ( 'od' )
            // InternalWL.g:27:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:28:7: ( 'for' )
            // InternalWL.g:28:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:29:7: ( 'foreach' )
            // InternalWL.g:29:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:30:7: ( 'in' )
            // InternalWL.g:30:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:31:7: ( '(' )
            // InternalWL.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:32:7: ( ')' )
            // InternalWL.g:32:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:33:7: ( 'cons' )
            // InternalWL.g:33:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:34:7: ( 'list' )
            // InternalWL.g:34:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:35:7: ( 'hd' )
            // InternalWL.g:35:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:36:7: ( 'tl' )
            // InternalWL.g:36:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:37:7: ( '=?' )
            // InternalWL.g:37:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_MAJ"
    public final void mRULE_MAJ() throws RecognitionException {
        try {
            // InternalWL.g:2923:19: ( 'A' .. 'Z' )
            // InternalWL.g:2923:21: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAJ"

    // $ANTLR start "RULE_MIN"
    public final void mRULE_MIN() throws RecognitionException {
        try {
            // InternalWL.g:2925:19: ( 'a' .. 'z' )
            // InternalWL.g:2925:21: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN"

    // $ANTLR start "RULE_DEC"
    public final void mRULE_DEC() throws RecognitionException {
        try {
            // InternalWL.g:2927:19: ( '0' .. '9' )
            // InternalWL.g:2927:21: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2929:15: ( RULE_MAJ ( RULE_MAJ | RULE_MIN | RULE_DEC )* ( '?' | '!' ) )
            // InternalWL.g:2929:17: RULE_MAJ ( RULE_MAJ | RULE_MIN | RULE_DEC )* ( '?' | '!' )
            {
            mRULE_MAJ(); 
            // InternalWL.g:2929:26: ( RULE_MAJ | RULE_MIN | RULE_DEC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2931:13: ( RULE_MIN ( RULE_MAJ | RULE_MIN | RULE_DEC )* ( '?' | '!' ) )
            // InternalWL.g:2931:15: RULE_MIN ( RULE_MAJ | RULE_MIN | RULE_DEC )* ( '?' | '!' )
            {
            mRULE_MIN(); 
            // InternalWL.g:2931:24: ( RULE_MAJ | RULE_MIN | RULE_DEC )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2933:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWL.g:2933:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWL.g:2933:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalWL.g:2933:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWL.g:2933:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2935:10: ( ( '0' .. '9' )+ )
            // InternalWL.g:2935:12: ( '0' .. '9' )+
            {
            // InternalWL.g:2935:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWL.g:2935:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2937:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalWL.g:2937:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalWL.g:2937:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalWL.g:2937:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalWL.g:2937:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalWL.g:2937:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWL.g:2937:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalWL.g:2937:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalWL.g:2937:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalWL.g:2937:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWL.g:2937:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2939:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWL.g:2939:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWL.g:2939:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWL.g:2939:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2941:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWL.g:2941:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWL.g:2941:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWL.g:2941:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalWL.g:2941:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWL.g:2941:41: ( '\\r' )? '\\n'
                    {
                    // InternalWL.g:2941:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalWL.g:2941:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2943:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWL.g:2943:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWL.g:2943:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWL.g:2945:16: ( . )
            // InternalWL.g:2945:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalWL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_VARIABLE | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=36;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalWL.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalWL.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalWL.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalWL.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalWL.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalWL.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalWL.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalWL.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalWL.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalWL.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalWL.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalWL.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalWL.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalWL.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalWL.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalWL.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalWL.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalWL.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalWL.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalWL.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalWL.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalWL.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalWL.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalWL.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalWL.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalWL.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalWL.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalWL.g:1:172: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 29 :
                // InternalWL.g:1:186: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 30 :
                // InternalWL.g:1:198: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalWL.g:1:206: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalWL.g:1:215: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalWL.g:1:227: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalWL.g:1:243: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalWL.g:1:259: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalWL.g:1:267: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\41\1\47\1\41\1\uffff\1\41\2\uffff\5\41\2\uffff\3\41\1\35\2\41\1\35\2\uffff\3\35\2\uffff\3\41\2\uffff\1\41\1\105\1\41\2\uffff\1\41\1\uffff\2\41\2\uffff\1\112\1\113\1\41\1\115\1\41\1\117\1\120\2\uffff\2\41\1\123\1\uffff\1\41\6\uffff\1\124\1\125\1\41\1\uffff\1\130\3\41\2\uffff\1\41\1\uffff\1\41\2\uffff\2\41\3\uffff\2\41\1\uffff\1\142\2\41\1\145\1\146\1\147\1\150\2\41\1\uffff\1\153\1\154\4\uffff\2\41\2\uffff\1\41\1\160\1\161\2\uffff";
    static final String DFA14_eofS =
        "\162\uffff";
    static final String DFA14_minS =
        "\1\0\2\41\1\75\1\41\1\uffff\1\41\2\uffff\5\41\2\uffff\3\41\1\77\2\41\1\101\2\uffff\2\0\1\52\2\uffff\3\41\2\uffff\3\41\2\uffff\1\41\1\uffff\2\41\2\uffff\7\41\2\uffff\3\41\1\uffff\1\41\6\uffff\3\41\1\uffff\4\41\2\uffff\1\41\1\uffff\1\41\2\uffff\2\41\3\uffff\2\41\1\uffff\11\41\1\uffff\2\41\4\uffff\2\41\2\uffff\3\41\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\172\1\75\1\172\1\uffff\1\172\2\uffff\5\172\2\uffff\3\172\1\77\3\172\2\uffff\2\uffff\1\57\2\uffff\3\172\2\uffff\3\172\2\uffff\1\172\1\uffff\2\172\2\uffff\7\172\2\uffff\3\172\1\uffff\1\172\6\uffff\3\172\1\uffff\4\172\2\uffff\1\172\1\uffff\1\172\2\uffff\2\172\3\uffff\2\172\1\uffff\11\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\6\1\uffff\1\10\1\11\5\uffff\1\25\1\26\7\uffff\1\36\1\37\3\uffff\1\43\1\44\3\uffff\1\36\1\35\3\uffff\1\12\1\4\1\uffff\1\6\2\uffff\1\10\1\11\7\uffff\1\25\1\26\3\uffff\1\33\1\uffff\1\34\1\37\1\40\1\41\1\42\1\43\3\uffff\1\15\4\uffff\1\13\1\24\1\uffff\1\32\1\uffff\1\20\1\21\2\uffff\1\31\1\1\1\2\2\uffff\1\22\11\uffff\1\5\2\uffff\1\14\1\16\1\27\1\30\2\uffff\1\7\1\17\3\uffff\1\23\1\3";
    static final String DFA14_specialS =
        "\1\1\30\uffff\1\2\1\0\127\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\2\35\1\5\1\35\1\32\1\16\1\17\2\35\1\7\2\35\1\33\12\30\1\3\1\10\1\35\1\23\3\35\32\24\3\35\1\26\1\27\1\35\2\25\1\20\1\14\1\13\1\2\1\25\1\22\1\11\2\25\1\21\1\25\1\1\1\15\2\25\1\4\1\25\1\12\2\25\1\6\3\25\uff85\35",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\10\40\1\37\5\40\1\36\13\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\10\40\1\44\5\40\1\45\5\40\1\43\5\40",
            "\1\46",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\4\40\1\50\25\40",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\7\40\1\53\11\40\1\52\10\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\5\40\1\56\7\40\1\57\14\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\7\40\1\60\3\40\1\61\16\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\13\40\1\62\16\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\16\40\1\63\13\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\3\40\1\64\26\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\16\40\1\67\13\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\10\40\1\70\21\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\3\40\1\71\26\40",
            "\1\72",
            "\1\74\16\uffff\12\73\5\uffff\1\74\1\uffff\32\73\6\uffff\32\73",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\32\40",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\17\40\1\102\12\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\13\40\1\103\16\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\15\40\1\104\14\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\21\40\1\106\10\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\1\107\31\40",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\10\40\1\110\21\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\10\40\1\111\21\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\4\40\1\114\25\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\22\40\1\116\7\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\15\40\1\121\14\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\22\40\1\122\7\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "\1\74\16\uffff\12\73\5\uffff\1\74\1\uffff\32\73\6\uffff\32\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\2\40\1\126\27\40",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\4\40\1\127\25\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\3\40\1\131\26\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\23\40\1\132\6\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\13\40\1\133\16\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\15\40\1\134\14\40",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\4\40\1\135\25\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\22\40\1\136\7\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\23\40\1\137\6\40",
            "",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\23\40\1\140\6\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\1\141\31\40",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\4\40\1\143\25\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\4\40\1\144\25\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\10\40\1\151\21\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\2\40\1\152\27\40",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\16\40\1\155\13\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\7\40\1\156\22\40",
            "",
            "",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\6\uffff\15\40\1\157\14\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "\1\42\16\uffff\12\40\5\uffff\1\42\1\uffff\32\40\4\uffff\1\41\1\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_VARIABLE | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( ((LA14_26>='\u0000' && LA14_26<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='n') ) {s = 1;}

                        else if ( (LA14_0=='f') ) {s = 2;}

                        else if ( (LA14_0==':') ) {s = 3;}

                        else if ( (LA14_0=='r') ) {s = 4;}

                        else if ( (LA14_0=='%') ) {s = 5;}

                        else if ( (LA14_0=='w') ) {s = 6;}

                        else if ( (LA14_0==',') ) {s = 7;}

                        else if ( (LA14_0==';') ) {s = 8;}

                        else if ( (LA14_0=='i') ) {s = 9;}

                        else if ( (LA14_0=='t') ) {s = 10;}

                        else if ( (LA14_0=='e') ) {s = 11;}

                        else if ( (LA14_0=='d') ) {s = 12;}

                        else if ( (LA14_0=='o') ) {s = 13;}

                        else if ( (LA14_0=='(') ) {s = 14;}

                        else if ( (LA14_0==')') ) {s = 15;}

                        else if ( (LA14_0=='c') ) {s = 16;}

                        else if ( (LA14_0=='l') ) {s = 17;}

                        else if ( (LA14_0=='h') ) {s = 18;}

                        else if ( (LA14_0=='=') ) {s = 19;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 20;}

                        else if ( ((LA14_0>='a' && LA14_0<='b')||LA14_0=='g'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||(LA14_0>='p' && LA14_0<='q')||LA14_0=='s'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 21;}

                        else if ( (LA14_0=='^') ) {s = 22;}

                        else if ( (LA14_0=='_') ) {s = 23;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 24;}

                        else if ( (LA14_0=='\"') ) {s = 25;}

                        else if ( (LA14_0=='\'') ) {s = 26;}

                        else if ( (LA14_0=='/') ) {s = 27;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 28;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='$')||LA14_0=='&'||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_25 = input.LA(1);

                        s = -1;
                        if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}