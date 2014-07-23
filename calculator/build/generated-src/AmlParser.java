// Generated from /Users/twer/antlr/calculator/src/main/antlr4/Aml.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AmlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, DECIMAL=8, ID=9, 
		INT=10, STRING=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'puid'", "';'", "'{'", "','", "'='", "'}'", "'extends'", 
		"DECIMAL", "ID", "INT", "STRING", "WS"
	};
	public static final int
		RULE_file = 0, RULE_entity = 1, RULE_block = 2, RULE_keyString = 3, RULE_keyInt = 4, 
		RULE_network = 5, RULE_avail = 6;
	public static final String[] ruleNames = {
		"file", "entity", "block", "keyString", "keyInt", "network", "avail"
	};

	@Override
	public String getGrammarFileName() { return "Aml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmlVisitor ) return ((AmlVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); entity();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==1 );
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

	public static class EntityContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(AmlParser.ID, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode INT() { return getToken(AmlParser.INT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmlVisitor ) return ((AmlVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(1);
			setState(20); ((EntityContext)_localctx).name = match(INT);
			setState(23);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(21); match(7);
				setState(22); ((EntityContext)_localctx).name = match(ID);
				}
			}

			setState(25); match(3);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26); block();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(31); match(6);
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

	public static class BlockContext extends ParserRuleContext {
		public AvailContext avail(int i) {
			return getRuleContext(AvailContext.class,i);
		}
		public KeyIntContext keyInt(int i) {
			return getRuleContext(KeyIntContext.class,i);
		}
		public NetworkContext network(int i) {
			return getRuleContext(NetworkContext.class,i);
		}
		public List<NetworkContext> network() {
			return getRuleContexts(NetworkContext.class);
		}
		public List<AvailContext> avail() {
			return getRuleContexts(AvailContext.class);
		}
		public KeyStringContext keyString(int i) {
			return getRuleContext(KeyStringContext.class,i);
		}
		public List<KeyStringContext> keyString() {
			return getRuleContexts(KeyStringContext.class);
		}
		public List<KeyIntContext> keyInt() {
			return getRuleContexts(KeyIntContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmlVisitor ) return ((AmlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(37);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(33); keyString();
						}
						break;

					case 2:
						{
						setState(34); keyInt();
						}
						break;

					case 3:
						{
						setState(35); network();
						}
						break;

					case 4:
						{
						setState(36); avail();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class KeyStringContext extends ParserRuleContext {
		public Token name;
		public Token value;
		public List<TerminalNode> ID() { return getTokens(AmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AmlParser.ID, i);
		}
		public KeyStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).enterKeyString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).exitKeyString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmlVisitor ) return ((AmlVisitor<? extends T>)visitor).visitKeyString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyStringContext keyString() throws RecognitionException {
		KeyStringContext _localctx = new KeyStringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); ((KeyStringContext)_localctx).name = match(ID);
			setState(42); match(5);
			setState(43); ((KeyStringContext)_localctx).value = match(ID);
			setState(44); match(2);
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

	public static class KeyIntContext extends ParserRuleContext {
		public Token name;
		public Token value;
		public TerminalNode ID() { return getToken(AmlParser.ID, 0); }
		public TerminalNode DECIMAL() { return getToken(AmlParser.DECIMAL, 0); }
		public TerminalNode INT() { return getToken(AmlParser.INT, 0); }
		public KeyIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).enterKeyInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).exitKeyInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmlVisitor ) return ((AmlVisitor<? extends T>)visitor).visitKeyInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyIntContext keyInt() throws RecognitionException {
		KeyIntContext _localctx = new KeyIntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); ((KeyIntContext)_localctx).name = match(ID);
			setState(47); match(5);
			setState(48);
			((KeyIntContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==INT) ) {
				((KeyIntContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(49); match(2);
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

	public static class NetworkContext extends ParserRuleContext {
		public Token name;
		public Token value;
		public List<TerminalNode> ID() { return getTokens(AmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AmlParser.ID, i);
		}
		public NetworkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_network; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).enterNetwork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).exitNetwork(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmlVisitor ) return ((AmlVisitor<? extends T>)visitor).visitNetwork(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetworkContext network() throws RecognitionException {
		NetworkContext _localctx = new NetworkContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_network);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); ((NetworkContext)_localctx).name = match(ID);
			setState(52); match(5);
			setState(53); ((NetworkContext)_localctx).value = match(ID);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); match(4);
				setState(55); match(ID);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 );
			setState(60); match(2);
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

	public static class AvailContext extends ParserRuleContext {
		public Token name;
		public Token value;
		public TerminalNode ID() { return getToken(AmlParser.ID, 0); }
		public TerminalNode STRING(int i) {
			return getToken(AmlParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AmlParser.STRING); }
		public AvailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).enterAvail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlListener ) ((AmlListener)listener).exitAvail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmlVisitor ) return ((AmlVisitor<? extends T>)visitor).visitAvail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvailContext avail() throws RecognitionException {
		AvailContext _localctx = new AvailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_avail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); ((AvailContext)_localctx).name = match(ID);
			setState(63); match(5);
			setState(64); ((AvailContext)_localctx).value = match(STRING);
			{
			setState(65); match(4);
			setState(66); match(STRING);
			}
			setState(68); match(2);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\6\4(\n\4\r\4\16\4)\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\6\7;\n\7\r\7\16\7<\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\4\2\n\n\f\fI\2\21\3\2\2\2\4"+
		"\25\3\2\2\2\6\'\3\2\2\2\b+\3\2\2\2\n\60\3\2\2\2\f\65\3\2\2\2\16@\3\2\2"+
		"\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2"+
		"\2\24\3\3\2\2\2\25\26\7\3\2\2\26\31\7\f\2\2\27\30\7\t\2\2\30\32\7\13\2"+
		"\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\35\7\5\2\2\34\36\5\6\4"+
		"\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\""+
		"\7\b\2\2\"\5\3\2\2\2#(\5\b\5\2$(\5\n\6\2%(\5\f\7\2&(\5\16\b\2\'#\3\2\2"+
		"\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7"+
		"\3\2\2\2+,\7\13\2\2,-\7\7\2\2-.\7\13\2\2./\7\4\2\2/\t\3\2\2\2\60\61\7"+
		"\13\2\2\61\62\7\7\2\2\62\63\t\2\2\2\63\64\7\4\2\2\64\13\3\2\2\2\65\66"+
		"\7\13\2\2\66\67\7\7\2\2\67:\7\13\2\289\7\6\2\29;\7\13\2\2:8\3\2\2\2;<"+
		"\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\4\2\2?\r\3\2\2\2@A\7\13\2\2"+
		"AB\7\7\2\2BC\7\r\2\2CD\7\6\2\2DE\7\r\2\2EF\3\2\2\2FG\7\4\2\2G\17\3\2\2"+
		"\2\b\23\31\37\')<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}