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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OP_ADD=8, OP_SUB=9, 
		OP_MUL=10, OP_DIV=11, LITERAL=12, INT_LITERAL=13, FLOAT_LITERAL=14, STRING_LITERAL=15, 
		NUM=16, ID=17, WATCHABLE_ID=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "OP_ADD", "OP_SUB", 
			"OP_MUL", "OP_DIV", "LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"NUM", "ID", "WATCHABLE_ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'watches'", "'='", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OP_ADD", "OP_SUB", "OP_MUL", 
			"OP_DIV", "LITERAL", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"NUM", "ID", "WATCHABLE_ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\5\rI\n\r\3\16\6\16L\n\16\r\16\16\16M\3\17\6\17Q\n\17\r\17"+
		"\16\17R\3\17\3\17\6\17W\n\17\r\17\16\17X\3\17\3\17\5\17]\n\17\3\17\6\17"+
		"`\n\17\r\17\16\17a\5\17d\n\17\3\20\3\20\7\20h\n\20\f\20\16\20k\13\20\3"+
		"\20\3\20\3\21\3\21\5\21q\n\21\3\22\6\22t\n\22\r\22\16\22u\3\22\7\22y\n"+
		"\22\f\22\16\22|\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0084\n\23\3"+
		"\23\3\23\5\23\u0088\n\23\3\24\3\24\3\24\3\24\3i\2\25\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25\3\2\b\3\2\62;\4\2GGgg\4\2--//\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2"+
		"\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23"+
		"?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31H\3\2\2\2\33K\3\2\2\2\35P\3\2\2\2"+
		"\37e\3\2\2\2!p\3\2\2\2#s\3\2\2\2%}\3\2\2\2\'\u0089\3\2\2\2)*\7*\2\2*\4"+
		"\3\2\2\2+,\7.\2\2,\6\3\2\2\2-.\7+\2\2.\b\3\2\2\2/\60\7}\2\2\60\n\3\2\2"+
		"\2\61\62\7\177\2\2\62\f\3\2\2\2\63\64\7y\2\2\64\65\7c\2\2\65\66\7v\2\2"+
		"\66\67\7e\2\2\678\7j\2\289\7g\2\29:\7u\2\2:\16\3\2\2\2;<\7?\2\2<\20\3"+
		"\2\2\2=>\7-\2\2>\22\3\2\2\2?@\7/\2\2@\24\3\2\2\2AB\7,\2\2B\26\3\2\2\2"+
		"CD\7\61\2\2D\30\3\2\2\2EI\5\33\16\2FI\5\35\17\2GI\5\37\20\2HE\3\2\2\2"+
		"HF\3\2\2\2HG\3\2\2\2I\32\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2N\34\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2ST\3\2\2\2TV\7\60\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Yc\3\2\2\2Z\\\t\3\2\2[]\t\4\2\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2"+
		"^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2cZ\3\2\2\2"+
		"cd\3\2\2\2d\36\3\2\2\2ei\7$\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2"+
		"\2ig\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7$\2\2m \3\2\2\2nq\5\33\16\2oq\5\35"+
		"\17\2pn\3\2\2\2po\3\2\2\2q\"\3\2\2\2rt\t\5\2\2sr\3\2\2\2tu\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vz\3\2\2\2wy\t\6\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{$\3\2\2\2|z\3\2\2\2}\u0087\5#\22\2~\u0083\7]\2\2\177\u0084\5\37"+
		"\20\2\u0080\u0084\5\33\16\2\u0081\u0084\5\35\17\2\u0082\u0084\5#\22\2"+
		"\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7_\2\2\u0086\u0088\3\2\2\2\u0087"+
		"~\3\2\2\2\u0087\u0088\3\2\2\2\u0088&\3\2\2\2\u0089\u008a\t\7\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\24\2\2\u008c(\3\2\2\2\20\2HMRX\\acipuz\u0083"+
		"\u0087\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}