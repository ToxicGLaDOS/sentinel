// Generated from src/antlr/Sentinel.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SentinelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP_ADD=1, OP_SUB=2, OP_MUL=3, OP_DIV=4, WATCHES=5, EQUALS=6, LEFT_PAREN=7, 
		RIGHT_PAREN=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, COMMA=11, LITERAL=12, 
		NUM=13, ID=14, WATCHABLE_ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "WATCHES", "EQUALS", "LEFT_PAREN", 
			"RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "LITERAL", "NUM", 
			"ID", "WATCHABLE_ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'watches'", "'='", "'('", "')'", "'{'", 
			"'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "WATCHES", "EQUALS", "LEFT_PAREN", 
			"RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "LITERAL", "NUM", 
			"ID", "WATCHABLE_ID", "WS"
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


	public SentinelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sentinel.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\5\rI\n\r\3\16\3\16\5\16M\n\16\3\17\6\17P\n\17\r\17\16\17"+
		"Q\3\17\7\17U\n\17\f\17\16\17X\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"`\n\20\3\20\3\20\5\20d\n\20\3\21\6\21g\n\21\r\21\16\21h\3\22\6\22l\n\22"+
		"\r\22\16\22m\3\22\3\22\6\22r\n\22\r\22\16\22s\3\22\3\22\5\22x\n\22\3\22"+
		"\6\22{\n\22\r\22\16\22|\5\22\177\n\22\3\23\3\23\7\23\u0083\n\23\f\23\16"+
		"\23\u0086\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\u0084\2\25\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2"+
		"%\2\'\22\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2GGgg\4\2--//\5\2\13"+
		"\f\17\17\"\"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2"+
		"\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2"+
		"\2\2\31H\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37Y\3\2\2\2!f\3\2\2\2#k\3\2\2"+
		"\2%\u0080\3\2\2\2\'\u0089\3\2\2\2)*\7-\2\2*\4\3\2\2\2+,\7/\2\2,\6\3\2"+
		"\2\2-.\7,\2\2.\b\3\2\2\2/\60\7\61\2\2\60\n\3\2\2\2\61\62\7y\2\2\62\63"+
		"\7c\2\2\63\64\7v\2\2\64\65\7e\2\2\65\66\7j\2\2\66\67\7g\2\2\678\7u\2\2"+
		"8\f\3\2\2\29:\7?\2\2:\16\3\2\2\2;<\7*\2\2<\20\3\2\2\2=>\7+\2\2>\22\3\2"+
		"\2\2?@\7}\2\2@\24\3\2\2\2AB\7\177\2\2B\26\3\2\2\2CD\7.\2\2D\30\3\2\2\2"+
		"EI\5!\21\2FI\5#\22\2GI\5%\23\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\32\3\2\2"+
		"\2JM\5!\21\2KM\5#\22\2LJ\3\2\2\2LK\3\2\2\2M\34\3\2\2\2NP\t\2\2\2ON\3\2"+
		"\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RV\3\2\2\2SU\t\3\2\2TS\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2W\36\3\2\2\2XV\3\2\2\2Yc\5\35\17\2Z_\7]\2\2[`"+
		"\5%\23\2\\`\5!\21\2]`\5#\22\2^`\5\35\17\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2"+
		"\2_^\3\2\2\2`a\3\2\2\2ab\7_\2\2bd\3\2\2\2cZ\3\2\2\2cd\3\2\2\2d \3\2\2"+
		"\2eg\t\4\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\"\3\2\2\2jl\t\4"+
		"\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\7\60\2\2pr\t"+
		"\4\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t~\3\2\2\2uw\t\5\2\2vx\t"+
		"\6\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\177\3\2\2\2~u\3\2\2\2~\177\3\2\2\2\177$\3\2\2\2\u0080"+
		"\u0084\7$\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088&\3\2\2\2\u0089\u008a\t\7\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\24\2\2\u008c(\3\2\2\2\20\2HLQV_chmsw|~\u0084"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}