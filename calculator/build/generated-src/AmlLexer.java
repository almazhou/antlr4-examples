// Generated from /Users/twer/antlr/calculator/src/main/antlr4/Aml.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AmlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, DECIMAL=8, ID=9, 
		INT=10, STRING=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'puid'", "';'", "'{'", "','", "'='", "'}'", "'extends'", "DECIMAL", "ID", 
		"INT", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "DECIMAL", "ID", 
		"INT", "STRING", "WS"
	};


	public AmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6\t\66\n\t\r\t"+
		"\16\t\67\3\n\6\n;\n\n\r\n\16\n<\3\13\6\13@\n\13\r\13\16\13A\3\f\3\f\7"+
		"\fF\n\f\f\f\16\fI\13\f\3\f\3\f\3\r\6\rN\n\r\r\r\16\rO\3\r\3\r\3G\2\16"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\4\2C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5 \3\2\2\2\7\""+
		"\3\2\2\2\t$\3\2\2\2\13&\3\2\2\2\r(\3\2\2\2\17*\3\2\2\2\21\62\3\2\2\2\23"+
		":\3\2\2\2\25?\3\2\2\2\27C\3\2\2\2\31M\3\2\2\2\33\34\7r\2\2\34\35\7w\2"+
		"\2\35\36\7k\2\2\36\37\7f\2\2\37\4\3\2\2\2 !\7=\2\2!\6\3\2\2\2\"#\7}\2"+
		"\2#\b\3\2\2\2$%\7.\2\2%\n\3\2\2\2&\'\7?\2\2\'\f\3\2\2\2()\7\177\2\2)\16"+
		"\3\2\2\2*+\7g\2\2+,\7z\2\2,-\7v\2\2-.\7g\2\2./\7p\2\2/\60\7f\2\2\60\61"+
		"\7u\2\2\61\20\3\2\2\2\62\63\5\25\13\2\63\65\7\60\2\2\64\66\5\25\13\2\65"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\22\3\2\2\29;\t\2"+
		"\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\24\3\2\2\2>@\t\3\2\2?>\3"+
		"\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\26\3\2\2\2CG\7$\2\2DF\13\2\2\2E"+
		"D\3\2\2\2FI\3\2\2\2GH\3\2\2\2GE\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7$\2\2K"+
		"\30\3\2\2\2LN\t\4\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2"+
		"\2QR\b\r\2\2R\32\3\2\2\2\b\2\67<AGO\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}