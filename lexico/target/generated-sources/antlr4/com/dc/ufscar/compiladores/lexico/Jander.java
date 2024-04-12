// Generated from java-escape by ANTLR 4.11.1
package com.dc.ufscar.compiladores.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Jander extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, DECLARE=2, LITERAL=3, INTEIRO=4, REAL=5, LOGICO=6, LEIA=7, 
		ESCREVA=8, SE=9, FIM_SE=10, ENTAO=11, CASO=12, SEJA=13, SENAO=14, FIM_CASO=15, 
		PARA=16, ATE=17, FACA=18, FIM_PARA=19, ENQUANTO=20, FIM_ENQUANTO=21, REGISTRO=22, 
		FIM_REGISTRO=23, TIPO=24, PROCEDIMENTO=25, FIM_PROCEDIMENTO=26, VAR=27, 
		FUNCAO=28, RETORNE=29, FIM_FUNCAO=30, CONSTANTE=31, VERDADEIRO=32, FALSO=33, 
		FIM_ALGORITMO=34, SINAL=35, NUM_INT=36, NUM_REAL=37, OP_LOGICO=38, IDENT=39, 
		PONTUACAO=40, CADEIA=41, COMENTARIO=42, WS=43, OP_REL=44, OP_ARIT=45, 
		DELIM=46, ABREPAR=47, FECHAPAR=48, ABRECHAVE=49, FECHACHAVE=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "DECLARE", "LITERAL", "INTEIRO", "REAL", "LOGICO", "LEIA", 
			"ESCREVA", "SE", "FIM_SE", "ENTAO", "CASO", "SEJA", "SENAO", "FIM_CASO", 
			"PARA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", "REGISTRO", 
			"FIM_REGISTRO", "TIPO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", "VAR", "FUNCAO", 
			"RETORNE", "FIM_FUNCAO", "CONSTANTE", "VERDADEIRO", "FALSO", "FIM_ALGORITMO", 
			"SINAL", "NUM_INT", "NUM_REAL", "OP_LOGICO", "IDENT", "PONTUACAO", "CADEIA", 
			"ESC_SEQ", "COMENTARIO", "WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", 
			"FECHAPAR", "ABRECHAVE", "FECHACHAVE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'declare'", "'literal'", "'inteiro'", "'real'", 
			"'logico'", "'leia'", "'escreva'", "'se'", "'fim_se'", "'entao'", "'caso'", 
			"'seja'", "'senao'", "'fim_caso'", "'para'", "'ate'", "'faca'", "'fim_para'", 
			"'enquanto'", "'fim_enquanto'", "'registro'", "'fim_registro'", "'tipo'", 
			"'procedimento'", "'fim_procedimento'", "'var'", "'funcao'", "'retorne'", 
			"'fim_funcao'", "'constante'", "'verdadeiro'", "'falso'", "'fim_algoritmo'", 
			"'-'", null, null, null, null, null, null, null, null, null, null, "':'", 
			"'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "DECLARE", "LITERAL", "INTEIRO", "REAL", "LOGICO", 
			"LEIA", "ESCREVA", "SE", "FIM_SE", "ENTAO", "CASO", "SEJA", "SENAO", 
			"FIM_CASO", "PARA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", 
			"REGISTRO", "FIM_REGISTRO", "TIPO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
			"VAR", "FUNCAO", "RETORNE", "FIM_FUNCAO", "CONSTANTE", "VERDADEIRO", 
			"FALSO", "FIM_ALGORITMO", "SINAL", "NUM_INT", "NUM_REAL", "OP_LOGICO", 
			"IDENT", "PONTUACAO", "CADEIA", "COMENTARIO", "WS", "OP_REL", "OP_ARIT", 
			"DELIM", "ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Jander(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jander.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 42:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00002\u01d4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0004#\u017c\b#\u000b#\f#\u017d\u0001"+
		"$\u0004$\u0181\b$\u000b$\f$\u0182\u0001$\u0001$\u0004$\u0187\b$\u000b"+
		"$\f$\u0188\u0003$\u018b\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u0193\b%\u0001&\u0001&\u0005&\u0197\b&\n&\f&\u019a\t&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01a2\b\'\u0001(\u0001(\u0001"+
		"(\u0005(\u01a7\b(\n(\f(\u01aa\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0005*\u01b3\b*\n*\f*\u01b6\t*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u01c7\b,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00011\u00011\u00012\u00012\u0000\u00003\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S\u0000U*W+Y,[-]._/"+
		"a0c1e2\u0001\u0000\u0007\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000"+
		"&&..^^\u0003\u0000\"\"\'\'\\\\\u0002\u0000\n\n}}\u0003\u0000\t\n\r\r "+
		" \u0004\u0000%%*+--//\u01e4\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0001g"+
		"\u0001\u0000\u0000\u0000\u0003q\u0001\u0000\u0000\u0000\u0005y\u0001\u0000"+
		"\u0000\u0000\u0007\u0081\u0001\u0000\u0000\u0000\t\u0089\u0001\u0000\u0000"+
		"\u0000\u000b\u008e\u0001\u0000\u0000\u0000\r\u0095\u0001\u0000\u0000\u0000"+
		"\u000f\u009a\u0001\u0000\u0000\u0000\u0011\u00a2\u0001\u0000\u0000\u0000"+
		"\u0013\u00a5\u0001\u0000\u0000\u0000\u0015\u00ac\u0001\u0000\u0000\u0000"+
		"\u0017\u00b2\u0001\u0000\u0000\u0000\u0019\u00b7\u0001\u0000\u0000\u0000"+
		"\u001b\u00bc\u0001\u0000\u0000\u0000\u001d\u00c2\u0001\u0000\u0000\u0000"+
		"\u001f\u00cb\u0001\u0000\u0000\u0000!\u00d0\u0001\u0000\u0000\u0000#\u00d4"+
		"\u0001\u0000\u0000\u0000%\u00d9\u0001\u0000\u0000\u0000\'\u00e2\u0001"+
		"\u0000\u0000\u0000)\u00eb\u0001\u0000\u0000\u0000+\u00f8\u0001\u0000\u0000"+
		"\u0000-\u0101\u0001\u0000\u0000\u0000/\u010e\u0001\u0000\u0000\u00001"+
		"\u0113\u0001\u0000\u0000\u00003\u0120\u0001\u0000\u0000\u00005\u0131\u0001"+
		"\u0000\u0000\u00007\u0135\u0001\u0000\u0000\u00009\u013c\u0001\u0000\u0000"+
		"\u0000;\u0144\u0001\u0000\u0000\u0000=\u014f\u0001\u0000\u0000\u0000?"+
		"\u0159\u0001\u0000\u0000\u0000A\u0164\u0001\u0000\u0000\u0000C\u016a\u0001"+
		"\u0000\u0000\u0000E\u0178\u0001\u0000\u0000\u0000G\u017b\u0001\u0000\u0000"+
		"\u0000I\u0180\u0001\u0000\u0000\u0000K\u0192\u0001\u0000\u0000\u0000M"+
		"\u0194\u0001\u0000\u0000\u0000O\u01a1\u0001\u0000\u0000\u0000Q\u01a3\u0001"+
		"\u0000\u0000\u0000S\u01ad\u0001\u0000\u0000\u0000U\u01b0\u0001\u0000\u0000"+
		"\u0000W\u01ba\u0001\u0000\u0000\u0000Y\u01c6\u0001\u0000\u0000\u0000["+
		"\u01c8\u0001\u0000\u0000\u0000]\u01ca\u0001\u0000\u0000\u0000_\u01cc\u0001"+
		"\u0000\u0000\u0000a\u01ce\u0001\u0000\u0000\u0000c\u01d0\u0001\u0000\u0000"+
		"\u0000e\u01d2\u0001\u0000\u0000\u0000gh\u0005a\u0000\u0000hi\u0005l\u0000"+
		"\u0000ij\u0005g\u0000\u0000jk\u0005o\u0000\u0000kl\u0005r\u0000\u0000"+
		"lm\u0005i\u0000\u0000mn\u0005t\u0000\u0000no\u0005m\u0000\u0000op\u0005"+
		"o\u0000\u0000p\u0002\u0001\u0000\u0000\u0000qr\u0005d\u0000\u0000rs\u0005"+
		"e\u0000\u0000st\u0005c\u0000\u0000tu\u0005l\u0000\u0000uv\u0005a\u0000"+
		"\u0000vw\u0005r\u0000\u0000wx\u0005e\u0000\u0000x\u0004\u0001\u0000\u0000"+
		"\u0000yz\u0005l\u0000\u0000z{\u0005i\u0000\u0000{|\u0005t\u0000\u0000"+
		"|}\u0005e\u0000\u0000}~\u0005r\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f"+
		"\u0080\u0005l\u0000\u0000\u0080\u0006\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005i\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u0084\u0005t"+
		"\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005i\u0000\u0000"+
		"\u0086\u0087\u0005r\u0000\u0000\u0087\u0088\u0005o\u0000\u0000\u0088\b"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005r\u0000\u0000\u008a\u008b\u0005"+
		"e\u0000\u0000\u008b\u008c\u0005a\u0000\u0000\u008c\u008d\u0005l\u0000"+
		"\u0000\u008d\n\u0001\u0000\u0000\u0000\u008e\u008f\u0005l\u0000\u0000"+
		"\u008f\u0090\u0005o\u0000\u0000\u0090\u0091\u0005g\u0000\u0000\u0091\u0092"+
		"\u0005i\u0000\u0000\u0092\u0093\u0005c\u0000\u0000\u0093\u0094\u0005o"+
		"\u0000\u0000\u0094\f\u0001\u0000\u0000\u0000\u0095\u0096\u0005l\u0000"+
		"\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005i\u0000\u0000\u0098"+
		"\u0099\u0005a\u0000\u0000\u0099\u000e\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005e\u0000\u0000\u009b\u009c\u0005s\u0000\u0000\u009c\u009d\u0005c"+
		"\u0000\u0000\u009d\u009e\u0005r\u0000\u0000\u009e\u009f\u0005e\u0000\u0000"+
		"\u009f\u00a0\u0005v\u0000\u0000\u00a0\u00a1\u0005a\u0000\u0000\u00a1\u0010"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005s\u0000\u0000\u00a3\u00a4\u0005"+
		"e\u0000\u0000\u00a4\u0012\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005f\u0000"+
		"\u0000\u00a6\u00a7\u0005i\u0000\u0000\u00a7\u00a8\u0005m\u0000\u0000\u00a8"+
		"\u00a9\u0005_\u0000\u0000\u00a9\u00aa\u0005s\u0000\u0000\u00aa\u00ab\u0005"+
		"e\u0000\u0000\u00ab\u0014\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005e\u0000"+
		"\u0000\u00ad\u00ae\u0005n\u0000\u0000\u00ae\u00af\u0005t\u0000\u0000\u00af"+
		"\u00b0\u0005a\u0000\u0000\u00b0\u00b1\u0005o\u0000\u0000\u00b1\u0016\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005c\u0000\u0000\u00b3\u00b4\u0005a\u0000"+
		"\u0000\u00b4\u00b5\u0005s\u0000\u0000\u00b5\u00b6\u0005o\u0000\u0000\u00b6"+
		"\u0018\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005s\u0000\u0000\u00b8\u00b9"+
		"\u0005e\u0000\u0000\u00b9\u00ba\u0005j\u0000\u0000\u00ba\u00bb\u0005a"+
		"\u0000\u0000\u00bb\u001a\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005s\u0000"+
		"\u0000\u00bd\u00be\u0005e\u0000\u0000\u00be\u00bf\u0005n\u0000\u0000\u00bf"+
		"\u00c0\u0005a\u0000\u0000\u00c0\u00c1\u0005o\u0000\u0000\u00c1\u001c\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005f\u0000\u0000\u00c3\u00c4\u0005i\u0000"+
		"\u0000\u00c4\u00c5\u0005m\u0000\u0000\u00c5\u00c6\u0005_\u0000\u0000\u00c6"+
		"\u00c7\u0005c\u0000\u0000\u00c7\u00c8\u0005a\u0000\u0000\u00c8\u00c9\u0005"+
		"s\u0000\u0000\u00c9\u00ca\u0005o\u0000\u0000\u00ca\u001e\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005p\u0000\u0000\u00cc\u00cd\u0005a\u0000\u0000\u00cd"+
		"\u00ce\u0005r\u0000\u0000\u00ce\u00cf\u0005a\u0000\u0000\u00cf \u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005a\u0000\u0000\u00d1\u00d2\u0005t\u0000"+
		"\u0000\u00d2\u00d3\u0005e\u0000\u0000\u00d3\"\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0005f\u0000\u0000\u00d5\u00d6\u0005a\u0000\u0000\u00d6\u00d7"+
		"\u0005c\u0000\u0000\u00d7\u00d8\u0005a\u0000\u0000\u00d8$\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005f\u0000\u0000\u00da\u00db\u0005i\u0000\u0000"+
		"\u00db\u00dc\u0005m\u0000\u0000\u00dc\u00dd\u0005_\u0000\u0000\u00dd\u00de"+
		"\u0005p\u0000\u0000\u00de\u00df\u0005a\u0000\u0000\u00df\u00e0\u0005r"+
		"\u0000\u0000\u00e0\u00e1\u0005a\u0000\u0000\u00e1&\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005e\u0000\u0000\u00e3\u00e4\u0005n\u0000\u0000\u00e4\u00e5"+
		"\u0005q\u0000\u0000\u00e5\u00e6\u0005u\u0000\u0000\u00e6\u00e7\u0005a"+
		"\u0000\u0000\u00e7\u00e8\u0005n\u0000\u0000\u00e8\u00e9\u0005t\u0000\u0000"+
		"\u00e9\u00ea\u0005o\u0000\u0000\u00ea(\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005f\u0000\u0000\u00ec\u00ed\u0005i\u0000\u0000\u00ed\u00ee\u0005m"+
		"\u0000\u0000\u00ee\u00ef\u0005_\u0000\u0000\u00ef\u00f0\u0005e\u0000\u0000"+
		"\u00f0\u00f1\u0005n\u0000\u0000\u00f1\u00f2\u0005q\u0000\u0000\u00f2\u00f3"+
		"\u0005u\u0000\u0000\u00f3\u00f4\u0005a\u0000\u0000\u00f4\u00f5\u0005n"+
		"\u0000\u0000\u00f5\u00f6\u0005t\u0000\u0000\u00f6\u00f7\u0005o\u0000\u0000"+
		"\u00f7*\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005r\u0000\u0000\u00f9\u00fa"+
		"\u0005e\u0000\u0000\u00fa\u00fb\u0005g\u0000\u0000\u00fb\u00fc\u0005i"+
		"\u0000\u0000\u00fc\u00fd\u0005s\u0000\u0000\u00fd\u00fe\u0005t\u0000\u0000"+
		"\u00fe\u00ff\u0005r\u0000\u0000\u00ff\u0100\u0005o\u0000\u0000\u0100,"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0005f\u0000\u0000\u0102\u0103\u0005"+
		"i\u0000\u0000\u0103\u0104\u0005m\u0000\u0000\u0104\u0105\u0005_\u0000"+
		"\u0000\u0105\u0106\u0005r\u0000\u0000\u0106\u0107\u0005e\u0000\u0000\u0107"+
		"\u0108\u0005g\u0000\u0000\u0108\u0109\u0005i\u0000\u0000\u0109\u010a\u0005"+
		"s\u0000\u0000\u010a\u010b\u0005t\u0000\u0000\u010b\u010c\u0005r\u0000"+
		"\u0000\u010c\u010d\u0005o\u0000\u0000\u010d.\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0005t\u0000\u0000\u010f\u0110\u0005i\u0000\u0000\u0110\u0111\u0005"+
		"p\u0000\u0000\u0111\u0112\u0005o\u0000\u0000\u01120\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005p\u0000\u0000\u0114\u0115\u0005r\u0000\u0000\u0115"+
		"\u0116\u0005o\u0000\u0000\u0116\u0117\u0005c\u0000\u0000\u0117\u0118\u0005"+
		"e\u0000\u0000\u0118\u0119\u0005d\u0000\u0000\u0119\u011a\u0005i\u0000"+
		"\u0000\u011a\u011b\u0005m\u0000\u0000\u011b\u011c\u0005e\u0000\u0000\u011c"+
		"\u011d\u0005n\u0000\u0000\u011d\u011e\u0005t\u0000\u0000\u011e\u011f\u0005"+
		"o\u0000\u0000\u011f2\u0001\u0000\u0000\u0000\u0120\u0121\u0005f\u0000"+
		"\u0000\u0121\u0122\u0005i\u0000\u0000\u0122\u0123\u0005m\u0000\u0000\u0123"+
		"\u0124\u0005_\u0000\u0000\u0124\u0125\u0005p\u0000\u0000\u0125\u0126\u0005"+
		"r\u0000\u0000\u0126\u0127\u0005o\u0000\u0000\u0127\u0128\u0005c\u0000"+
		"\u0000\u0128\u0129\u0005e\u0000\u0000\u0129\u012a\u0005d\u0000\u0000\u012a"+
		"\u012b\u0005i\u0000\u0000\u012b\u012c\u0005m\u0000\u0000\u012c\u012d\u0005"+
		"e\u0000\u0000\u012d\u012e\u0005n\u0000\u0000\u012e\u012f\u0005t\u0000"+
		"\u0000\u012f\u0130\u0005o\u0000\u0000\u01304\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0005v\u0000\u0000\u0132\u0133\u0005a\u0000\u0000\u0133\u0134\u0005"+
		"r\u0000\u0000\u01346\u0001\u0000\u0000\u0000\u0135\u0136\u0005f\u0000"+
		"\u0000\u0136\u0137\u0005u\u0000\u0000\u0137\u0138\u0005n\u0000\u0000\u0138"+
		"\u0139\u0005c\u0000\u0000\u0139\u013a\u0005a\u0000\u0000\u013a\u013b\u0005"+
		"o\u0000\u0000\u013b8\u0001\u0000\u0000\u0000\u013c\u013d\u0005r\u0000"+
		"\u0000\u013d\u013e\u0005e\u0000\u0000\u013e\u013f\u0005t\u0000\u0000\u013f"+
		"\u0140\u0005o\u0000\u0000\u0140\u0141\u0005r\u0000\u0000\u0141\u0142\u0005"+
		"n\u0000\u0000\u0142\u0143\u0005e\u0000\u0000\u0143:\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005f\u0000\u0000\u0145\u0146\u0005i\u0000\u0000\u0146"+
		"\u0147\u0005m\u0000\u0000\u0147\u0148\u0005_\u0000\u0000\u0148\u0149\u0005"+
		"f\u0000\u0000\u0149\u014a\u0005u\u0000\u0000\u014a\u014b\u0005n\u0000"+
		"\u0000\u014b\u014c\u0005c\u0000\u0000\u014c\u014d\u0005a\u0000\u0000\u014d"+
		"\u014e\u0005o\u0000\u0000\u014e<\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"c\u0000\u0000\u0150\u0151\u0005o\u0000\u0000\u0151\u0152\u0005n\u0000"+
		"\u0000\u0152\u0153\u0005s\u0000\u0000\u0153\u0154\u0005t\u0000\u0000\u0154"+
		"\u0155\u0005a\u0000\u0000\u0155\u0156\u0005n\u0000\u0000\u0156\u0157\u0005"+
		"t\u0000\u0000\u0157\u0158\u0005e\u0000\u0000\u0158>\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0005v\u0000\u0000\u015a\u015b\u0005e\u0000\u0000\u015b"+
		"\u015c\u0005r\u0000\u0000\u015c\u015d\u0005d\u0000\u0000\u015d\u015e\u0005"+
		"a\u0000\u0000\u015e\u015f\u0005d\u0000\u0000\u015f\u0160\u0005e\u0000"+
		"\u0000\u0160\u0161\u0005i\u0000\u0000\u0161\u0162\u0005r\u0000\u0000\u0162"+
		"\u0163\u0005o\u0000\u0000\u0163@\u0001\u0000\u0000\u0000\u0164\u0165\u0005"+
		"f\u0000\u0000\u0165\u0166\u0005a\u0000\u0000\u0166\u0167\u0005l\u0000"+
		"\u0000\u0167\u0168\u0005s\u0000\u0000\u0168\u0169\u0005o\u0000\u0000\u0169"+
		"B\u0001\u0000\u0000\u0000\u016a\u016b\u0005f\u0000\u0000\u016b\u016c\u0005"+
		"i\u0000\u0000\u016c\u016d\u0005m\u0000\u0000\u016d\u016e\u0005_\u0000"+
		"\u0000\u016e\u016f\u0005a\u0000\u0000\u016f\u0170\u0005l\u0000\u0000\u0170"+
		"\u0171\u0005g\u0000\u0000\u0171\u0172\u0005o\u0000\u0000\u0172\u0173\u0005"+
		"r\u0000\u0000\u0173\u0174\u0005i\u0000\u0000\u0174\u0175\u0005t\u0000"+
		"\u0000\u0175\u0176\u0005m\u0000\u0000\u0176\u0177\u0005o\u0000\u0000\u0177"+
		"D\u0001\u0000\u0000\u0000\u0178\u0179\u0005-\u0000\u0000\u0179F\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u000209\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017eH\u0001\u0000\u0000\u0000"+
		"\u017f\u0181\u000209\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183\u018a\u0001\u0000\u0000\u0000\u0184\u0186"+
		"\u0005.\u0000\u0000\u0185\u0187\u000209\u0000\u0186\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000"+
		"\u0000\u0000\u018a\u0184\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000"+
		"\u0000\u0000\u018bJ\u0001\u0000\u0000\u0000\u018c\u0193\u0005e\u0000\u0000"+
		"\u018d\u018e\u0005o\u0000\u0000\u018e\u0193\u0005u\u0000\u0000\u018f\u0190"+
		"\u0005n\u0000\u0000\u0190\u0191\u0005a\u0000\u0000\u0191\u0193\u0005o"+
		"\u0000\u0000\u0192\u018c\u0001\u0000\u0000\u0000\u0192\u018d\u0001\u0000"+
		"\u0000\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0193L\u0001\u0000\u0000"+
		"\u0000\u0194\u0198\u0007\u0000\u0000\u0000\u0195\u0197\u0007\u0001\u0000"+
		"\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000"+
		"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u0199N\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u01a2\u0005,\u0000\u0000\u019c\u019d\u0005.\u0000\u0000\u019d\u01a2"+
		"\u0005.\u0000\u0000\u019e\u019f\u0005<\u0000\u0000\u019f\u01a2\u0005-"+
		"\u0000\u0000\u01a0\u01a2\u0007\u0002\u0000\u0000\u01a1\u019b\u0001\u0000"+
		"\u0000\u0000\u01a1\u019c\u0001\u0000\u0000\u0000\u01a1\u019e\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2P\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a8\u0005\"\u0000\u0000\u01a4\u01a7\u0003S)\u0000\u01a5"+
		"\u01a7\b\u0003\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0005\"\u0000\u0000\u01acR\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005"+
		"\\\u0000\u0000\u01ae\u01af\u0005\'\u0000\u0000\u01afT\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b4\u0005{\u0000\u0000\u01b1\u01b3\b\u0004\u0000\u0000"+
		"\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0005}\u0000\u0000\u01b8\u01b9\u0006*\u0000\u0000\u01b9V"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0007\u0005\u0000\u0000\u01bb\u01bc"+
		"\u0006+\u0001\u0000\u01bcX\u0001\u0000\u0000\u0000\u01bd\u01c7\u0005>"+
		"\u0000\u0000\u01be\u01bf\u0005>\u0000\u0000\u01bf\u01c7\u0005=\u0000\u0000"+
		"\u01c0\u01c7\u0005<\u0000\u0000\u01c1\u01c2\u0005<\u0000\u0000\u01c2\u01c7"+
		"\u0005=\u0000\u0000\u01c3\u01c4\u0005<\u0000\u0000\u01c4\u01c7\u0005>"+
		"\u0000\u0000\u01c5\u01c7\u0005=\u0000\u0000\u01c6\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c6\u01be\u0001\u0000\u0000\u0000\u01c6\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c1\u0001\u0000\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7Z\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0007\u0006\u0000\u0000\u01c9\\\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0005:\u0000\u0000\u01cb^\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005"+
		"(\u0000\u0000\u01cd`\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005)\u0000"+
		"\u0000\u01cfb\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005[\u0000\u0000\u01d1"+
		"d\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005]\u0000\u0000\u01d3f\u0001"+
		"\u0000\u0000\u0000\f\u0000\u017d\u0182\u0188\u018a\u0192\u0198\u01a1\u01a6"+
		"\u01a8\u01b4\u01c6\u0002\u0001*\u0000\u0001+\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}