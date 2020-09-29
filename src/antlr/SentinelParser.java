// Generated from src/antlr/Sentinel.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SentinelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OP_ADD=8, OP_SUB=9, 
		OP_MUL=10, OP_DIV=11, LITERAL=12, INT_LITERAL=13, FLOAT_LITERAL=14, STRING_LITERAL=15, 
		NUM=16, ID=17, WATCHABLE_ID=18, WS=19;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr"
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

	@Override
	public String getGrammarFileName() { return "Sentinel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SentinelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SentinelParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(6);
				statement();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualStatementContext extends StatementContext {
		public Token typeName;
		public Token varName;
		public Token varNameOther;
		public Token literalValue;
		public List<TerminalNode> ID() { return getTokens(SentinelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SentinelParser.ID, i);
		}
		public TerminalNode LITERAL() { return getToken(SentinelParser.LITERAL, 0); }
		public EqualStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterEqualStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitEqualStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitEqualStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WatchesStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(SentinelParser.ID, 0); }
		public TerminalNode WATCHABLE_ID() { return getToken(SentinelParser.WATCHABLE_ID, 0); }
		public WatchesStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterWatchesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitWatchesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitWatchesStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoParamWatcherDefContext extends StatementContext {
		public Token watcherName;
		public Token type;
		public Token varName0;
		public Token varName1;
		public List<TerminalNode> ID() { return getTokens(SentinelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SentinelParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TwoParamWatcherDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterTwoParamWatcherDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitTwoParamWatcherDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitTwoParamWatcherDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneParamWatcherDefContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(SentinelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SentinelParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OneParamWatcherDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterOneParamWatcherDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitOneParamWatcherDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitOneParamWatcherDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TwoParamWatcherDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((TwoParamWatcherDefContext)_localctx).watcherName = match(ID);
				setState(15);
				match(T__0);
				setState(16);
				((TwoParamWatcherDefContext)_localctx).type = match(ID);
				setState(17);
				((TwoParamWatcherDefContext)_localctx).varName0 = match(ID);
				setState(18);
				match(T__1);
				setState(19);
				((TwoParamWatcherDefContext)_localctx).type = match(ID);
				setState(20);
				((TwoParamWatcherDefContext)_localctx).varName1 = match(ID);
				setState(21);
				match(T__2);
				setState(22);
				match(T__3);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(23);
					statement();
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new OneParamWatcherDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(ID);
				setState(31);
				match(T__0);
				setState(32);
				match(ID);
				setState(33);
				match(ID);
				setState(34);
				match(T__2);
				setState(35);
				match(T__3);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(36);
					statement();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new WatchesStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(ID);
				setState(44);
				match(T__5);
				setState(45);
				match(WATCHABLE_ID);
				}
				break;
			case 4:
				_localctx = new EqualStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				((EqualStatementContext)_localctx).typeName = match(ID);
				setState(47);
				((EqualStatementContext)_localctx).varName = match(ID);
				setState(48);
				match(T__6);
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(49);
					((EqualStatementContext)_localctx).varNameOther = match(ID);
					}
					break;
				case LITERAL:
					{
					setState(50);
					((EqualStatementContext)_localctx).literalValue = match(LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InfixExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_MUL() { return getToken(SentinelParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(SentinelParser.OP_DIV, 0); }
		public TerminalNode OP_ADD() { return getToken(SentinelParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(SentinelParser.OP_SUB, 0); }
		public InfixExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OP_ADD() { return getToken(SentinelParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(SentinelParser.OP_SUB, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends ExprContext {
		public Token value;
		public TerminalNode NUM() { return getToken(SentinelParser.NUM, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentinelListener ) ((SentinelListener)listener).exitParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentinelVisitor ) return ((SentinelVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(56);
				match(T__0);
				setState(57);
				expr(0);
				setState(58);
				match(T__2);
				}
				break;
			case OP_ADD:
			case OP_SUB:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_ADD || _la==OP_SUB) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
				expr(4);
				}
				break;
			case NUM:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				((NumberExprContext)_localctx).value = match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_MUL || _la==OP_DIV) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						((InfixExprContext)_localctx).right = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						((InfixExprContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\66\n\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\n\13"+
		"\3\2\f\r\2V\2\13\3\2\2\2\4\67\3\2\2\2\6A\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2"+
		"\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13\3\2\2\2\16"+
		"\17\7\2\2\3\17\3\3\2\2\2\20\21\7\23\2\2\21\22\7\3\2\2\22\23\7\23\2\2\23"+
		"\24\7\23\2\2\24\25\7\4\2\2\25\26\7\23\2\2\26\27\7\23\2\2\27\30\7\5\2\2"+
		"\30\34\7\6\2\2\31\33\5\4\3\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2"+
		"\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\378\7\7\2\2 !\7\23\2\2!\"\7"+
		"\3\2\2\"#\7\23\2\2#$\7\23\2\2$%\7\5\2\2%)\7\6\2\2&(\5\4\3\2\'&\3\2\2\2"+
		"(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,8\7\7\2\2-.\7\23\2"+
		"\2./\7\b\2\2/8\7\24\2\2\60\61\7\23\2\2\61\62\7\23\2\2\62\65\7\t\2\2\63"+
		"\66\7\23\2\2\64\66\7\16\2\2\65\63\3\2\2\2\65\64\3\2\2\2\668\3\2\2\2\67"+
		"\20\3\2\2\2\67 \3\2\2\2\67-\3\2\2\2\67\60\3\2\2\28\5\3\2\2\29:\b\4\1\2"+
		":;\7\3\2\2;<\5\6\4\2<=\7\5\2\2=B\3\2\2\2>?\t\2\2\2?B\5\6\4\6@B\7\22\2"+
		"\2A9\3\2\2\2A>\3\2\2\2A@\3\2\2\2BK\3\2\2\2CD\f\5\2\2DE\t\3\2\2EJ\5\6\4"+
		"\6FG\f\4\2\2GH\t\2\2\2HJ\5\6\4\5IC\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2L\7\3\2\2\2MK\3\2\2\2\n\13\34)\65\67AIK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}