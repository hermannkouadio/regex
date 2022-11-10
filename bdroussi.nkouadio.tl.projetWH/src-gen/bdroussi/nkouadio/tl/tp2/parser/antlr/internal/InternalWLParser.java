package bdroussi.nkouadio.tl.tp2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import bdroussi.nkouadio.tl.tp2.services.WLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_MAJ", "RULE_MIN", "RULE_DEC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "')'", "'cons'", "'list'", "'hd'", "'tl'", "'=?'"
    };
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
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWL.g"; }



     	private WLGrammarAccess grammarAccess;

        public InternalWLParser(TokenStream input, WLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected WLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalWL.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWL.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWL.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWL.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalWL.g:77:2: ( ( (lv_functions_0_0= ruleFunction ) )+ )
            // InternalWL.g:78:2: ( (lv_functions_0_0= ruleFunction ) )+
            {
            // InternalWL.g:78:2: ( (lv_functions_0_0= ruleFunction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWL.g:79:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalWL.g:79:3: (lv_functions_0_0= ruleFunction )
            	    // InternalWL.g:80:4: lv_functions_0_0= ruleFunction
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"functions",
            	    					lv_functions_0_0,
            	    					"bdroussi.nkouadio.tl.tp2.WL.Function");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalWL.g:100:1: entryRuleFunction returns [String current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final String entryRuleFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction = null;


        try {
            // InternalWL.g:100:48: (iv_ruleFunction= ruleFunction EOF )
            // InternalWL.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWL.g:107:1: ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'function' this_Symbol_1= RULE_SYMBOL kw= ':' this_Definition_3= ruleDefinition ) ;
    public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Symbol_1=null;
        AntlrDatatypeRuleToken this_Definition_3 = null;



        	enterRule();

        try {
            // InternalWL.g:113:2: ( (kw= 'function' this_Symbol_1= RULE_SYMBOL kw= ':' this_Definition_3= ruleDefinition ) )
            // InternalWL.g:114:2: (kw= 'function' this_Symbol_1= RULE_SYMBOL kw= ':' this_Definition_3= ruleDefinition )
            {
            // InternalWL.g:114:2: (kw= 'function' this_Symbol_1= RULE_SYMBOL kw= ':' this_Definition_3= ruleDefinition )
            // InternalWL.g:115:3: kw= 'function' this_Symbol_1= RULE_SYMBOL kw= ':' this_Definition_3= ruleDefinition
            {
            kw=(Token)match(input,16,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            this_Symbol_1=(Token)match(input,RULE_SYMBOL,FOLLOW_5); 

            			current.merge(this_Symbol_1);
            		

            			newLeafNode(this_Symbol_1, grammarAccess.getFunctionAccess().getSymbolTerminalRuleCall_1());
            		
            kw=(Token)match(input,17,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getColonKeyword_2());
            		

            			newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_Definition_3=ruleDefinition();

            state._fsp--;


            			current.merge(this_Definition_3);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWL.g:146:1: entryRuleDefinition returns [String current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final String entryRuleDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefinition = null;


        try {
            // InternalWL.g:146:50: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWL.g:147:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWL.g:153:1: ruleDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'read' this_Input_1= ruleInput kw= '%' this_Commands_3= ruleCommands kw= '%' kw= 'write' this_Output_6= ruleOutput ) ;
    public final AntlrDatatypeRuleToken ruleDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Input_1 = null;

        AntlrDatatypeRuleToken this_Commands_3 = null;

        AntlrDatatypeRuleToken this_Output_6 = null;



        	enterRule();

        try {
            // InternalWL.g:159:2: ( (kw= 'read' this_Input_1= ruleInput kw= '%' this_Commands_3= ruleCommands kw= '%' kw= 'write' this_Output_6= ruleOutput ) )
            // InternalWL.g:160:2: (kw= 'read' this_Input_1= ruleInput kw= '%' this_Commands_3= ruleCommands kw= '%' kw= 'write' this_Output_6= ruleOutput )
            {
            // InternalWL.g:160:2: (kw= 'read' this_Input_1= ruleInput kw= '%' this_Commands_3= ruleCommands kw= '%' kw= 'write' this_Output_6= ruleOutput )
            // InternalWL.g:161:3: kw= 'read' this_Input_1= ruleInput kw= '%' this_Commands_3= ruleCommands kw= '%' kw= 'write' this_Output_6= ruleOutput
            {
            kw=(Token)match(input,18,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefinitionAccess().getReadKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDefinitionAccess().getInputParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_Input_1=ruleInput();

            state._fsp--;


            			current.merge(this_Input_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,19,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
            		

            			newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsParserRuleCall_3());
            		
            pushFollow(FOLLOW_8);
            this_Commands_3=ruleCommands();

            state._fsp--;


            			current.merge(this_Commands_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,19,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
            		
            kw=(Token)match(input,20,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
            		

            			newCompositeNode(grammarAccess.getDefinitionAccess().getOutputParserRuleCall_6());
            		
            pushFollow(FOLLOW_2);
            this_Output_6=ruleOutput();

            state._fsp--;


            			current.merge(this_Output_6);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWL.g:215:1: entryRuleInput returns [String current=null] : iv_ruleInput= ruleInput EOF ;
    public final String entryRuleInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInput = null;


        try {
            // InternalWL.g:215:45: (iv_ruleInput= ruleInput EOF )
            // InternalWL.g:216:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWL.g:222:1: ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Input_2= ruleInput ) | this_Variable_3= RULE_VARIABLE ) ;
    public final AntlrDatatypeRuleToken ruleInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Variable_0=null;
        Token kw=null;
        Token this_Variable_3=null;
        AntlrDatatypeRuleToken this_Input_2 = null;



        	enterRule();

        try {
            // InternalWL.g:228:2: ( ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Input_2= ruleInput ) | this_Variable_3= RULE_VARIABLE ) )
            // InternalWL.g:229:2: ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Input_2= ruleInput ) | this_Variable_3= RULE_VARIABLE )
            {
            // InternalWL.g:229:2: ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Input_2= ruleInput ) | this_Variable_3= RULE_VARIABLE )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_VARIABLE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==19) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWL.g:230:3: (this_Variable_0= RULE_VARIABLE kw= ',' this_Input_2= ruleInput )
                    {
                    // InternalWL.g:230:3: (this_Variable_0= RULE_VARIABLE kw= ',' this_Input_2= ruleInput )
                    // InternalWL.g:231:4: this_Variable_0= RULE_VARIABLE kw= ',' this_Input_2= ruleInput
                    {
                    this_Variable_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

                    				current.merge(this_Variable_0);
                    			

                    				newLeafNode(this_Variable_0, grammarAccess.getInputAccess().getVariableTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,21,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getInputAccess().getCommaKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getInputAccess().getInputParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Input_2=ruleInput();

                    state._fsp--;


                    				current.merge(this_Input_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWL.g:255:3: this_Variable_3= RULE_VARIABLE
                    {
                    this_Variable_3=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    			current.merge(this_Variable_3);
                    		

                    			newLeafNode(this_Variable_3, grammarAccess.getInputAccess().getVariableTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWL.g:266:1: entryRuleOutput returns [String current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final String entryRuleOutput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutput = null;


        try {
            // InternalWL.g:266:46: (iv_ruleOutput= ruleOutput EOF )
            // InternalWL.g:267:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWL.g:273:1: ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Output_2= ruleOutput ) | this_Variable_3= RULE_VARIABLE ) ;
    public final AntlrDatatypeRuleToken ruleOutput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Variable_0=null;
        Token kw=null;
        Token this_Variable_3=null;
        AntlrDatatypeRuleToken this_Output_2 = null;



        	enterRule();

        try {
            // InternalWL.g:279:2: ( ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Output_2= ruleOutput ) | this_Variable_3= RULE_VARIABLE ) )
            // InternalWL.g:280:2: ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Output_2= ruleOutput ) | this_Variable_3= RULE_VARIABLE )
            {
            // InternalWL.g:280:2: ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Output_2= ruleOutput ) | this_Variable_3= RULE_VARIABLE )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_VARIABLE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==21) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==16) ) {
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
                    // InternalWL.g:281:3: (this_Variable_0= RULE_VARIABLE kw= ',' this_Output_2= ruleOutput )
                    {
                    // InternalWL.g:281:3: (this_Variable_0= RULE_VARIABLE kw= ',' this_Output_2= ruleOutput )
                    // InternalWL.g:282:4: this_Variable_0= RULE_VARIABLE kw= ',' this_Output_2= ruleOutput
                    {
                    this_Variable_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

                    				current.merge(this_Variable_0);
                    			

                    				newLeafNode(this_Variable_0, grammarAccess.getOutputAccess().getVariableTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,21,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOutputAccess().getCommaKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getOutputAccess().getOutputParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Output_2=ruleOutput();

                    state._fsp--;


                    				current.merge(this_Output_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWL.g:306:3: this_Variable_3= RULE_VARIABLE
                    {
                    this_Variable_3=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    			current.merge(this_Variable_3);
                    		

                    			newLeafNode(this_Variable_3, grammarAccess.getOutputAccess().getVariableTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalWL.g:317:1: entryRuleCommands returns [String current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final String entryRuleCommands() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommands = null;


        try {
            // InternalWL.g:317:48: (iv_ruleCommands= ruleCommands EOF )
            // InternalWL.g:318:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWL.g:324:1: ruleCommands returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Command_0= ruleCommand (kw= ';' this_Commands_2= ruleCommands )? ) ;
    public final AntlrDatatypeRuleToken ruleCommands() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Command_0 = null;

        AntlrDatatypeRuleToken this_Commands_2 = null;



        	enterRule();

        try {
            // InternalWL.g:330:2: ( (this_Command_0= ruleCommand (kw= ';' this_Commands_2= ruleCommands )? ) )
            // InternalWL.g:331:2: (this_Command_0= ruleCommand (kw= ';' this_Commands_2= ruleCommands )? )
            {
            // InternalWL.g:331:2: (this_Command_0= ruleCommand (kw= ';' this_Commands_2= ruleCommands )? )
            // InternalWL.g:332:3: this_Command_0= ruleCommand (kw= ';' this_Commands_2= ruleCommands )?
            {

            			newCompositeNode(grammarAccess.getCommandsAccess().getCommandParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Command_0=ruleCommand();

            state._fsp--;


            			current.merge(this_Command_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalWL.g:342:3: (kw= ';' this_Commands_2= ruleCommands )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWL.g:343:4: kw= ';' this_Commands_2= ruleCommands
                    {
                    kw=(Token)match(input,22,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getCommandsAccess().getCommandsParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Commands_2=ruleCommands();

                    state._fsp--;


                    				current.merge(this_Commands_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWL.g:363:1: entryRuleCommand returns [String current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final String entryRuleCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommand = null;


        try {
            // InternalWL.g:363:47: (iv_ruleCommand= ruleCommand EOF )
            // InternalWL.g:364:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWL.g:370:1: ruleCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | this_CommandIf_4= ruleCommandIf | this_CommandFor_5= ruleCommandFor | this_CommandForEach_6= ruleCommandForEach ) ;
    public final AntlrDatatypeRuleToken ruleCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Vars_1 = null;

        AntlrDatatypeRuleToken this_Exprs_3 = null;

        AntlrDatatypeRuleToken this_CommandIf_4 = null;

        AntlrDatatypeRuleToken this_CommandFor_5 = null;

        AntlrDatatypeRuleToken this_CommandForEach_6 = null;



        	enterRule();

        try {
            // InternalWL.g:376:2: ( (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | this_CommandIf_4= ruleCommandIf | this_CommandFor_5= ruleCommandFor | this_CommandForEach_6= ruleCommandForEach ) )
            // InternalWL.g:377:2: (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | this_CommandIf_4= ruleCommandIf | this_CommandFor_5= ruleCommandFor | this_CommandForEach_6= ruleCommandForEach )
            {
            // InternalWL.g:377:2: (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | this_CommandIf_4= ruleCommandIf | this_CommandFor_5= ruleCommandFor | this_CommandForEach_6= ruleCommandForEach )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 29:
            case 32:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWL.g:378:3: kw= 'nop'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCommandAccess().getNopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWL.g:384:3: (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs )
                    {
                    // InternalWL.g:384:3: (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs )
                    // InternalWL.g:385:4: this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getVarsParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_Vars_1=ruleVars();

                    state._fsp--;


                    				current.merge(this_Vars_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,24,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getCommandAccess().getExprsParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Exprs_3=ruleExprs();

                    state._fsp--;


                    				current.merge(this_Exprs_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWL.g:412:3: this_CommandIf_4= ruleCommandIf
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommandIfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandIf_4=ruleCommandIf();

                    state._fsp--;


                    			current.merge(this_CommandIf_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWL.g:423:3: this_CommandFor_5= ruleCommandFor
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommandForParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandFor_5=ruleCommandFor();

                    state._fsp--;


                    			current.merge(this_CommandFor_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalWL.g:434:3: this_CommandForEach_6= ruleCommandForEach
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommandForEachParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandForEach_6=ruleCommandForEach();

                    state._fsp--;


                    			current.merge(this_CommandForEach_6);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandIf"
    // InternalWL.g:448:1: entryRuleCommandIf returns [String current=null] : iv_ruleCommandIf= ruleCommandIf EOF ;
    public final String entryRuleCommandIf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommandIf = null;


        try {
            // InternalWL.g:448:49: (iv_ruleCommandIf= ruleCommandIf EOF )
            // InternalWL.g:449:2: iv_ruleCommandIf= ruleCommandIf EOF
            {
             newCompositeNode(grammarAccess.getCommandIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandIf=ruleCommandIf();

            state._fsp--;

             current =iv_ruleCommandIf.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandIf"


    // $ANTLR start "ruleCommandIf"
    // InternalWL.g:455:1: ruleCommandIf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' this_Expresssion_1= ruleExpresssion kw= 'then' this_Commands_3= ruleCommands (kw= 'else' this_Commands_5= ruleCommands )? kw= 'fi' ) ;
    public final AntlrDatatypeRuleToken ruleCommandIf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expresssion_1 = null;

        AntlrDatatypeRuleToken this_Commands_3 = null;

        AntlrDatatypeRuleToken this_Commands_5 = null;



        	enterRule();

        try {
            // InternalWL.g:461:2: ( (kw= 'if' this_Expresssion_1= ruleExpresssion kw= 'then' this_Commands_3= ruleCommands (kw= 'else' this_Commands_5= ruleCommands )? kw= 'fi' ) )
            // InternalWL.g:462:2: (kw= 'if' this_Expresssion_1= ruleExpresssion kw= 'then' this_Commands_3= ruleCommands (kw= 'else' this_Commands_5= ruleCommands )? kw= 'fi' )
            {
            // InternalWL.g:462:2: (kw= 'if' this_Expresssion_1= ruleExpresssion kw= 'then' this_Commands_3= ruleCommands (kw= 'else' this_Commands_5= ruleCommands )? kw= 'fi' )
            // InternalWL.g:463:3: kw= 'if' this_Expresssion_1= ruleExpresssion kw= 'then' this_Commands_3= ruleCommands (kw= 'else' this_Commands_5= ruleCommands )? kw= 'fi'
            {
            kw=(Token)match(input,25,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCommandIfAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCommandIfAccess().getExpresssionParserRuleCall_1());
            		
            pushFollow(FOLLOW_15);
            this_Expresssion_1=ruleExpresssion();

            state._fsp--;


            			current.merge(this_Expresssion_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,26,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCommandIfAccess().getThenKeyword_2());
            		

            			newCompositeNode(grammarAccess.getCommandIfAccess().getCommandsParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_Commands_3=ruleCommands();

            state._fsp--;


            			current.merge(this_Commands_3);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalWL.g:493:3: (kw= 'else' this_Commands_5= ruleCommands )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWL.g:494:4: kw= 'else' this_Commands_5= ruleCommands
                    {
                    kw=(Token)match(input,27,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandIfAccess().getElseKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getCommandIfAccess().getCommandsParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Commands_5=ruleCommands();

                    state._fsp--;


                    				current.merge(this_Commands_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            kw=(Token)match(input,28,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCommandIfAccess().getFiKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandIf"


    // $ANTLR start "entryRuleCommandFor"
    // InternalWL.g:519:1: entryRuleCommandFor returns [String current=null] : iv_ruleCommandFor= ruleCommandFor EOF ;
    public final String entryRuleCommandFor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommandFor = null;


        try {
            // InternalWL.g:519:50: (iv_ruleCommandFor= ruleCommandFor EOF )
            // InternalWL.g:520:2: iv_ruleCommandFor= ruleCommandFor EOF
            {
             newCompositeNode(grammarAccess.getCommandForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandFor=ruleCommandFor();

            state._fsp--;

             current =iv_ruleCommandFor.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandFor"


    // $ANTLR start "ruleCommandFor"
    // InternalWL.g:526:1: ruleCommandFor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'while' this_Expresssion_1= ruleExpresssion kw= 'do' this_Commands_3= ruleCommands kw= 'od' ) | (kw= 'for' this_Expresssion_6= ruleExpresssion kw= 'do' this_Commands_8= ruleCommands kw= 'od' ) ) ;
    public final AntlrDatatypeRuleToken ruleCommandFor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expresssion_1 = null;

        AntlrDatatypeRuleToken this_Commands_3 = null;

        AntlrDatatypeRuleToken this_Expresssion_6 = null;

        AntlrDatatypeRuleToken this_Commands_8 = null;



        	enterRule();

        try {
            // InternalWL.g:532:2: ( ( (kw= 'while' this_Expresssion_1= ruleExpresssion kw= 'do' this_Commands_3= ruleCommands kw= 'od' ) | (kw= 'for' this_Expresssion_6= ruleExpresssion kw= 'do' this_Commands_8= ruleCommands kw= 'od' ) ) )
            // InternalWL.g:533:2: ( (kw= 'while' this_Expresssion_1= ruleExpresssion kw= 'do' this_Commands_3= ruleCommands kw= 'od' ) | (kw= 'for' this_Expresssion_6= ruleExpresssion kw= 'do' this_Commands_8= ruleCommands kw= 'od' ) )
            {
            // InternalWL.g:533:2: ( (kw= 'while' this_Expresssion_1= ruleExpresssion kw= 'do' this_Commands_3= ruleCommands kw= 'od' ) | (kw= 'for' this_Expresssion_6= ruleExpresssion kw= 'do' this_Commands_8= ruleCommands kw= 'od' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalWL.g:534:3: (kw= 'while' this_Expresssion_1= ruleExpresssion kw= 'do' this_Commands_3= ruleCommands kw= 'od' )
                    {
                    // InternalWL.g:534:3: (kw= 'while' this_Expresssion_1= ruleExpresssion kw= 'do' this_Commands_3= ruleCommands kw= 'od' )
                    // InternalWL.g:535:4: kw= 'while' this_Expresssion_1= ruleExpresssion kw= 'do' this_Commands_3= ruleCommands kw= 'od'
                    {
                    kw=(Token)match(input,29,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandForAccess().getWhileKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getCommandForAccess().getExpresssionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Expresssion_1=ruleExpresssion();

                    state._fsp--;


                    				current.merge(this_Expresssion_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,30,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandForAccess().getDoKeyword_0_2());
                    			

                    				newCompositeNode(grammarAccess.getCommandForAccess().getCommandsParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_19);
                    this_Commands_3=ruleCommands();

                    state._fsp--;


                    				current.merge(this_Commands_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandForAccess().getOdKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWL.g:572:3: (kw= 'for' this_Expresssion_6= ruleExpresssion kw= 'do' this_Commands_8= ruleCommands kw= 'od' )
                    {
                    // InternalWL.g:572:3: (kw= 'for' this_Expresssion_6= ruleExpresssion kw= 'do' this_Commands_8= ruleCommands kw= 'od' )
                    // InternalWL.g:573:4: kw= 'for' this_Expresssion_6= ruleExpresssion kw= 'do' this_Commands_8= ruleCommands kw= 'od'
                    {
                    kw=(Token)match(input,32,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandForAccess().getForKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getCommandForAccess().getExpresssionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Expresssion_6=ruleExpresssion();

                    state._fsp--;


                    				current.merge(this_Expresssion_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,30,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandForAccess().getDoKeyword_1_2());
                    			

                    				newCompositeNode(grammarAccess.getCommandForAccess().getCommandsParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_19);
                    this_Commands_8=ruleCommands();

                    state._fsp--;


                    				current.merge(this_Commands_8);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCommandForAccess().getOdKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandFor"


    // $ANTLR start "entryRuleCommandForEach"
    // InternalWL.g:613:1: entryRuleCommandForEach returns [String current=null] : iv_ruleCommandForEach= ruleCommandForEach EOF ;
    public final String entryRuleCommandForEach() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommandForEach = null;


        try {
            // InternalWL.g:613:54: (iv_ruleCommandForEach= ruleCommandForEach EOF )
            // InternalWL.g:614:2: iv_ruleCommandForEach= ruleCommandForEach EOF
            {
             newCompositeNode(grammarAccess.getCommandForEachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandForEach=ruleCommandForEach();

            state._fsp--;

             current =iv_ruleCommandForEach.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandForEach"


    // $ANTLR start "ruleCommandForEach"
    // InternalWL.g:620:1: ruleCommandForEach returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'foreach' this_Variable_1= RULE_VARIABLE kw= 'in' this_Expresssion_3= ruleExpresssion kw= 'do' this_Commands_5= ruleCommands kw= 'od' ) ;
    public final AntlrDatatypeRuleToken ruleCommandForEach() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Variable_1=null;
        AntlrDatatypeRuleToken this_Expresssion_3 = null;

        AntlrDatatypeRuleToken this_Commands_5 = null;



        	enterRule();

        try {
            // InternalWL.g:626:2: ( (kw= 'foreach' this_Variable_1= RULE_VARIABLE kw= 'in' this_Expresssion_3= ruleExpresssion kw= 'do' this_Commands_5= ruleCommands kw= 'od' ) )
            // InternalWL.g:627:2: (kw= 'foreach' this_Variable_1= RULE_VARIABLE kw= 'in' this_Expresssion_3= ruleExpresssion kw= 'do' this_Commands_5= ruleCommands kw= 'od' )
            {
            // InternalWL.g:627:2: (kw= 'foreach' this_Variable_1= RULE_VARIABLE kw= 'in' this_Expresssion_3= ruleExpresssion kw= 'do' this_Commands_5= ruleCommands kw= 'od' )
            // InternalWL.g:628:3: kw= 'foreach' this_Variable_1= RULE_VARIABLE kw= 'in' this_Expresssion_3= ruleExpresssion kw= 'do' this_Commands_5= ruleCommands kw= 'od'
            {
            kw=(Token)match(input,33,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCommandForEachAccess().getForeachKeyword_0());
            		
            this_Variable_1=(Token)match(input,RULE_VARIABLE,FOLLOW_20); 

            			current.merge(this_Variable_1);
            		

            			newLeafNode(this_Variable_1, grammarAccess.getCommandForEachAccess().getVariableTerminalRuleCall_1());
            		
            kw=(Token)match(input,34,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCommandForEachAccess().getInKeyword_2());
            		

            			newCompositeNode(grammarAccess.getCommandForEachAccess().getExpresssionParserRuleCall_3());
            		
            pushFollow(FOLLOW_18);
            this_Expresssion_3=ruleExpresssion();

            state._fsp--;


            			current.merge(this_Expresssion_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,30,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCommandForEachAccess().getDoKeyword_4());
            		

            			newCompositeNode(grammarAccess.getCommandForEachAccess().getCommandsParserRuleCall_5());
            		
            pushFollow(FOLLOW_19);
            this_Commands_5=ruleCommands();

            state._fsp--;


            			current.merge(this_Commands_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,31,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCommandForEachAccess().getOdKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandForEach"


    // $ANTLR start "entryRuleExprBase"
    // InternalWL.g:679:1: entryRuleExprBase returns [String current=null] : iv_ruleExprBase= ruleExprBase EOF ;
    public final String entryRuleExprBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprBase = null;


        try {
            // InternalWL.g:679:48: (iv_ruleExprBase= ruleExprBase EOF )
            // InternalWL.g:680:2: iv_ruleExprBase= ruleExprBase EOF
            {
             newCompositeNode(grammarAccess.getExprBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprBase=ruleExprBase();

            state._fsp--;

             current =iv_ruleExprBase.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBase"


    // $ANTLR start "ruleExprBase"
    // InternalWL.g:686:1: ruleExprBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nil' | this_Variable_1= RULE_VARIABLE | this_Symbol_2= RULE_SYMBOL | (kw= '(' this_Symbol_4= RULE_SYMBOL this_LExpr_5= ruleLExpr kw= ')' ) | this_ExprBaseCons_7= ruleExprBaseCons | this_ExprsBaseHd_8= ruleExprsBaseHd ) ;
    public final AntlrDatatypeRuleToken ruleExprBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Variable_1=null;
        Token this_Symbol_2=null;
        Token this_Symbol_4=null;
        AntlrDatatypeRuleToken this_LExpr_5 = null;

        AntlrDatatypeRuleToken this_ExprBaseCons_7 = null;

        AntlrDatatypeRuleToken this_ExprsBaseHd_8 = null;



        	enterRule();

        try {
            // InternalWL.g:692:2: ( (kw= 'nil' | this_Variable_1= RULE_VARIABLE | this_Symbol_2= RULE_SYMBOL | (kw= '(' this_Symbol_4= RULE_SYMBOL this_LExpr_5= ruleLExpr kw= ')' ) | this_ExprBaseCons_7= ruleExprBaseCons | this_ExprsBaseHd_8= ruleExprsBaseHd ) )
            // InternalWL.g:693:2: (kw= 'nil' | this_Variable_1= RULE_VARIABLE | this_Symbol_2= RULE_SYMBOL | (kw= '(' this_Symbol_4= RULE_SYMBOL this_LExpr_5= ruleLExpr kw= ')' ) | this_ExprBaseCons_7= ruleExprBaseCons | this_ExprsBaseHd_8= ruleExprsBaseHd )
            {
            // InternalWL.g:693:2: (kw= 'nil' | this_Variable_1= RULE_VARIABLE | this_Symbol_2= RULE_SYMBOL | (kw= '(' this_Symbol_4= RULE_SYMBOL this_LExpr_5= ruleLExpr kw= ')' ) | this_ExprBaseCons_7= ruleExprBaseCons | this_ExprsBaseHd_8= ruleExprsBaseHd )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt8=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                switch ( input.LA(2) ) {
                case 38:
                case 39:
                    {
                    alt8=5;
                    }
                    break;
                case 40:
                case 41:
                    {
                    alt8=6;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    alt8=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalWL.g:694:3: kw= 'nil'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExprBaseAccess().getNilKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWL.g:700:3: this_Variable_1= RULE_VARIABLE
                    {
                    this_Variable_1=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    			current.merge(this_Variable_1);
                    		

                    			newLeafNode(this_Variable_1, grammarAccess.getExprBaseAccess().getVariableTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalWL.g:708:3: this_Symbol_2= RULE_SYMBOL
                    {
                    this_Symbol_2=(Token)match(input,RULE_SYMBOL,FOLLOW_2); 

                    			current.merge(this_Symbol_2);
                    		

                    			newLeafNode(this_Symbol_2, grammarAccess.getExprBaseAccess().getSymbolTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalWL.g:716:3: (kw= '(' this_Symbol_4= RULE_SYMBOL this_LExpr_5= ruleLExpr kw= ')' )
                    {
                    // InternalWL.g:716:3: (kw= '(' this_Symbol_4= RULE_SYMBOL this_LExpr_5= ruleLExpr kw= ')' )
                    // InternalWL.g:717:4: kw= '(' this_Symbol_4= RULE_SYMBOL this_LExpr_5= ruleLExpr kw= ')'
                    {
                    kw=(Token)match(input,36,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0());
                    			
                    this_Symbol_4=(Token)match(input,RULE_SYMBOL,FOLLOW_21); 

                    				current.merge(this_Symbol_4);
                    			

                    				newLeafNode(this_Symbol_4, grammarAccess.getExprBaseAccess().getSymbolTerminalRuleCall_3_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_LExpr_5=ruleLExpr();

                    state._fsp--;


                    				current.merge(this_LExpr_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWL.g:746:3: this_ExprBaseCons_7= ruleExprBaseCons
                    {

                    			newCompositeNode(grammarAccess.getExprBaseAccess().getExprBaseConsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExprBaseCons_7=ruleExprBaseCons();

                    state._fsp--;


                    			current.merge(this_ExprBaseCons_7);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalWL.g:757:3: this_ExprsBaseHd_8= ruleExprsBaseHd
                    {

                    			newCompositeNode(grammarAccess.getExprBaseAccess().getExprsBaseHdParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExprsBaseHd_8=ruleExprsBaseHd();

                    state._fsp--;


                    			current.merge(this_ExprsBaseHd_8);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBase"


    // $ANTLR start "entryRuleExprBaseCons"
    // InternalWL.g:771:1: entryRuleExprBaseCons returns [String current=null] : iv_ruleExprBaseCons= ruleExprBaseCons EOF ;
    public final String entryRuleExprBaseCons() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprBaseCons = null;


        try {
            // InternalWL.g:771:52: (iv_ruleExprBaseCons= ruleExprBaseCons EOF )
            // InternalWL.g:772:2: iv_ruleExprBaseCons= ruleExprBaseCons EOF
            {
             newCompositeNode(grammarAccess.getExprBaseConsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprBaseCons=ruleExprBaseCons();

            state._fsp--;

             current =iv_ruleExprBaseCons.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBaseCons"


    // $ANTLR start "ruleExprBaseCons"
    // InternalWL.g:778:1: ruleExprBaseCons returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' kw= 'cons' this_LExpr_2= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_6= ruleLExpr kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleExprBaseCons() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LExpr_2 = null;

        AntlrDatatypeRuleToken this_LExpr_6 = null;



        	enterRule();

        try {
            // InternalWL.g:784:2: ( ( (kw= '(' kw= 'cons' this_LExpr_2= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_6= ruleLExpr kw= ')' ) ) )
            // InternalWL.g:785:2: ( (kw= '(' kw= 'cons' this_LExpr_2= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_6= ruleLExpr kw= ')' ) )
            {
            // InternalWL.g:785:2: ( (kw= '(' kw= 'cons' this_LExpr_2= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_6= ruleLExpr kw= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==38) ) {
                    alt9=1;
                }
                else if ( (LA9_1==39) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalWL.g:786:3: (kw= '(' kw= 'cons' this_LExpr_2= ruleLExpr kw= ')' )
                    {
                    // InternalWL.g:786:3: (kw= '(' kw= 'cons' this_LExpr_2= ruleLExpr kw= ')' )
                    // InternalWL.g:787:4: kw= '(' kw= 'cons' this_LExpr_2= ruleLExpr kw= ')'
                    {
                    kw=(Token)match(input,36,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseConsAccess().getLeftParenthesisKeyword_0_0());
                    			
                    kw=(Token)match(input,38,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseConsAccess().getConsKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseConsAccess().getLExprParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_LExpr_2=ruleLExpr();

                    state._fsp--;


                    				current.merge(this_LExpr_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseConsAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWL.g:814:3: (kw= '(' kw= 'list' this_LExpr_6= ruleLExpr kw= ')' )
                    {
                    // InternalWL.g:814:3: (kw= '(' kw= 'list' this_LExpr_6= ruleLExpr kw= ')' )
                    // InternalWL.g:815:4: kw= '(' kw= 'list' this_LExpr_6= ruleLExpr kw= ')'
                    {
                    kw=(Token)match(input,36,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseConsAccess().getLeftParenthesisKeyword_1_0());
                    			
                    kw=(Token)match(input,39,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseConsAccess().getListKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseConsAccess().getLExprParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_LExpr_6=ruleLExpr();

                    state._fsp--;


                    				current.merge(this_LExpr_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprBaseConsAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBaseCons"


    // $ANTLR start "entryRuleExprsBaseHd"
    // InternalWL.g:845:1: entryRuleExprsBaseHd returns [String current=null] : iv_ruleExprsBaseHd= ruleExprsBaseHd EOF ;
    public final String entryRuleExprsBaseHd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprsBaseHd = null;


        try {
            // InternalWL.g:845:51: (iv_ruleExprsBaseHd= ruleExprsBaseHd EOF )
            // InternalWL.g:846:2: iv_ruleExprsBaseHd= ruleExprsBaseHd EOF
            {
             newCompositeNode(grammarAccess.getExprsBaseHdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprsBaseHd=ruleExprsBaseHd();

            state._fsp--;

             current =iv_ruleExprsBaseHd.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprsBaseHd"


    // $ANTLR start "ruleExprsBaseHd"
    // InternalWL.g:852:1: ruleExprsBaseHd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' kw= 'hd' this_ExprBase_2= ruleExprBase kw= ')' ) | (kw= '(' kw= 'tl' this_ExprBase_6= ruleExprBase kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleExprsBaseHd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprBase_2 = null;

        AntlrDatatypeRuleToken this_ExprBase_6 = null;



        	enterRule();

        try {
            // InternalWL.g:858:2: ( ( (kw= '(' kw= 'hd' this_ExprBase_2= ruleExprBase kw= ')' ) | (kw= '(' kw= 'tl' this_ExprBase_6= ruleExprBase kw= ')' ) ) )
            // InternalWL.g:859:2: ( (kw= '(' kw= 'hd' this_ExprBase_2= ruleExprBase kw= ')' ) | (kw= '(' kw= 'tl' this_ExprBase_6= ruleExprBase kw= ')' ) )
            {
            // InternalWL.g:859:2: ( (kw= '(' kw= 'hd' this_ExprBase_2= ruleExprBase kw= ')' ) | (kw= '(' kw= 'tl' this_ExprBase_6= ruleExprBase kw= ')' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==41) ) {
                    alt10=2;
                }
                else if ( (LA10_1==40) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalWL.g:860:3: (kw= '(' kw= 'hd' this_ExprBase_2= ruleExprBase kw= ')' )
                    {
                    // InternalWL.g:860:3: (kw= '(' kw= 'hd' this_ExprBase_2= ruleExprBase kw= ')' )
                    // InternalWL.g:861:4: kw= '(' kw= 'hd' this_ExprBase_2= ruleExprBase kw= ')'
                    {
                    kw=(Token)match(input,36,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprsBaseHdAccess().getLeftParenthesisKeyword_0_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprsBaseHdAccess().getHdKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getExprsBaseHdAccess().getExprBaseParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_ExprBase_2=ruleExprBase();

                    state._fsp--;


                    				current.merge(this_ExprBase_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprsBaseHdAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWL.g:888:3: (kw= '(' kw= 'tl' this_ExprBase_6= ruleExprBase kw= ')' )
                    {
                    // InternalWL.g:888:3: (kw= '(' kw= 'tl' this_ExprBase_6= ruleExprBase kw= ')' )
                    // InternalWL.g:889:4: kw= '(' kw= 'tl' this_ExprBase_6= ruleExprBase kw= ')'
                    {
                    kw=(Token)match(input,36,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprsBaseHdAccess().getLeftParenthesisKeyword_1_0());
                    			
                    kw=(Token)match(input,41,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprsBaseHdAccess().getTlKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getExprsBaseHdAccess().getExprBaseParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_22);
                    this_ExprBase_6=ruleExprBase();

                    state._fsp--;


                    				current.merge(this_ExprBase_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprsBaseHdAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprsBaseHd"


    // $ANTLR start "entryRuleLExpr"
    // InternalWL.g:919:1: entryRuleLExpr returns [String current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final String entryRuleLExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLExpr = null;


        try {
            // InternalWL.g:919:45: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalWL.g:920:2: iv_ruleLExpr= ruleLExpr EOF
            {
             newCompositeNode(grammarAccess.getLExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;

             current =iv_ruleLExpr.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // InternalWL.g:926:1: ruleLExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprBase_0= ruleExprBase this_LExpr_1= ruleLExpr )? ;
    public final AntlrDatatypeRuleToken ruleLExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExprBase_0 = null;

        AntlrDatatypeRuleToken this_LExpr_1 = null;



        	enterRule();

        try {
            // InternalWL.g:932:2: ( (this_ExprBase_0= ruleExprBase this_LExpr_1= ruleLExpr )? )
            // InternalWL.g:933:2: (this_ExprBase_0= ruleExprBase this_LExpr_1= ruleLExpr )?
            {
            // InternalWL.g:933:2: (this_ExprBase_0= ruleExprBase this_LExpr_1= ruleLExpr )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_SYMBOL && LA11_0<=RULE_VARIABLE)||(LA11_0>=35 && LA11_0<=36)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWL.g:934:3: this_ExprBase_0= ruleExprBase this_LExpr_1= ruleLExpr
                    {

                    			newCompositeNode(grammarAccess.getLExprAccess().getExprBaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_14);
                    this_ExprBase_0=ruleExprBase();

                    state._fsp--;


                    			current.merge(this_ExprBase_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    			newCompositeNode(grammarAccess.getLExprAccess().getLExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LExpr_1=ruleLExpr();

                    state._fsp--;


                    			current.merge(this_LExpr_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprs"
    // InternalWL.g:958:1: entryRuleExprs returns [String current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final String entryRuleExprs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprs = null;


        try {
            // InternalWL.g:958:45: (iv_ruleExprs= ruleExprs EOF )
            // InternalWL.g:959:2: iv_ruleExprs= ruleExprs EOF
            {
             newCompositeNode(grammarAccess.getExprsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;

             current =iv_ruleExprs.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalWL.g:965:1: ruleExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expresssion_0= ruleExpresssion (kw= ',' this_Exprs_2= ruleExprs )? ) ;
    public final AntlrDatatypeRuleToken ruleExprs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expresssion_0 = null;

        AntlrDatatypeRuleToken this_Exprs_2 = null;



        	enterRule();

        try {
            // InternalWL.g:971:2: ( (this_Expresssion_0= ruleExpresssion (kw= ',' this_Exprs_2= ruleExprs )? ) )
            // InternalWL.g:972:2: (this_Expresssion_0= ruleExpresssion (kw= ',' this_Exprs_2= ruleExprs )? )
            {
            // InternalWL.g:972:2: (this_Expresssion_0= ruleExpresssion (kw= ',' this_Exprs_2= ruleExprs )? )
            // InternalWL.g:973:3: this_Expresssion_0= ruleExpresssion (kw= ',' this_Exprs_2= ruleExprs )?
            {

            			newCompositeNode(grammarAccess.getExprsAccess().getExpresssionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Expresssion_0=ruleExpresssion();

            state._fsp--;


            			current.merge(this_Expresssion_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalWL.g:983:3: (kw= ',' this_Exprs_2= ruleExprs )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWL.g:984:4: kw= ',' this_Exprs_2= ruleExprs
                    {
                    kw=(Token)match(input,21,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getExprsAccess().getExprsParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Exprs_2=ruleExprs();

                    state._fsp--;


                    				current.merge(this_Exprs_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpresssion"
    // InternalWL.g:1004:1: entryRuleExpresssion returns [String current=null] : iv_ruleExpresssion= ruleExpresssion EOF ;
    public final String entryRuleExpresssion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpresssion = null;


        try {
            // InternalWL.g:1004:51: (iv_ruleExpresssion= ruleExpresssion EOF )
            // InternalWL.g:1005:2: iv_ruleExpresssion= ruleExpresssion EOF
            {
             newCompositeNode(grammarAccess.getExpresssionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresssion=ruleExpresssion();

            state._fsp--;

             current =iv_ruleExpresssion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresssion"


    // $ANTLR start "ruleExpresssion"
    // InternalWL.g:1011:1: ruleExpresssion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprBase_0= ruleExprBase (kw= '=?' this_ExprBase_2= ruleExprBase )? ) ;
    public final AntlrDatatypeRuleToken ruleExpresssion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprBase_0 = null;

        AntlrDatatypeRuleToken this_ExprBase_2 = null;



        	enterRule();

        try {
            // InternalWL.g:1017:2: ( (this_ExprBase_0= ruleExprBase (kw= '=?' this_ExprBase_2= ruleExprBase )? ) )
            // InternalWL.g:1018:2: (this_ExprBase_0= ruleExprBase (kw= '=?' this_ExprBase_2= ruleExprBase )? )
            {
            // InternalWL.g:1018:2: (this_ExprBase_0= ruleExprBase (kw= '=?' this_ExprBase_2= ruleExprBase )? )
            // InternalWL.g:1019:3: this_ExprBase_0= ruleExprBase (kw= '=?' this_ExprBase_2= ruleExprBase )?
            {

            			newCompositeNode(grammarAccess.getExpresssionAccess().getExprBaseParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_ExprBase_0=ruleExprBase();

            state._fsp--;


            			current.merge(this_ExprBase_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalWL.g:1029:3: (kw= '=?' this_ExprBase_2= ruleExprBase )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWL.g:1030:4: kw= '=?' this_ExprBase_2= ruleExprBase
                    {
                    kw=(Token)match(input,42,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpresssionAccess().getEqualsSignQuestionMarkKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getExpresssionAccess().getExprBaseParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ExprBase_2=ruleExprBase();

                    state._fsp--;


                    				current.merge(this_ExprBase_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresssion"


    // $ANTLR start "entryRuleVars"
    // InternalWL.g:1050:1: entryRuleVars returns [String current=null] : iv_ruleVars= ruleVars EOF ;
    public final String entryRuleVars() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVars = null;


        try {
            // InternalWL.g:1050:44: (iv_ruleVars= ruleVars EOF )
            // InternalWL.g:1051:2: iv_ruleVars= ruleVars EOF
            {
             newCompositeNode(grammarAccess.getVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;

             current =iv_ruleVars.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalWL.g:1057:1: ruleVars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Vars_2= ruleVars ) | this_Variable_3= RULE_VARIABLE ) ;
    public final AntlrDatatypeRuleToken ruleVars() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Variable_0=null;
        Token kw=null;
        Token this_Variable_3=null;
        AntlrDatatypeRuleToken this_Vars_2 = null;



        	enterRule();

        try {
            // InternalWL.g:1063:2: ( ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Vars_2= ruleVars ) | this_Variable_3= RULE_VARIABLE ) )
            // InternalWL.g:1064:2: ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Vars_2= ruleVars ) | this_Variable_3= RULE_VARIABLE )
            {
            // InternalWL.g:1064:2: ( (this_Variable_0= RULE_VARIABLE kw= ',' this_Vars_2= ruleVars ) | this_Variable_3= RULE_VARIABLE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_VARIABLE) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==24) ) {
                    alt14=2;
                }
                else if ( (LA14_1==21) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalWL.g:1065:3: (this_Variable_0= RULE_VARIABLE kw= ',' this_Vars_2= ruleVars )
                    {
                    // InternalWL.g:1065:3: (this_Variable_0= RULE_VARIABLE kw= ',' this_Vars_2= ruleVars )
                    // InternalWL.g:1066:4: this_Variable_0= RULE_VARIABLE kw= ',' this_Vars_2= ruleVars
                    {
                    this_Variable_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

                    				current.merge(this_Variable_0);
                    			

                    				newLeafNode(this_Variable_0, grammarAccess.getVarsAccess().getVariableTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,21,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVarsAccess().getCommaKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getVarsAccess().getVarsParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Vars_2=ruleVars();

                    state._fsp--;


                    				current.merge(this_Vars_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWL.g:1090:3: this_Variable_3= RULE_VARIABLE
                    {
                    this_Variable_3=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    			current.merge(this_Variable_3);
                    		

                    			newLeafNode(this_Variable_3, grammarAccess.getVarsAccess().getVariableTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000322800020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001800000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003800000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000002L});

}