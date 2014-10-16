package de.cau.cs.se.instrumentation.rl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecordLangLexer extends Lexer {
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=7;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int RULE_NUMBER=9;
    public static final int T__14=14;
    public static final int RULE_INT=6;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalRecordLangLexer() {;} 
    public InternalRecordLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRecordLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:11:7: ( 'package' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:12:7: ( 'import' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:13:7: ( 'use' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:13:9: 'use'
            {
            match("use"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:14:7: ( 'template' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:14:9: 'template'
            {
            match("template"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:15:7: ( '@author' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:15:9: '@author'
            {
            match("@author"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:16:7: ( '@since' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:16:9: '@since'
            {
            match("@since"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:17:7: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:17:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:18:7: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:18:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:19:7: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:19:9: '{'
            {
            match('{'); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:20:7: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:20:9: '}'
            {
            match('}'); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:21:7: ( 'entity' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:21:9: 'entity'
            {
            match("entity"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:22:7: ( 'extends' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:22:9: 'extends'
            {
            match("extends"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:23:7: ( 'const' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:23:9: 'const'
            {
            match("const"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:24:7: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:24:9: '='
            {
            match('='); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:25:7: ( 'alias' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:25:9: 'alias'
            {
            match("alias"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:26:7: ( 'as' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:26:9: 'as'
            {
            match("as"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:27:7: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:27:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:28:7: ( '[' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:28:9: '['
            {
            match('['); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:29:7: ( ']' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:29:9: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:30:7: ( '*' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:30:9: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:31:7: ( 'abstract' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:31:9: 'abstract'
            {
            match("abstract"); 


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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:32:7: ( 'KIEKER_VERSION' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:32:9: 'KIEKER_VERSION'
            {
            match("KIEKER_VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4539:22: ( '0' .. '9' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4539:24: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4541:10: ( ( '-' )? ( RULE_NUMBER )+ )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4541:12: ( '-' )? ( RULE_NUMBER )+
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4541:12: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4541:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4541:17: ( RULE_NUMBER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4541:17: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:12: ( ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:14: ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:14: ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:15: ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:15: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:20: ( RULE_NUMBER )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:20: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:37: ( RULE_NUMBER )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:37: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:50: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:51: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:61: ( '+' | '-' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='+'||LA6_0=='-') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:72: ( RULE_NUMBER )+
                            int cnt7=0;
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:72: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt7 >= 1 ) break loop7;
                                        EarlyExitException eee =
                                            new EarlyExitException(7, input);
                                        throw eee;
                                }
                                cnt7++;
                            } while (true);


                            }
                            break;

                    }

                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:87: ( 'f' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='f') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:87: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:92: ( '-' )? ( RULE_NUMBER )+ 'f'
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:92: ( '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:92: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:97: ( RULE_NUMBER )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4543:97: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    match('f'); 

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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4545:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4545:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4545:16: ( 'true' | 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='t') ) {
                alt13=1;
            }
            else if ( (LA13_0=='f') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4545:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4545:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4547:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4547:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4547:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4547:11: '^'
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

            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4547:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:
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
            	    break loop15;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4549:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop17;
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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4551:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4551:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4551:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4551:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:41: '\\r'
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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4555:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4555:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4555:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4557:16: ( . )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4557:18: .
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
        // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=31;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:151: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:162: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:175: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:183: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:195: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:211: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:227: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1:235: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA12_eotS =
        "\5\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA12_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\3\1\uffff\12\2\54\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "4543:14: ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\4\36\1\34\4\uffff\2\36\1\uffff\1\36\4\uffff\1\36\1\34\1"+
        "\66\1\36\1\34\1\uffff\3\34\2\uffff\1\36\1\uffff\4\36\6\uffff\3\36"+
        "\1\uffff\1\36\1\106\1\36\4\uffff\1\36\1\66\2\uffff\1\36\4\uffff"+
        "\2\36\1\114\6\36\1\uffff\5\36\1\uffff\1\36\1\131\12\36\1\uffff\2"+
        "\36\1\146\1\147\2\36\1\131\1\36\1\153\1\36\1\155\1\36\2\uffff\2"+
        "\36\1\161\1\uffff\1\36\1\uffff\1\163\2\36\1\uffff\1\166\1\uffff"+
        "\1\167\1\36\2\uffff\5\36\1\176\1\uffff";
    static final String DFA24_eofS =
        "\177\uffff";
    static final String DFA24_minS =
        "\1\0\1\141\1\155\1\163\1\145\1\141\4\uffff\1\156\1\157\1\uffff\1"+
        "\142\4\uffff\1\111\1\60\1\56\1\141\1\101\1\uffff\2\0\1\52\2\uffff"+
        "\1\143\1\uffff\1\160\1\145\1\155\1\165\6\uffff\2\164\1\156\1\uffff"+
        "\1\151\1\60\1\163\4\uffff\1\105\1\56\2\uffff\1\154\4\uffff\1\153"+
        "\1\157\1\60\1\160\1\145\1\151\1\145\1\163\1\141\1\uffff\1\164\1"+
        "\113\1\163\1\141\1\162\1\uffff\1\154\1\60\1\164\1\156\1\164\1\163"+
        "\1\162\1\105\1\145\1\147\1\164\1\141\1\uffff\1\171\1\144\2\60\1"+
        "\141\1\122\1\60\1\145\1\60\1\164\1\60\1\163\2\uffff\1\143\1\137"+
        "\1\60\1\uffff\1\145\1\uffff\1\60\1\164\1\126\1\uffff\1\60\1\uffff"+
        "\1\60\1\105\2\uffff\1\122\1\123\1\111\1\117\1\116\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\141\1\155\1\163\1\162\1\163\4\uffff\1\170\1\157\1\uffff"+
        "\1\163\4\uffff\1\111\1\71\1\146\1\141\1\172\1\uffff\2\uffff\1\57"+
        "\2\uffff\1\143\1\uffff\1\160\1\145\1\155\1\165\6\uffff\2\164\1\156"+
        "\1\uffff\1\151\1\172\1\163\4\uffff\1\105\1\146\2\uffff\1\154\4\uffff"+
        "\1\153\1\157\1\172\1\160\1\145\1\151\1\145\1\163\1\141\1\uffff\1"+
        "\164\1\113\1\163\1\141\1\162\1\uffff\1\154\1\172\1\164\1\156\1\164"+
        "\1\163\1\162\1\105\1\145\1\147\1\164\1\141\1\uffff\1\171\1\144\2"+
        "\172\1\141\1\122\1\172\1\145\1\172\1\164\1\172\1\163\2\uffff\1\143"+
        "\1\137\1\172\1\uffff\1\145\1\uffff\1\172\1\164\1\126\1\uffff\1\172"+
        "\1\uffff\1\172\1\105\2\uffff\1\122\1\123\1\111\1\117\1\116\1\172"+
        "\1\uffff";
    static final String DFA24_acceptS =
        "\6\uffff\1\7\1\10\1\11\1\12\2\uffff\1\16\1\uffff\1\21\1\22\1\23"+
        "\1\24\5\uffff\1\32\3\uffff\1\36\1\37\1\uffff\1\32\4\uffff\1\5\1"+
        "\6\1\7\1\10\1\11\1\12\3\uffff\1\16\3\uffff\1\21\1\22\1\23\1\24\2"+
        "\uffff\1\27\1\30\1\uffff\1\33\1\34\1\35\1\36\11\uffff\1\20\5\uffff"+
        "\1\3\14\uffff\1\31\14\uffff\1\15\1\17\3\uffff\1\2\1\uffff\1\13\3"+
        "\uffff\1\1\1\uffff\1\14\2\uffff\1\4\1\25\6\uffff\1\26";
    static final String DFA24_specialS =
        "\1\2\27\uffff\1\1\1\0\145\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\2\34\1"+
            "\21\1\34\1\7\1\23\1\16\1\32\12\24\1\6\2\34\1\14\2\34\1\5\12"+
            "\27\1\22\17\27\1\17\1\34\1\20\1\26\1\27\1\34\1\15\1\27\1\13"+
            "\1\27\1\12\1\25\2\27\1\2\6\27\1\1\3\27\1\4\1\3\5\27\1\10\1\34"+
            "\1\11\uff82\34",
            "\1\35",
            "\1\37",
            "\1\40",
            "\1\41\14\uffff\1\42",
            "\1\43\21\uffff\1\44",
            "",
            "",
            "",
            "",
            "\1\51\11\uffff\1\52",
            "\1\53",
            "",
            "\1\57\11\uffff\1\55\6\uffff\1\56",
            "",
            "",
            "",
            "",
            "\1\64",
            "\12\65",
            "\1\67\1\uffff\12\65\54\uffff\1\67",
            "\1\70",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\107",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\67\1\uffff\12\65\54\uffff\1\67",
            "",
            "",
            "\1\111",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\150",
            "\1\151",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\152",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\154",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\156",
            "",
            "",
            "\1\157",
            "\1\160",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\162",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\164",
            "\1\165",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_25 = input.LA(1);

                        s = -1;
                        if ( ((LA24_25>='\u0000' && LA24_25<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_24 = input.LA(1);

                        s = -1;
                        if ( ((LA24_24>='\u0000' && LA24_24<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='p') ) {s = 1;}

                        else if ( (LA24_0=='i') ) {s = 2;}

                        else if ( (LA24_0=='u') ) {s = 3;}

                        else if ( (LA24_0=='t') ) {s = 4;}

                        else if ( (LA24_0=='@') ) {s = 5;}

                        else if ( (LA24_0==':') ) {s = 6;}

                        else if ( (LA24_0==',') ) {s = 7;}

                        else if ( (LA24_0=='{') ) {s = 8;}

                        else if ( (LA24_0=='}') ) {s = 9;}

                        else if ( (LA24_0=='e') ) {s = 10;}

                        else if ( (LA24_0=='c') ) {s = 11;}

                        else if ( (LA24_0=='=') ) {s = 12;}

                        else if ( (LA24_0=='a') ) {s = 13;}

                        else if ( (LA24_0=='.') ) {s = 14;}

                        else if ( (LA24_0=='[') ) {s = 15;}

                        else if ( (LA24_0==']') ) {s = 16;}

                        else if ( (LA24_0=='*') ) {s = 17;}

                        else if ( (LA24_0=='K') ) {s = 18;}

                        else if ( (LA24_0=='-') ) {s = 19;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 20;}

                        else if ( (LA24_0=='f') ) {s = 21;}

                        else if ( (LA24_0=='^') ) {s = 22;}

                        else if ( ((LA24_0>='A' && LA24_0<='J')||(LA24_0>='L' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='b'||LA24_0=='d'||(LA24_0>='g' && LA24_0<='h')||(LA24_0>='j' && LA24_0<='o')||(LA24_0>='q' && LA24_0<='s')||(LA24_0>='v' && LA24_0<='z')) ) {s = 23;}

                        else if ( (LA24_0=='\"') ) {s = 24;}

                        else if ( (LA24_0=='\'') ) {s = 25;}

                        else if ( (LA24_0=='/') ) {s = 26;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 27;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='#' && LA24_0<='&')||(LA24_0>='(' && LA24_0<=')')||LA24_0=='+'||(LA24_0>=';' && LA24_0<='<')||(LA24_0>='>' && LA24_0<='?')||LA24_0=='\\'||LA24_0=='`'||LA24_0=='|'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}