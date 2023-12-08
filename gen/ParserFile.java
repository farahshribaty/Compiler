// Generated from C:/Users/User/Desktop/compilerProject/ParserFile.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, OPEN_SQUARE=2, OPEN_BRACE=3, OPEN_PAREN=4, CLOSE_SQUARE=5, CLOSE_BRACE=6, 
		CLOSE_PAREN=7, COLON=8, DOT=9, ARROW=10, EQUAL=11, MINUS=12, NEQUAL=13, 
		NOT=14, OR=15, AND=16, PLUS=17, PLE=18, PLPL=19, QUESTION=20, SIME=21, 
		MULTI=22, S_C=23, D_C=24, EXPENSES=25, CONST=26, FUNCTION=27, RETURN=28, 
		IF=29, ELSE=30, FOR=31, WHILE=32, CLASS=33, VAR=34, LET=35, EXPORT=36, 
		DEFAULT=37, IMPORT=38, DOCUMNET=39, FROM=40, JSX_OPEN=41, JSX_CLOSE=42, 
		JSX_SLASH=43, WS=44, COMMENT=45, TYPE=46, BROWSER_ROUTER=47, ROUTER=48, 
		SWITCH=49, DATATYPE_=50, REACT_=51, CREATEELEMENT=52, REACTDOM=53, USESTATE_=54, 
		USEEFFECT_=55, USEREF_=56, CONSOLE_=57, LOG_=58, INPUT_=59, ONCHANGE_=60, 
		VALUE_=61, PLACEHOLDER_=62, DISABLED_=63, ONFOCUS_=64, ONCLICK_=65, IMG_=66, 
		SRC=67, HEIGHT=68, WIDTH=69, BUTTON_=70, MAP_=71, CLASS_NAME=72, OPERATION=73, 
		SYNTAX=74, NUMBER=75, STRING=76, HEX_NUMBER=77, SingleLineString=78, MultiLineString=79, 
		ID=80;
	public static final int
		RULE_app = 0, RULE_export = 1, RULE_importR = 2, RULE_variableDiclaration = 3, 
		RULE_html = 4, RULE_variable = 5, RULE_print = 6, RULE_function1 = 7, 
		RULE_function2 = 8, RULE_function3 = 9, RULE_functionbody = 10, RULE_returnStatment = 11, 
		RULE_returnStatment1 = 12, RULE_syntax = 13, RULE_pureReact = 14, RULE_attributes = 15, 
		RULE_attribute = 16, RULE_attributeValue = 17, RULE_useRef = 18, RULE_useState = 19, 
		RULE_array = 20, RULE_functionCall = 21, RULE_useEffect = 22, RULE_arrayy = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "export", "importR", "variableDiclaration", "html", "variable", 
			"print", "function1", "function2", "function3", "functionbody", "returnStatment", 
			"returnStatment1", "syntax", "pureReact", "attributes", "attribute", 
			"attributeValue", "useRef", "useState", "array", "functionCall", "useEffect", 
			"arrayy"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'['", "'{'", "'('", "']'", "'}'", "')'", "':'", "'.'", 
			"'=>'", "'='", "'-'", "'=!'", "'!'", "'||'", "'&&'", "'+'", "'+='", "'++'", 
			"'?'", "';'", "'*'", "'''", "'\"'", "'expenses'", "'const'", "'function'", 
			"'return'", "'if'", "'else'", "'for'", "'while'", "'class'", "'var'", 
			"'let'", "'export'", "'default'", "'import'", "'document'", "'from'", 
			"'<'", "'>'", "'/'", null, null, "'type'", "'BrowserRouter'", "'Router'", 
			"'Switch'", null, "'React'", "'createElement'", "'ReacttDOM'", "'useState'", 
			"'useEffect'", "'useRef'", "'console'", "'log'", "'input'", "'onChange'", 
			"'value'", "'placeholder'", "'disabled '", "'onFocus'", "'onclick'", 
			"'img'", "'src'", "'height'", "'width'", "'button'", "'map'", "'className'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "OPEN_SQUARE", "OPEN_BRACE", "OPEN_PAREN", "CLOSE_SQUARE", 
			"CLOSE_BRACE", "CLOSE_PAREN", "COLON", "DOT", "ARROW", "EQUAL", "MINUS", 
			"NEQUAL", "NOT", "OR", "AND", "PLUS", "PLE", "PLPL", "QUESTION", "SIME", 
			"MULTI", "S_C", "D_C", "EXPENSES", "CONST", "FUNCTION", "RETURN", "IF", 
			"ELSE", "FOR", "WHILE", "CLASS", "VAR", "LET", "EXPORT", "DEFAULT", "IMPORT", 
			"DOCUMNET", "FROM", "JSX_OPEN", "JSX_CLOSE", "JSX_SLASH", "WS", "COMMENT", 
			"TYPE", "BROWSER_ROUTER", "ROUTER", "SWITCH", "DATATYPE_", "REACT_", 
			"CREATEELEMENT", "REACTDOM", "USESTATE_", "USEEFFECT_", "USEREF_", "CONSOLE_", 
			"LOG_", "INPUT_", "ONCHANGE_", "VALUE_", "PLACEHOLDER_", "DISABLED_", 
			"ONFOCUS_", "ONCLICK_", "IMG_", "SRC", "HEIGHT", "WIDTH", "BUTTON_", 
			"MAP_", "CLASS_NAME", "OPERATION", "SYNTAX", "NUMBER", "STRING", "HEX_NUMBER", 
			"SingleLineString", "MultiLineString", "ID"
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
	public String getGrammarFileName() { return "ParserFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserFile(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public Function3Context function3() {
			return getRuleContext(Function3Context.class,0);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			function3();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ParserFile.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ParserFile.DEFAULT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(EXPORT);
			setState(51);
			match(DEFAULT);
			setState(52);
			match(ID);
			setState(53);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportRContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserFile.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(ParserFile.FROM, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public List<TerminalNode> USESTATE_() { return getTokens(ParserFile.USESTATE_); }
		public TerminalNode USESTATE_(int i) {
			return getToken(ParserFile.USESTATE_, i);
		}
		public List<TerminalNode> USEREF_() { return getTokens(ParserFile.USEREF_); }
		public TerminalNode USEREF_(int i) {
			return getToken(ParserFile.USEREF_, i);
		}
		public List<TerminalNode> USEEFFECT_() { return getTokens(ParserFile.USEEFFECT_); }
		public TerminalNode USEEFFECT_(int i) {
			return getToken(ParserFile.USEEFFECT_, i);
		}
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> REACT_() { return getTokens(ParserFile.REACT_); }
		public TerminalNode REACT_(int i) {
			return getToken(ParserFile.REACT_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public ImportRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importR);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IMPORT);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					_la = _input.LA(1);
					if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 536870969L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(57);
					match(COMMA);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(63);
				match(OPEN_BRACE);
				}
			}

			setState(66);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 536870969L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67);
				match(COMMA);
				setState(68);
				match(ID);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(74);
				match(CLOSE_BRACE);
				}
			}

			setState(77);
			match(FROM);
			setState(78);
			match(STRING);
			setState(79);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDiclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public TerminalNode VAR() { return getToken(ParserFile.VAR, 0); }
		public TerminalNode CONST() { return getToken(ParserFile.CONST, 0); }
		public TerminalNode LET() { return getToken(ParserFile.LET, 0); }
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public VariableDiclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDiclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVariableDiclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVariableDiclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVariableDiclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDiclarationContext variableDiclaration() throws RecognitionException {
		VariableDiclarationContext _localctx = new VariableDiclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDiclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 51606716416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(ID);
			setState(83);
			match(EQUAL);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(84);
				function2();
				}
				break;
			case NUMBER:
				{
				setState(85);
				match(NUMBER);
				}
				break;
			case USEREF_:
				{
				setState(86);
				useRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIME) {
				{
				setState(89);
				match(SIME);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public List<TerminalNode> JSX_OPEN() { return getTokens(ParserFile.JSX_OPEN); }
		public TerminalNode JSX_OPEN(int i) {
			return getToken(ParserFile.JSX_OPEN, i);
		}
		public List<TerminalNode> JSX_CLOSE() { return getTokens(ParserFile.JSX_CLOSE); }
		public TerminalNode JSX_CLOSE(int i) {
			return getToken(ParserFile.JSX_CLOSE, i);
		}
		public TerminalNode JSX_SLASH() { return getToken(ParserFile.JSX_SLASH, 0); }
		public List<TerminalNode> SYNTAX() { return getTokens(ParserFile.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(ParserFile.SYNTAX, i);
		}
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ParserFile.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ParserFile.EQUAL, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(ParserFile.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(ParserFile.OPEN_BRACE, i);
		}
		public List<AttributeValueContext> attributeValue() {
			return getRuleContexts(AttributeValueContext.class);
		}
		public AttributeValueContext attributeValue(int i) {
			return getRuleContext(AttributeValueContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(ParserFile.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(ParserFile.CLOSE_BRACE, i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_html);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(JSX_OPEN);
			{
			setState(93);
			match(SYNTAX);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(94);
				match(ID);
				setState(95);
				match(EQUAL);
				setState(96);
				match(OPEN_BRACE);
				setState(97);
				attributeValue();
				setState(98);
				match(CLOSE_BRACE);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(JSX_CLOSE);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						html();
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(112);
					match(ID);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(120);
			match(JSX_OPEN);
			setState(121);
			match(JSX_SLASH);
			setState(122);
			match(SYNTAX);
			setState(123);
			match(JSX_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserFile.VAR, 0); }
		public TerminalNode CONST() { return getToken(ParserFile.CONST, 0); }
		public TerminalNode LET() { return getToken(ParserFile.LET, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 51606716416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode CONSOLE_() { return getToken(ParserFile.CONSOLE_, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode LOG_() { return getToken(ParserFile.LOG_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(ParserFile.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(ParserFile.SingleLineString, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserFile.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserFile.NUMBER, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CONSOLE_);
			setState(128);
			match(DOT);
			setState(129);
			match(LOG_);
			setState(130);
			match(OPEN_PAREN);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 41L) != 0)) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 41L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(CLOSE_PAREN);
			setState(138);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function1Context extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public Function1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunction1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunction1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunction1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function1Context function1() throws RecognitionException {
		Function1Context _localctx = new Function1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_function1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			variable();
			setState(141);
			match(ID);
			setState(142);
			match(OPEN_PAREN);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(143);
				match(ID);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(CLOSE_PAREN);
			setState(150);
			match(OPEN_BRACE);
			setState(151);
			functionbody();
			setState(152);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function2Context extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public Function2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunction2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function2Context function2() throws RecognitionException {
		Function2Context _localctx = new Function2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_function2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(OPEN_PAREN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(155);
				match(ID);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(CLOSE_PAREN);
			setState(162);
			match(ARROW);
			setState(163);
			match(OPEN_BRACE);
			setState(164);
			functionbody();
			setState(165);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function3Context extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public Function3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunction3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunction3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunction3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function3Context function3() throws RecognitionException {
		Function3Context _localctx = new Function3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_function3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			variable();
			setState(168);
			match(ID);
			setState(169);
			match(EQUAL);
			setState(170);
			match(OPEN_PAREN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(171);
				match(ID);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(CLOSE_PAREN);
			setState(178);
			match(ARROW);
			setState(179);
			match(OPEN_BRACE);
			setState(180);
			functionbody();
			setState(181);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionbodyContext extends ParserRuleContext {
		public List<VariableDiclarationContext> variableDiclaration() {
			return getRuleContexts(VariableDiclarationContext.class);
		}
		public VariableDiclarationContext variableDiclaration(int i) {
			return getRuleContext(VariableDiclarationContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<UseEffectContext> useEffect() {
			return getRuleContexts(UseEffectContext.class);
		}
		public UseEffectContext useEffect(int i) {
			return getRuleContext(UseEffectContext.class,i);
		}
		public List<UseStateContext> useState() {
			return getRuleContexts(UseStateContext.class);
		}
		public UseStateContext useState(int i) {
			return getRuleContext(UseStateContext.class,i);
		}
		public ReturnStatmentContext returnStatment() {
			return getRuleContext(ReturnStatmentContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 180144036701536256L) != 0)) {
				{
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(183);
					variableDiclaration();
					}
					break;
				case 2:
					{
					setState(184);
					print();
					}
					break;
				case 3:
					{
					setState(185);
					useEffect();
					}
					break;
				case 4:
					{
					setState(186);
					useState();
					}
					break;
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(192);
				returnStatment();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatmentContext extends ParserRuleContext {
		public ReturnStatment1Context returnStatment1() {
			return getRuleContext(ReturnStatment1Context.class,0);
		}
		public TerminalNode RETURN() { return getToken(ParserFile.RETURN, 0); }
		public PureReactContext pureReact() {
			return getRuleContext(PureReactContext.class,0);
		}
		public ReturnStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReturnStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReturnStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReturnStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatmentContext returnStatment() throws RecognitionException {
		ReturnStatmentContext _localctx = new ReturnStatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatment);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				returnStatment1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(RETURN);
				setState(197);
				pureReact();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatment1Context extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserFile.RETURN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public ReturnStatment1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatment1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReturnStatment1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReturnStatment1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReturnStatment1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatment1Context returnStatment1() throws RecognitionException {
		ReturnStatment1Context _localctx = new ReturnStatment1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStatment1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(RETURN);
			setState(201);
			match(OPEN_PAREN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_OPEN) {
				{
				setState(202);
				html();
				}
			}

			setState(205);
			match(CLOSE_PAREN);
			setState(206);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SyntaxContext extends ParserRuleContext {
		public List<TerminalNode> S_C() { return getTokens(ParserFile.S_C); }
		public TerminalNode S_C(int i) {
			return getToken(ParserFile.S_C, i);
		}
		public TerminalNode SYNTAX() { return getToken(ParserFile.SYNTAX, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(S_C);
			setState(209);
			match(SYNTAX);
			setState(210);
			match(S_C);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PureReactContext extends ParserRuleContext {
		public TerminalNode REACT_() { return getToken(ParserFile.REACT_, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode CREATEELEMENT() { return getToken(ParserFile.CREATEELEMENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public List<PureReactContext> pureReact() {
			return getRuleContexts(PureReactContext.class);
		}
		public PureReactContext pureReact(int i) {
			return getRuleContext(PureReactContext.class,i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(ParserFile.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(ParserFile.SingleLineString, i);
		}
		public PureReactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureReact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPureReact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPureReact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPureReact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureReactContext pureReact() throws RecognitionException {
		PureReactContext _localctx = new PureReactContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pureReact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(REACT_);
			setState(213);
			match(DOT);
			setState(214);
			match(CREATEELEMENT);
			setState(215);
			match(OPEN_PAREN);
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(217);
			match(COMMA);
			setState(218);
			attributes();
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(219);
				match(COMMA);
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==REACT_ || _la==SingleLineString) {
					{
					setState(224);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REACT_:
						{
						setState(222);
						pureReact();
						}
						break;
					case SingleLineString:
						{
						setState(223);
						match(SingleLineString);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(229);
					match(COMMA);
					}
				}

				}
				break;
			}
			setState(234);
			match(CLOSE_PAREN);
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SIME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(OPEN_BRACE);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(238);
				attribute();
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				attribute();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public Token attributeName;
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attribute);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((AttributeContext)_localctx).attributeName = match(ID);
				setState(251);
				match(COLON);
				setState(252);
				attributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((AttributeContext)_localctx).attributeName = match(ID);
				setState(254);
				match(COLON);
				setState(255);
				attributeValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				((AttributeContext)_localctx).attributeName = match(ID);
				setState(257);
				match(COLON);
				setState(258);
				attributeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 35L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode USEREF_() { return getToken(ParserFile.USEREF_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(ParserFile.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ParserFile.STRING, i);
		}
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(USEREF_);
			setState(264);
			match(OPEN_PAREN);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(265);
				match(STRING);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode USESTATE_() { return getToken(ParserFile.USESTATE_, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(ParserFile.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserFile.CLOSE_SQUARE, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_useState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			variable();
			setState(274);
			match(USESTATE_);
			setState(275);
			match(OPEN_SQUARE);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(276);
				match(ID);
				setState(277);
				match(DOT);
				setState(278);
				match(ID);
				}
				break;
			case 2:
				{
				setState(279);
				match(ID);
				}
				break;
			}
			setState(282);
			match(CLOSE_SQUARE);
			setState(283);
			match(EQUAL);
			setState(284);
			useState();
			setState(285);
			match(OPEN_PAREN);
			setState(286);
			attributeValue();
			setState(287);
			match(CLOSE_PAREN);
			setState(288);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public ArrayyContext arrayy() {
			return getRuleContext(ArrayyContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public TerminalNode VAR() { return getToken(ParserFile.VAR, 0); }
		public TerminalNode CONST() { return getToken(ParserFile.CONST, 0); }
		public TerminalNode LET() { return getToken(ParserFile.LET, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 51606716416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			arrayy();
			setState(292);
			match(EQUAL);
			setState(293);
			useState();
			setState(294);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(297);
			match(OPEN_PAREN);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(298);
				match(STRING);
				}
			}

			setState(301);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode USEEFFECT_() { return getToken(ParserFile.USEEFFECT_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public ArrayyContext arrayy() {
			return getRuleContext(ArrayyContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(ParserFile.SIME, 0); }
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_useEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(USEEFFECT_);
			setState(304);
			match(OPEN_PAREN);
			setState(305);
			function2();
			setState(306);
			match(COMMA);
			setState(307);
			arrayy();
			setState(308);
			match(CLOSE_PAREN);
			setState(309);
			match(SIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayyContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(ParserFile.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserFile.CLOSE_SQUARE, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ArrayyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayyContext arrayy() throws RecognitionException {
		ArrayyContext _localctx = new ArrayyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(OPEN_SQUARE);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(312);
				match(ID);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(313);
					match(COMMA);
					}
				}

				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(CLOSE_SQUARE);
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
		"\u0004\u0001P\u0144\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002\u0001\u0002\u0003\u0002"+
		"L\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"X\b\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004e\b\u0004\n\u0004\f\u0004h\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004l\b\u0004\n\u0004\f\u0004o\t\u0004\u0001\u0004\u0005\u0004r\b\u0004"+
		"\n\u0004\f\u0004u\t\u0004\u0003\u0004w\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0085\b\u0006"+
		"\n\u0006\f\u0006\u0088\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0091\b\u0007\n"+
		"\u0007\f\u0007\u0094\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\u009d\b\b\n\b\f\b\u00a0\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00ad\b\t\n\t\f\t\u00b0\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00bc\b\n\n\n\f\n\u00bf\t\n\u0001\n\u0003\n\u00c2\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00c7\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00cc\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00dd\b\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00e1\b\u000e\n\u000e\f\u000e\u00e4\t\u000e\u0001\u000e\u0003\u000e"+
		"\u00e7\b\u000e\u0003\u000e\u00e9\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00f0\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00f4\b\u000f\n\u000f\f\u000f\u00f7\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0104\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u010b\b\u0012\n\u0012\f\u0012\u010e\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0119\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u012c\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u013b"+
		"\b\u0017\u0005\u0017\u013d\b\u0017\n\u0017\f\u0017\u0140\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0006\u0003\u00003368PP\u0002\u0000\u001a\u001a\"#\u0003\u0000"+
		"KKNNPP\u0002\u0000LLPP\u0002\u0000\u0001\u0001\u0015\u0015\u0002\u0000"+
		"KLPP\u014f\u00000\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000"+
		"\u00047\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\b\\\u0001"+
		"\u0000\u0000\u0000\n}\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000"+
		"\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u009a\u0001\u0000\u0000"+
		"\u0000\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00bd\u0001\u0000\u0000"+
		"\u0000\u0016\u00c6\u0001\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000"+
		"\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00d4\u0001\u0000\u0000"+
		"\u0000\u001e\u00ed\u0001\u0000\u0000\u0000 \u0103\u0001\u0000\u0000\u0000"+
		"\"\u0105\u0001\u0000\u0000\u0000$\u0107\u0001\u0000\u0000\u0000&\u0111"+
		"\u0001\u0000\u0000\u0000(\u0122\u0001\u0000\u0000\u0000*\u0128\u0001\u0000"+
		"\u0000\u0000,\u012f\u0001\u0000\u0000\u0000.\u0137\u0001\u0000\u0000\u0000"+
		"01\u0003\u0012\t\u00001\u0001\u0001\u0000\u0000\u000023\u0005$\u0000\u0000"+
		"34\u0005%\u0000\u000045\u0005P\u0000\u000056\u0005\u0015\u0000\u00006"+
		"\u0003\u0001\u0000\u0000\u00007<\u0005&\u0000\u000089\u0007\u0000\u0000"+
		"\u00009;\u0005\u0001\u0000\u0000:8\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0005\u0003\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BG\u0007\u0000\u0000\u0000CD\u0005\u0001\u0000\u0000DF\u0005P\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JL\u0005\u0006\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005(\u0000\u0000"+
		"NO\u0005L\u0000\u0000OP\u0005\u0015\u0000\u0000P\u0005\u0001\u0000\u0000"+
		"\u0000QR\u0007\u0001\u0000\u0000RS\u0005P\u0000\u0000SW\u0005\u000b\u0000"+
		"\u0000TX\u0003\u0010\b\u0000UX\u0005K\u0000\u0000VX\u0003$\u0012\u0000"+
		"WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000XZ\u0001\u0000\u0000\u0000Y[\u0005\u0015\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0007\u0001\u0000\u0000\u0000"+
		"\\]\u0005)\u0000\u0000]f\u0005J\u0000\u0000^_\u0005P\u0000\u0000_`\u0005"+
		"\u000b\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0003\"\u0011\u0000bc\u0005"+
		"\u0006\u0000\u0000ce\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000iv\u0005*\u0000"+
		"\u0000jl\u0003\b\u0004\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nw\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0005P\u0000\u0000qp\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"vm\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0005)\u0000\u0000yz\u0005+\u0000\u0000z{\u0005J\u0000\u0000"+
		"{|\u0005*\u0000\u0000|\t\u0001\u0000\u0000\u0000}~\u0007\u0001\u0000\u0000"+
		"~\u000b\u0001\u0000\u0000\u0000\u007f\u0080\u00059\u0000\u0000\u0080\u0081"+
		"\u0005\t\u0000\u0000\u0081\u0082\u0005:\u0000\u0000\u0082\u0086\u0005"+
		"\u0004\u0000\u0000\u0083\u0085\u0007\u0002\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"\u0007\u0000\u0000\u008a\u008b\u0005\u0015\u0000\u0000\u008b\r\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0003\n\u0005\u0000\u008d\u008e\u0005P\u0000"+
		"\u0000\u008e\u0092\u0005\u0004\u0000\u0000\u008f\u0091\u0005P\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0007\u0000\u0000\u0096\u0097\u0005\u0003\u0000\u0000"+
		"\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099\u0005\u0006\u0000\u0000\u0099"+
		"\u000f\u0001\u0000\u0000\u0000\u009a\u009e\u0005\u0004\u0000\u0000\u009b"+
		"\u009d\u0005P\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0007\u0000\u0000\u00a2\u00a3"+
		"\u0005\n\u0000\u0000\u00a3\u00a4\u0005\u0003\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0014\n\u0000\u00a5\u00a6\u0005\u0006\u0000\u0000\u00a6\u0011\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0003\n\u0005\u0000\u00a8\u00a9\u0005P\u0000"+
		"\u0000\u00a9\u00aa\u0005\u000b\u0000\u0000\u00aa\u00ae\u0005\u0004\u0000"+
		"\u0000\u00ab\u00ad\u0005P\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000"+
		"\u00b2\u00b3\u0005\n\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4"+
		"\u00b5\u0003\u0014\n\u0000\u00b5\u00b6\u0005\u0006\u0000\u0000\u00b6\u0013"+
		"\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003\u0006\u0003\u0000\u00b8\u00bc"+
		"\u0003\f\u0006\u0000\u00b9\u00bc\u0003,\u0016\u0000\u00ba\u00bc\u0003"+
		"&\u0013\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\u0016"+
		"\u000b\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3\u00c7\u0003\u0018"+
		"\f\u0000\u00c4\u00c5\u0005\u001c\u0000\u0000\u00c5\u00c7\u0003\u001c\u000e"+
		"\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u0017\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u001c\u0000"+
		"\u0000\u00c9\u00cb\u0005\u0004\u0000\u0000\u00ca\u00cc\u0003\b\u0004\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0007\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0015\u0000\u0000\u00cf\u0019\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0017\u0000\u0000\u00d1\u00d2\u0005J\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0017\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u00053\u0000\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6\u00d7"+
		"\u00054\u0000\u0000\u00d7\u00d8\u0005\u0004\u0000\u0000\u00d8\u00d9\u0007"+
		"\u0003\u0000\u0000\u00d9\u00da\u0005\u0001\u0000\u0000\u00da\u00dc\u0003"+
		"\u001e\u000f\u0000\u00db\u00dd\u0005\u0001\u0000\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e8\u0001"+
		"\u0000\u0000\u0000\u00de\u00e1\u0003\u001c\u000e\u0000\u00df\u00e1\u0005"+
		"N\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e7\u0005\u0001"+
		"\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb\u00ec\u0007\u0004"+
		"\u0000\u0000\u00ec\u001d\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005\u0003"+
		"\u0000\u0000\u00ee\u00f0\u0003 \u0010\u0000\u00ef\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005\u0001\u0000\u0000\u00f2\u00f4\u0003 \u0010\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\u0006\u0000\u0000\u00f9\u001f\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005P\u0000\u0000\u00fb\u00fc\u0005\b\u0000\u0000\u00fc"+
		"\u0104\u0003\"\u0011\u0000\u00fd\u00fe\u0005P\u0000\u0000\u00fe\u00ff"+
		"\u0005\b\u0000\u0000\u00ff\u0104\u0003\"\u0011\u0000\u0100\u0101\u0005"+
		"P\u0000\u0000\u0101\u0102\u0005\b\u0000\u0000\u0102\u0104\u0003\"\u0011"+
		"\u0000\u0103\u00fa\u0001\u0000\u0000\u0000\u0103\u00fd\u0001\u0000\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0104!\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0007\u0005\u0000\u0000\u0106#\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u00058\u0000\u0000\u0108\u010c\u0005\u0004\u0000\u0000\u0109\u010b"+
		"\u0005L\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\u0007\u0000\u0000\u0110%\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0003\n\u0005\u0000\u0112\u0113\u00056\u0000"+
		"\u0000\u0113\u0118\u0005\u0002\u0000\u0000\u0114\u0115\u0005P\u0000\u0000"+
		"\u0115\u0116\u0005\t\u0000\u0000\u0116\u0119\u0005P\u0000\u0000\u0117"+
		"\u0119\u0005P\u0000\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0118\u0117"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005\u0005\u0000\u0000\u011b\u011c\u0005\u000b\u0000\u0000\u011c\u011d"+
		"\u0003&\u0013\u0000\u011d\u011e\u0005\u0004\u0000\u0000\u011e\u011f\u0003"+
		"\"\u0011\u0000\u011f\u0120\u0005\u0007\u0000\u0000\u0120\u0121\u0005\u0015"+
		"\u0000\u0000\u0121\'\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0001\u0000"+
		"\u0000\u0123\u0124\u0003.\u0017\u0000\u0124\u0125\u0005\u000b\u0000\u0000"+
		"\u0125\u0126\u0003&\u0013\u0000\u0126\u0127\u0005\u0015\u0000\u0000\u0127"+
		")\u0001\u0000\u0000\u0000\u0128\u0129\u0005P\u0000\u0000\u0129\u012b\u0005"+
		"\u0004\u0000\u0000\u012a\u012c\u0005L\u0000\u0000\u012b\u012a\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0005\u0007\u0000\u0000\u012e+\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u00057\u0000\u0000\u0130\u0131\u0005\u0004\u0000\u0000"+
		"\u0131\u0132\u0003\u0010\b\u0000\u0132\u0133\u0005\u0001\u0000\u0000\u0133"+
		"\u0134\u0003.\u0017\u0000\u0134\u0135\u0005\u0007\u0000\u0000\u0135\u0136"+
		"\u0005\u0015\u0000\u0000\u0136-\u0001\u0000\u0000\u0000\u0137\u013e\u0005"+
		"\u0002\u0000\u0000\u0138\u013a\u0005P\u0000\u0000\u0139\u013b\u0005\u0001"+
		"\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0138\u0001\u0000"+
		"\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000"+
		"\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0005"+
		"\u0000\u0000\u0142/\u0001\u0000\u0000\u0000 <@GKWZfmsv\u0086\u0092\u009e"+
		"\u00ae\u00bb\u00bd\u00c1\u00c6\u00cb\u00dc\u00e0\u00e2\u00e6\u00e8\u00ef"+
		"\u00f5\u0103\u010c\u0118\u012b\u013a\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}