// Generated from C:/Users/Omar/Desktop/anas/Compiler/ParserFile.g4 by ANTLR 4.13.1
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
		VAR=1, LET=2, CONST=3, IMPORT=4, FROM=5, EXPORT=6, DEFAULT=7, RETURN=8, 
		NULL_VALUE=9, ID=10, NUMBER=11, SINGLE_QUOTE_STRING=12, DOUBLE_QUOTE_STRING=13, 
		LARGER_THAN=14, LEES_THAN=15, SLASH=16, COMPONENT_NAME=17, AND=18, EQUAL=19, 
		ARROW_FUNCTION=20, OPEN_PAREN=21, CLOSE_PAREN=22, LSQUAR=23, RSQUAR=24, 
		OPEN_CURLY_BRACKETS=25, CLOSE_CURLY_BRACKETS=26, SIMI=27, COLON=28, COMMA=29, 
		DOT=30, SPACE=31, USE_STATE=32, USE_REF=33, SIME=34, ARROW=35;
	public static final int
		RULE_reactProgram = 0, RULE_export = 1, RULE_statemtn = 2, RULE_variableDiclaration = 3, 
		RULE_useRef = 4, RULE_function2 = 5, RULE_objectAssign = 6, RULE_objectDefnation = 7, 
		RULE_arrayDefnation = 8, RULE_constDeclartion = 9, RULE_functionDefnetion = 10, 
		RULE_functionBody = 11, RULE_returnStatment = 12, RULE_importStatment = 13, 
		RULE_functionCall = 14, RULE_jsAttribute = 15, RULE_attributes = 16, RULE_openTag = 17, 
		RULE_closeTag = 18, RULE_justOpenTag = 19, RULE_xmlTag = 20, RULE_jsInJSX = 21, 
		RULE_objectAccess = 22, RULE_shortIf = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"reactProgram", "export", "statemtn", "variableDiclaration", "useRef", 
			"function2", "objectAssign", "objectDefnation", "arrayDefnation", "constDeclartion", 
			"functionDefnetion", "functionBody", "returnStatment", "importStatment", 
			"functionCall", "jsAttribute", "attributes", "openTag", "closeTag", "justOpenTag", 
			"xmlTag", "jsInJSX", "objectAccess", "shortIf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'let'", "'const'", "'import'", "'from'", "'export'", 
			"'default'", "'return'", "'null'", null, null, null, null, "'>'", "'<'", 
			"'/'", null, "'&&'", "'='", "'=>'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "';'", "':'", "','", "'.'", null, "'useState'", "'useRef'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "LET", "CONST", "IMPORT", "FROM", "EXPORT", "DEFAULT", "RETURN", 
			"NULL_VALUE", "ID", "NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", 
			"LARGER_THAN", "LEES_THAN", "SLASH", "COMPONENT_NAME", "AND", "EQUAL", 
			"ARROW_FUNCTION", "OPEN_PAREN", "CLOSE_PAREN", "LSQUAR", "RSQUAR", "OPEN_CURLY_BRACKETS", 
			"CLOSE_CURLY_BRACKETS", "SIMI", "COLON", "COMMA", "DOT", "SPACE", "USE_STATE", 
			"USE_REF", "SIME", "ARROW"
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
	public static class ReactProgramContext extends ParserRuleContext {
		public List<ImportStatmentContext> importStatment() {
			return getRuleContexts(ImportStatmentContext.class);
		}
		public ImportStatmentContext importStatment(int i) {
			return getRuleContext(ImportStatmentContext.class,i);
		}
		public List<StatemtnContext> statemtn() {
			return getRuleContexts(StatemtnContext.class);
		}
		public StatemtnContext statemtn(int i) {
			return getRuleContext(StatemtnContext.class,i);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ReactProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReactProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReactProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReactProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReactProgramContext reactProgram() throws RecognitionException {
		ReactProgramContext _localctx = new ReactProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reactProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(48);
				importStatment();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41944078L) != 0)) {
				{
				{
				setState(54);
				statemtn();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(60);
				export();
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
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ParserFile.EXPORT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode DEFAULT() { return getToken(ParserFile.DEFAULT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(EXPORT);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(64);
				match(DEFAULT);
				}
			}

			setState(67);
			match(ID);
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
	public static class StatemtnContext extends ParserRuleContext {
		public List<VariableDiclarationContext> variableDiclaration() {
			return getRuleContexts(VariableDiclarationContext.class);
		}
		public VariableDiclarationContext variableDiclaration(int i) {
			return getRuleContext(VariableDiclarationContext.class,i);
		}
		public List<ObjectAssignContext> objectAssign() {
			return getRuleContexts(ObjectAssignContext.class);
		}
		public ObjectAssignContext objectAssign(int i) {
			return getRuleContext(ObjectAssignContext.class,i);
		}
		public List<ObjectDefnationContext> objectDefnation() {
			return getRuleContexts(ObjectDefnationContext.class);
		}
		public ObjectDefnationContext objectDefnation(int i) {
			return getRuleContext(ObjectDefnationContext.class,i);
		}
		public List<ArrayDefnationContext> arrayDefnation() {
			return getRuleContexts(ArrayDefnationContext.class);
		}
		public ArrayDefnationContext arrayDefnation(int i) {
			return getRuleContext(ArrayDefnationContext.class,i);
		}
		public List<ConstDeclartionContext> constDeclartion() {
			return getRuleContexts(ConstDeclartionContext.class);
		}
		public ConstDeclartionContext constDeclartion(int i) {
			return getRuleContext(ConstDeclartionContext.class,i);
		}
		public List<ObjectAccessContext> objectAccess() {
			return getRuleContexts(ObjectAccessContext.class);
		}
		public ObjectAccessContext objectAccess(int i) {
			return getRuleContext(ObjectAccessContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public StatemtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statemtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStatemtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStatemtn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStatemtn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatemtnContext statemtn() throws RecognitionException {
		StatemtnContext _localctx = new StatemtnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statemtn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(69);
						variableDiclaration();
						}
						break;
					case 2:
						{
						setState(70);
						objectAssign();
						}
						break;
					case 3:
						{
						setState(71);
						objectDefnation();
						}
						break;
					case 4:
						{
						setState(72);
						arrayDefnation();
						}
						break;
					case 5:
						{
						setState(73);
						constDeclartion();
						}
						break;
					case 6:
						{
						setState(74);
						objectAccess();
						}
						break;
					case 7:
						{
						setState(75);
						functionCall();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(78); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			match(ID);
			setState(82);
			match(EQUAL);
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(83);
				function2();
				}
				break;
			case NUMBER:
				{
				setState(84);
				match(NUMBER);
				}
				break;
			case USE_REF:
				{
				setState(85);
				useRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIME) {
				{
				setState(88);
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
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode USE_REF() { return getToken(ParserFile.USE_REF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TerminalNode> SINGLE_QUOTE_STRING() { return getTokens(ParserFile.SINGLE_QUOTE_STRING); }
		public TerminalNode SINGLE_QUOTE_STRING(int i) {
			return getToken(ParserFile.SINGLE_QUOTE_STRING, i);
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
		enterRule(_localctx, 8, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(USE_REF);
			setState(92);
			match(OPEN_PAREN);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTE_STRING) {
				{
				{
				setState(93);
				match(SINGLE_QUOTE_STRING);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
	public static class Function2Context extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_function2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(OPEN_PAREN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(102);
				match(ID);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(CLOSE_PAREN);
			setState(109);
			match(ARROW);
			setState(110);
			functionBody();
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
	public static class ObjectAssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(ParserFile.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode SIMI() { return getToken(ParserFile.SIMI, 0); }
		public ObjectAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectAssignContext objectAssign() throws RecognitionException {
		ObjectAssignContext _localctx = new ObjectAssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objectAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(COLON);
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIMI) {
				{
				setState(115);
				match(SIMI);
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
	public static class ObjectDefnationContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ParserFile.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ParserFile.CLOSE_CURLY_BRACKETS, 0); }
		public List<ObjectAssignContext> objectAssign() {
			return getRuleContexts(ObjectAssignContext.class);
		}
		public ObjectAssignContext objectAssign(int i) {
			return getRuleContext(ObjectAssignContext.class,i);
		}
		public TerminalNode SIMI() { return getToken(ParserFile.SIMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ObjectDefnationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDefnation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectDefnation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectDefnation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectDefnation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDefnationContext objectDefnation() throws RecognitionException {
		ObjectDefnationContext _localctx = new ObjectDefnationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objectDefnation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(OPEN_CURLY_BRACKETS);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(119);
				objectAssign();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					objectAssign();
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(122);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(CLOSE_CURLY_BRACKETS);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(136);
				match(SIMI);
				}
				break;
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
	public static class ArrayDefnationContext extends ParserRuleContext {
		public TerminalNode LSQUAR() { return getToken(ParserFile.LSQUAR, 0); }
		public TerminalNode RSQUAR() { return getToken(ParserFile.RSQUAR, 0); }
		public List<ObjectDefnationContext> objectDefnation() {
			return getRuleContexts(ObjectDefnationContext.class);
		}
		public ObjectDefnationContext objectDefnation(int i) {
			return getRuleContext(ObjectDefnationContext.class,i);
		}
		public TerminalNode SIMI() { return getToken(ParserFile.SIMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ArrayDefnationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDefnation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayDefnation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayDefnation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayDefnation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefnationContext arrayDefnation() throws RecognitionException {
		ArrayDefnationContext _localctx = new ArrayDefnationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayDefnation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LSQUAR);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_CURLY_BRACKETS) {
				{
				{
				setState(140);
				objectDefnation();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(141);
					match(COMMA);
					setState(142);
					objectDefnation();
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(143);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(RSQUAR);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(157);
				match(SIMI);
				}
				break;
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
	public static class ConstDeclartionContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ParserFile.CONST, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(ParserFile.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(ParserFile.DOUBLE_QUOTE_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public ArrayDefnationContext arrayDefnation() {
			return getRuleContext(ArrayDefnationContext.class,0);
		}
		public ObjectDefnationContext objectDefnation() {
			return getRuleContext(ObjectDefnationContext.class,0);
		}
		public FunctionDefnetionContext functionDefnetion() {
			return getRuleContext(FunctionDefnetionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public XmlTagContext xmlTag() {
			return getRuleContext(XmlTagContext.class,0);
		}
		public ObjectAccessContext objectAccess() {
			return getRuleContext(ObjectAccessContext.class,0);
		}
		public TerminalNode SIMI() { return getToken(ParserFile.SIMI, 0); }
		public TerminalNode LSQUAR() { return getToken(ParserFile.LSQUAR, 0); }
		public TerminalNode RSQUAR() { return getToken(ParserFile.RSQUAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ConstDeclartionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclartion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstDeclartion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstDeclartion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstDeclartion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclartionContext constDeclartion() throws RecognitionException {
		ConstDeclartionContext _localctx = new ConstDeclartionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constDeclartion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CONST);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(161);
				match(ID);
				}
				break;
			case LSQUAR:
				{
				{
				setState(162);
				match(LSQUAR);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(163);
					match(ID);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(164);
						match(COMMA);
						setState(165);
						match(ID);
						}
						}
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(173);
				match(RSQUAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			match(EQUAL);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(177);
				match(SINGLE_QUOTE_STRING);
				}
				break;
			case 2:
				{
				setState(178);
				match(DOUBLE_QUOTE_STRING);
				}
				break;
			case 3:
				{
				setState(179);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(180);
				match(ID);
				}
				break;
			case 5:
				{
				setState(181);
				arrayDefnation();
				}
				break;
			case 6:
				{
				setState(182);
				objectDefnation();
				}
				break;
			case 7:
				{
				setState(183);
				functionDefnetion();
				}
				break;
			case 8:
				{
				setState(184);
				functionCall();
				}
				break;
			case 9:
				{
				setState(185);
				xmlTag();
				}
				break;
			case 10:
				{
				setState(186);
				objectAccess();
				}
				break;
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIMI) {
				{
				setState(189);
				match(SIMI);
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
	public static class FunctionDefnetionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode ARROW_FUNCTION() { return getToken(ParserFile.ARROW_FUNCTION, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ParserFile.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ParserFile.CLOSE_CURLY_BRACKETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public FunctionDefnetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefnetion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionDefnetion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionDefnetion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionDefnetion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefnetionContext functionDefnetion() throws RecognitionException {
		FunctionDefnetionContext _localctx = new FunctionDefnetionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDefnetion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(OPEN_PAREN);
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(193);
				match(ID);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(194);
					match(COMMA);
					setState(195);
					match(ID);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case OPEN_CURLY_BRACKETS:
				{
				{
				setState(201);
				match(OPEN_CURLY_BRACKETS);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(202);
					match(ID);
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(203);
						match(COMMA);
						setState(204);
						match(ID);
						}
						}
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(212);
				match(CLOSE_CURLY_BRACKETS);
				}
				}
				break;
			case CLOSE_PAREN:
				break;
			default:
				break;
			}
			setState(215);
			match(CLOSE_PAREN);
			setState(216);
			match(ARROW_FUNCTION);
			setState(217);
			functionBody();
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ParserFile.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ParserFile.CLOSE_CURLY_BRACKETS, 0); }
		public List<StatemtnContext> statemtn() {
			return getRuleContexts(StatemtnContext.class);
		}
		public StatemtnContext statemtn(int i) {
			return getRuleContext(StatemtnContext.class,i);
		}
		public ReturnStatmentContext returnStatment() {
			return getRuleContext(ReturnStatmentContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(OPEN_CURLY_BRACKETS);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41944078L) != 0)) {
				{
				{
				setState(220);
				statemtn();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(226);
				returnStatment();
				}
			}

			setState(229);
			match(CLOSE_CURLY_BRACKETS);
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
		public TerminalNode RETURN() { return getToken(ParserFile.RETURN, 0); }
		public TerminalNode SIMI() { return getToken(ParserFile.SIMI, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(ParserFile.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(ParserFile.DOUBLE_QUOTE_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public XmlTagContext xmlTag() {
			return getRuleContext(XmlTagContext.class,0);
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
		enterRule(_localctx, 24, RULE_returnStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(RETURN);
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				{
				setState(232);
				match(OPEN_PAREN);
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_QUOTE_STRING:
					{
					setState(233);
					match(SINGLE_QUOTE_STRING);
					}
					break;
				case DOUBLE_QUOTE_STRING:
					{
					setState(234);
					match(DOUBLE_QUOTE_STRING);
					}
					break;
				case NUMBER:
					{
					setState(235);
					match(NUMBER);
					}
					break;
				case ID:
					{
					setState(236);
					match(ID);
					}
					break;
				case LEES_THAN:
					{
					setState(237);
					xmlTag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240);
				match(CLOSE_PAREN);
				}
				}
				break;
			case ID:
			case NUMBER:
			case SINGLE_QUOTE_STRING:
			case DOUBLE_QUOTE_STRING:
			case LEES_THAN:
				{
				setState(246);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLE_QUOTE_STRING:
					{
					setState(241);
					match(SINGLE_QUOTE_STRING);
					}
					break;
				case DOUBLE_QUOTE_STRING:
					{
					setState(242);
					match(DOUBLE_QUOTE_STRING);
					}
					break;
				case NUMBER:
					{
					setState(243);
					match(NUMBER);
					}
					break;
				case ID:
					{
					setState(244);
					match(ID);
					}
					break;
				case LEES_THAN:
					{
					setState(245);
					xmlTag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIMI) {
				{
				setState(250);
				match(SIMI);
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
	public static class ImportStatmentContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserFile.IMPORT, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(ParserFile.DOUBLE_QUOTE_STRING, 0); }
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(ParserFile.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode SIMI() { return getToken(ParserFile.SIMI, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ParserFile.OPEN_CURLY_BRACKETS, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ParserFile.CLOSE_CURLY_BRACKETS, 0); }
		public TerminalNode FROM() { return getToken(ParserFile.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatmentContext importStatment() throws RecognitionException {
		ImportStatmentContext _localctx = new ImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IMPORT);
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE_STRING:
			case DOUBLE_QUOTE_STRING:
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTE_STRING || _la==DOUBLE_QUOTE_STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case OPEN_CURLY_BRACKETS:
				{
				{
				setState(255);
				match(OPEN_CURLY_BRACKETS);
				setState(256);
				match(ID);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					match(ID);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(CLOSE_CURLY_BRACKETS);
				setState(265);
				match(FROM);
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTE_STRING || _la==DOUBLE_QUOTE_STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIMI) {
				{
				setState(269);
				match(SIMI);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SIMI() { return getToken(ParserFile.SIMI, 0); }
		public ArrayDefnationContext arrayDefnation() {
			return getRuleContext(ArrayDefnationContext.class,0);
		}
		public ObjectDefnationContext objectDefnation() {
			return getRuleContext(ObjectDefnationContext.class,0);
		}
		public ObjectAccessContext objectAccess() {
			return getRuleContext(ObjectAccessContext.class,0);
		}
		public XmlTagContext xmlTag() {
			return getRuleContext(XmlTagContext.class,0);
		}
		public FunctionDefnetionContext functionDefnetion() {
			return getRuleContext(FunctionDefnetionContext.class,0);
		}
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(ParserFile.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(ParserFile.DOUBLE_QUOTE_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public TerminalNode NULL_VALUE() { return getToken(ParserFile.NULL_VALUE, 0); }
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
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ID);
			setState(273);
			match(OPEN_PAREN);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(274);
				arrayDefnation();
				}
				break;
			case 2:
				{
				setState(275);
				objectDefnation();
				}
				break;
			case 3:
				{
				setState(276);
				objectAccess();
				}
				break;
			case 4:
				{
				setState(277);
				xmlTag();
				}
				break;
			case 5:
				{
				setState(278);
				functionDefnetion();
				}
				break;
			case 6:
				{
				setState(279);
				match(SINGLE_QUOTE_STRING);
				}
				break;
			case 7:
				{
				setState(280);
				match(DOUBLE_QUOTE_STRING);
				}
				break;
			case 8:
				{
				setState(281);
				match(ID);
				}
				break;
			case 9:
				{
				setState(282);
				match(NUMBER);
				}
				break;
			case 10:
				{
				setState(283);
				match(NULL_VALUE);
				}
				break;
			}
			}
			setState(286);
			match(CLOSE_PAREN);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(287);
				match(SIMI);
				}
				break;
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
	public static class JsAttributeContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ParserFile.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ParserFile.CLOSE_CURLY_BRACKETS, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ObjectAccessContext objectAccess() {
			return getRuleContext(ObjectAccessContext.class,0);
		}
		public FunctionDefnetionContext functionDefnetion() {
			return getRuleContext(FunctionDefnetionContext.class,0);
		}
		public JsAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJsAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJsAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJsAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsAttributeContext jsAttribute() throws RecognitionException {
		JsAttributeContext _localctx = new JsAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jsAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(OPEN_CURLY_BRACKETS);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(291);
				match(ID);
				}
				break;
			case 2:
				{
				setState(292);
				objectAccess();
				}
				break;
			case 3:
				{
				setState(293);
				functionDefnetion();
				}
				break;
			}
			setState(296);
			match(CLOSE_CURLY_BRACKETS);
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
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(ParserFile.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(ParserFile.DOUBLE_QUOTE_STRING, 0); }
		public JsAttributeContext jsAttribute() {
			return getRuleContext(JsAttributeContext.class,0);
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
		enterRule(_localctx, 32, RULE_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
			setState(299);
			match(EQUAL);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE_STRING:
				{
				setState(300);
				match(SINGLE_QUOTE_STRING);
				}
				break;
			case DOUBLE_QUOTE_STRING:
				{
				setState(301);
				match(DOUBLE_QUOTE_STRING);
				}
				break;
			case OPEN_CURLY_BRACKETS:
				{
				setState(302);
				jsAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode LEES_THAN() { return getToken(ParserFile.LEES_THAN, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LARGER_THAN() { return getToken(ParserFile.LARGER_THAN, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LEES_THAN);
			setState(306);
			match(ID);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(307);
				attributes();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(LARGER_THAN);
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
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode LEES_THAN() { return getToken(ParserFile.LEES_THAN, 0); }
		public TerminalNode SLASH() { return getToken(ParserFile.SLASH, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LARGER_THAN() { return getToken(ParserFile.LARGER_THAN, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LEES_THAN);
			setState(316);
			match(SLASH);
			setState(317);
			match(ID);
			setState(318);
			match(LARGER_THAN);
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
	public static class JustOpenTagContext extends ParserRuleContext {
		public TerminalNode LEES_THAN() { return getToken(ParserFile.LEES_THAN, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode SLASH() { return getToken(ParserFile.SLASH, 0); }
		public TerminalNode LARGER_THAN() { return getToken(ParserFile.LARGER_THAN, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public JustOpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justOpenTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJustOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJustOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJustOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustOpenTagContext justOpenTag() throws RecognitionException {
		JustOpenTagContext _localctx = new JustOpenTagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_justOpenTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LEES_THAN);
			setState(321);
			match(ID);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(322);
				attributes();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(SLASH);
			setState(329);
			match(LARGER_THAN);
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
	public static class XmlTagContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<XmlTagContext> xmlTag() {
			return getRuleContexts(XmlTagContext.class);
		}
		public XmlTagContext xmlTag(int i) {
			return getRuleContext(XmlTagContext.class,i);
		}
		public List<JsInJSXContext> jsInJSX() {
			return getRuleContexts(JsInJSXContext.class);
		}
		public JsInJSXContext jsInJSX(int i) {
			return getRuleContext(JsInJSXContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public JustOpenTagContext justOpenTag() {
			return getRuleContext(JustOpenTagContext.class,0);
		}
		public XmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterXmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitXmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitXmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlTagContext xmlTag() throws RecognitionException {
		XmlTagContext _localctx = new XmlTagContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_xmlTag);
		try {
			int _alt;
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(331);
				openTag();
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(335);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LEES_THAN:
							{
							setState(332);
							xmlTag();
							}
							break;
						case OPEN_CURLY_BRACKETS:
							{
							setState(333);
							jsInJSX();
							}
							break;
						case ID:
							{
							setState(334);
							match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(339);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(340);
				closeTag();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				justOpenTag();
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
	public static class JsInJSXContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(ParserFile.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(ParserFile.CLOSE_CURLY_BRACKETS, 0); }
		public ObjectAccessContext objectAccess() {
			return getRuleContext(ObjectAccessContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ShortIfContext shortIf() {
			return getRuleContext(ShortIfContext.class,0);
		}
		public JsInJSXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsInJSX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterJsInJSX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitJsInJSX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitJsInJSX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsInJSXContext jsInJSX() throws RecognitionException {
		JsInJSXContext _localctx = new JsInJSXContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jsInJSX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(OPEN_CURLY_BRACKETS);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(346);
				objectAccess();
				}
				break;
			case 2:
				{
				setState(347);
				functionCall();
				}
				break;
			case 3:
				{
				setState(348);
				shortIf();
				}
				break;
			}
			setState(351);
			match(CLOSE_CURLY_BRACKETS);
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
	public static class ObjectAccessContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ParserFile.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserFile.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public ObjectAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectAccessContext objectAccess() throws RecognitionException {
		ObjectAccessContext _localctx = new ObjectAccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objectAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(353);
				match(ID);
				}
				break;
			case 2:
				{
				setState(354);
				functionCall();
				}
				break;
			}
			setState(357);
			match(DOT);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(358);
				functionCall();
				}
				break;
			case 2:
				{
				setState(359);
				match(ID);
				}
				break;
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(362);
				match(DOT);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(363);
					functionCall();
					}
					break;
				case 2:
					{
					setState(364);
					match(ID);
					}
					break;
				}
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ShortIfContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode AND() { return getToken(ParserFile.AND, 0); }
		public XmlTagContext xmlTag() {
			return getRuleContext(XmlTagContext.class,0);
		}
		public ShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortIfContext shortIf() throws RecognitionException {
		ShortIfContext _localctx = new ShortIfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_shortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ID);
			setState(373);
			match(AND);
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(374);
				match(ID);
				}
				break;
			case LEES_THAN:
				{
				setState(375);
				xmlTag();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\u0004\u0001#\u017b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0005\u00008\b\u0000\n"+
		"\u0000\f\u0000;\t\u0000\u0001\u0000\u0003\u0000>\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002M\b\u0002\u000b\u0002\f\u0002N\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0003"+
		"\u0003\u0003Z\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005h\b\u0005\n\u0005\f\u0005k\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006u\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0005\u0007~\b\u0007\n\u0007"+
		"\f\u0007\u0081\t\u0007\u0005\u0007\u0083\b\u0007\n\u0007\f\u0007\u0086"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008a\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0091\b\b\u0005\b\u0093\b\b\n\b\f\b"+
		"\u0096\t\b\u0005\b\u0098\b\b\n\b\f\b\u009b\t\b\u0001\b\u0001\b\u0003\b"+
		"\u009f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a7"+
		"\b\t\n\t\f\t\u00aa\t\t\u0003\t\u00ac\b\t\u0001\t\u0003\t\u00af\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00bc\b\t\u0001\t\u0003\t\u00bf\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00c5\b\n\n\n\f\n\u00c8\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00ce\b\n\n\n\f\n\u00d1\t\n\u0003\n\u00d3\b\n\u0001"+
		"\n\u0003\n\u00d6\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00de\b\u000b\n\u000b\f\u000b\u00e1\t\u000b\u0001\u000b"+
		"\u0003\u000b\u00e4\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ef\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f7\b\f\u0003\f\u00f9\b\f\u0001\f"+
		"\u0003\f\u00fc\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0104\b\r\n\r\f\r\u0107\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u010c\b"+
		"\r\u0001\r\u0003\r\u010f\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011d\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0121\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0127\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0130\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0135\b\u0011\n\u0011\f\u0011"+
		"\u0138\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0144\b\u0013\n\u0013\f\u0013\u0147\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0150"+
		"\b\u0014\n\u0014\f\u0014\u0153\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0158\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u015e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0164\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0169\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u016e\b"+
		"\u0016\u0005\u0016\u0170\b\u0016\n\u0016\f\u0016\u0173\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0179\b\u0017\u0001\u0017"+
		"\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0003\u0001\u0000\u0001"+
		"\u0003\u0001\u0000\n\f\u0001\u0000\f\r\u01b9\u00003\u0001\u0000\u0000"+
		"\u0000\u0002?\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006"+
		"P\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000"+
		"\u0000\fp\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010"+
		"\u008b\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000\u0014"+
		"\u00c0\u0001\u0000\u0000\u0000\u0016\u00db\u0001\u0000\u0000\u0000\u0018"+
		"\u00e7\u0001\u0000\u0000\u0000\u001a\u00fd\u0001\u0000\u0000\u0000\u001c"+
		"\u0110\u0001\u0000\u0000\u0000\u001e\u0122\u0001\u0000\u0000\u0000 \u012a"+
		"\u0001\u0000\u0000\u0000\"\u0131\u0001\u0000\u0000\u0000$\u013b\u0001"+
		"\u0000\u0000\u0000&\u0140\u0001\u0000\u0000\u0000(\u0157\u0001\u0000\u0000"+
		"\u0000*\u0159\u0001\u0000\u0000\u0000,\u0163\u0001\u0000\u0000\u0000."+
		"\u0174\u0001\u0000\u0000\u000002\u0003\u001a\r\u000010\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000049\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0003"+
		"\u0004\u0002\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<>\u0003\u0002\u0001\u0000=<\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0001\u0001\u0000\u0000\u0000"+
		"?A\u0005\u0006\u0000\u0000@B\u0005\u0007\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\n\u0000"+
		"\u0000D\u0003\u0001\u0000\u0000\u0000EM\u0003\u0006\u0003\u0000FM\u0003"+
		"\f\u0006\u0000GM\u0003\u000e\u0007\u0000HM\u0003\u0010\b\u0000IM\u0003"+
		"\u0012\t\u0000JM\u0003,\u0016\u0000KM\u0003\u001c\u000e\u0000LE\u0001"+
		"\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000"+
		"LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0005\u0001\u0000\u0000\u0000"+
		"PQ\u0007\u0000\u0000\u0000QR\u0005\n\u0000\u0000RV\u0005\u0013\u0000\u0000"+
		"SW\u0003\n\u0005\u0000TW\u0005\u000b\u0000\u0000UW\u0003\b\u0004\u0000"+
		"VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XZ\u0005\"\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000[\\\u0005"+
		"!\u0000\u0000\\`\u0005\u0015\u0000\u0000]_\u0005\f\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cd\u0005\u0016\u0000\u0000d\t\u0001\u0000\u0000\u0000ei\u0005\u0015"+
		"\u0000\u0000fh\u0005\n\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0016\u0000\u0000"+
		"mn\u0005#\u0000\u0000no\u0003\u0016\u000b\u0000o\u000b\u0001\u0000\u0000"+
		"\u0000pq\u0005\n\u0000\u0000qr\u0005\u001c\u0000\u0000rt\u0007\u0001\u0000"+
		"\u0000su\u0005\u001b\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000u\r\u0001\u0000\u0000\u0000v\u0084\u0005\u0019\u0000\u0000"+
		"w\u007f\u0003\f\u0006\u0000xy\u0005\u001d\u0000\u0000y{\u0003\f\u0006"+
		"\u0000z|\u0005\u001d\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000~\u0081"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082w\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0005\u001a\u0000\u0000\u0088\u008a\u0005\u001b"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u0099\u0005\u0017"+
		"\u0000\u0000\u008c\u0094\u0003\u000e\u0007\u0000\u008d\u008e\u0005\u001d"+
		"\u0000\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u0091\u0005\u001d"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000"+
		"\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u008c\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u0018"+
		"\u0000\u0000\u009d\u009f\u0005\u001b\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0011\u0001\u0000"+
		"\u0000\u0000\u00a0\u00ae\u0005\u0003\u0000\u0000\u00a1\u00af\u0005\n\u0000"+
		"\u0000\u00a2\u00ab\u0005\u0017\u0000\u0000\u00a3\u00a8\u0005\n\u0000\u0000"+
		"\u00a4\u00a5\u0005\u001d\u0000\u0000\u00a5\u00a7\u0005\n\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a3\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0005\u0018\u0000\u0000\u00ae"+
		"\u00a1\u0001\u0000\u0000\u0000\u00ae\u00a2\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00bb\u0005\u0013\u0000\u0000\u00b1"+
		"\u00bc\u0005\f\u0000\u0000\u00b2\u00bc\u0005\r\u0000\u0000\u00b3\u00bc"+
		"\u0005\u000b\u0000\u0000\u00b4\u00bc\u0005\n\u0000\u0000\u00b5\u00bc\u0003"+
		"\u0010\b\u0000\u00b6\u00bc\u0003\u000e\u0007\u0000\u00b7\u00bc\u0003\u0014"+
		"\n\u0000\u00b8\u00bc\u0003\u001c\u000e\u0000\u00b9\u00bc\u0003(\u0014"+
		"\u0000\u00ba\u00bc\u0003,\u0016\u0000\u00bb\u00b1\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b2\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b4\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0005\u001b\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u0013\u0001\u0000\u0000\u0000"+
		"\u00c0\u00d5\u0005\u0015\u0000\u0000\u00c1\u00c6\u0005\n\u0000\u0000\u00c2"+
		"\u00c3\u0005\u001d\u0000\u0000\u00c3\u00c5\u0005\n\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00d2"+
		"\u0005\u0019\u0000\u0000\u00ca\u00cf\u0005\n\u0000\u0000\u00cb\u00cc\u0005"+
		"\u001d\u0000\u0000\u00cc\u00ce\u0005\n\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0005\u001a\u0000\u0000\u00d5\u00c1\u0001\u0000"+
		"\u0000\u0000\u00d5\u00c9\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0016"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0014\u0000\u0000\u00d9\u00da\u0003\u0016"+
		"\u000b\u0000\u00da\u0015\u0001\u0000\u0000\u0000\u00db\u00df\u0005\u0019"+
		"\u0000\u0000\u00dc\u00de\u0003\u0004\u0002\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\u0018"+
		"\f\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u001a\u0000"+
		"\u0000\u00e6\u0017\u0001\u0000\u0000\u0000\u00e7\u00f8\u0005\b\u0000\u0000"+
		"\u00e8\u00ee\u0005\u0015\u0000\u0000\u00e9\u00ef\u0005\f\u0000\u0000\u00ea"+
		"\u00ef\u0005\r\u0000\u0000\u00eb\u00ef\u0005\u000b\u0000\u0000\u00ec\u00ef"+
		"\u0005\n\u0000\u0000\u00ed\u00ef\u0003(\u0014\u0000\u00ee\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f9\u0005"+
		"\u0016\u0000\u0000\u00f1\u00f7\u0005\f\u0000\u0000\u00f2\u00f7\u0005\r"+
		"\u0000\u0000\u00f3\u00f7\u0005\u000b\u0000\u0000\u00f4\u00f7\u0005\n\u0000"+
		"\u0000\u00f5\u00f7\u0003(\u0014\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0005\u001b\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0019\u0001\u0000\u0000\u0000"+
		"\u00fd\u010b\u0005\u0004\u0000\u0000\u00fe\u010c\u0007\u0002\u0000\u0000"+
		"\u00ff\u0100\u0005\u0019\u0000\u0000\u0100\u0105\u0005\n\u0000\u0000\u0101"+
		"\u0102\u0005\u001d\u0000\u0000\u0102\u0104\u0005\n\u0000\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\u001a\u0000\u0000\u0109\u010a\u0005\u0005\u0000\u0000\u010a\u010c"+
		"\u0007\u0002\u0000\u0000\u010b\u00fe\u0001\u0000\u0000\u0000\u010b\u00ff"+
		"\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0005\u001b\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u001b\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0005\n\u0000\u0000\u0111\u011c\u0005\u0015\u0000\u0000\u0112\u011d\u0003"+
		"\u0010\b\u0000\u0113\u011d\u0003\u000e\u0007\u0000\u0114\u011d\u0003,"+
		"\u0016\u0000\u0115\u011d\u0003(\u0014\u0000\u0116\u011d\u0003\u0014\n"+
		"\u0000\u0117\u011d\u0005\f\u0000\u0000\u0118\u011d\u0005\r\u0000\u0000"+
		"\u0119\u011d\u0005\n\u0000\u0000\u011a\u011d\u0005\u000b\u0000\u0000\u011b"+
		"\u011d\u0005\t\u0000\u0000\u011c\u0112\u0001\u0000\u0000\u0000\u011c\u0113"+
		"\u0001\u0000\u0000\u0000\u011c\u0114\u0001\u0000\u0000\u0000\u011c\u0115"+
		"\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000\u0000\u0000\u011c\u0117"+
		"\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000\u0000\u0000\u011c\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011b"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0001\u0000\u0000\u0000\u011e\u0120\u0005\u0016\u0000\u0000\u011f\u0121"+
		"\u0005\u001b\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u001d\u0001\u0000\u0000\u0000\u0122\u0126"+
		"\u0005\u0019\u0000\u0000\u0123\u0127\u0005\n\u0000\u0000\u0124\u0127\u0003"+
		",\u0016\u0000\u0125\u0127\u0003\u0014\n\u0000\u0126\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u001a"+
		"\u0000\u0000\u0129\u001f\u0001\u0000\u0000\u0000\u012a\u012b\u0005\n\u0000"+
		"\u0000\u012b\u012f\u0005\u0013\u0000\u0000\u012c\u0130\u0005\f\u0000\u0000"+
		"\u012d\u0130\u0005\r\u0000\u0000\u012e\u0130\u0003\u001e\u000f\u0000\u012f"+
		"\u012c\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u0130!\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005\u000f\u0000\u0000\u0132\u0136\u0005\n\u0000\u0000\u0133\u0135\u0003"+
		" \u0010\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000"+
		"\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005\u000e\u0000\u0000\u013a#\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005\u000f\u0000\u0000\u013c\u013d\u0005\u0010\u0000"+
		"\u0000\u013d\u013e\u0005\n\u0000\u0000\u013e\u013f\u0005\u000e\u0000\u0000"+
		"\u013f%\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u000f\u0000\u0000\u0141"+
		"\u0145\u0005\n\u0000\u0000\u0142\u0144\u0003 \u0010\u0000\u0143\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005\u0010\u0000\u0000\u0149\u014a\u0005\u000e\u0000\u0000\u014a\'\u0001"+
		"\u0000\u0000\u0000\u014b\u0151\u0003\"\u0011\u0000\u014c\u0150\u0003("+
		"\u0014\u0000\u014d\u0150\u0003*\u0015\u0000\u014e\u0150\u0005\n\u0000"+
		"\u0000\u014f\u014c\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0003$\u0012\u0000\u0155\u0158\u0001\u0000\u0000\u0000"+
		"\u0156\u0158\u0003&\u0013\u0000\u0157\u014b\u0001\u0000\u0000\u0000\u0157"+
		"\u0156\u0001\u0000\u0000\u0000\u0158)\u0001\u0000\u0000\u0000\u0159\u015d"+
		"\u0005\u0019\u0000\u0000\u015a\u015e\u0003,\u0016\u0000\u015b\u015e\u0003"+
		"\u001c\u000e\u0000\u015c\u015e\u0003.\u0017\u0000\u015d\u015a\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0005\u001a\u0000\u0000\u0160+\u0001\u0000\u0000"+
		"\u0000\u0161\u0164\u0005\n\u0000\u0000\u0162\u0164\u0003\u001c\u000e\u0000"+
		"\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0168\u0005\u001e\u0000\u0000"+
		"\u0166\u0169\u0003\u001c\u000e\u0000\u0167\u0169\u0005\n\u0000\u0000\u0168"+
		"\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u0171\u0001\u0000\u0000\u0000\u016a\u016d\u0005\u001e\u0000\u0000\u016b"+
		"\u016e\u0003\u001c\u000e\u0000\u016c\u016e\u0005\n\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0170"+
		"\u0001\u0000\u0000\u0000\u016f\u016a\u0001\u0000\u0000\u0000\u0170\u0173"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0001\u0000\u0000\u0000\u0172-\u0001\u0000\u0000\u0000\u0173\u0171\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175\u0178\u0005\u0012"+
		"\u0000\u0000\u0176\u0179\u0005\n\u0000\u0000\u0177\u0179\u0003(\u0014"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0179/\u0001\u0000\u0000\u0000439=ALNVY`it{\u007f\u0084\u0089\u0090"+
		"\u0094\u0099\u009e\u00a8\u00ab\u00ae\u00bb\u00be\u00c6\u00cf\u00d2\u00d5"+
		"\u00df\u00e3\u00ee\u00f6\u00f8\u00fb\u0105\u010b\u010e\u011c\u0120\u0126"+
		"\u012f\u0136\u0145\u014f\u0151\u0157\u015d\u0163\u0168\u016d\u0171\u0178";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}