// Generated from C:/Users/User/Desktop/compilerProject/ParserFile.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserFile}.
 */
public interface ParserFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserFile#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(ParserFile.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(ParserFile.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(ParserFile.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(ParserFile.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importR}.
	 * @param ctx the parse tree
	 */
	void enterImportR(ParserFile.ImportRContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importR}.
	 * @param ctx the parse tree
	 */
	void exitImportR(ParserFile.ImportRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#variableDiclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDiclaration(ParserFile.VariableDiclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#variableDiclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDiclaration(ParserFile.VariableDiclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(ParserFile.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(ParserFile.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ParserFile.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ParserFile.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ParserFile.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ParserFile.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#function1}.
	 * @param ctx the parse tree
	 */
	void enterFunction1(ParserFile.Function1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#function1}.
	 * @param ctx the parse tree
	 */
	void exitFunction1(ParserFile.Function1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#function2}.
	 * @param ctx the parse tree
	 */
	void enterFunction2(ParserFile.Function2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#function2}.
	 * @param ctx the parse tree
	 */
	void exitFunction2(ParserFile.Function2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#function3}.
	 * @param ctx the parse tree
	 */
	void enterFunction3(ParserFile.Function3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#function3}.
	 * @param ctx the parse tree
	 */
	void exitFunction3(ParserFile.Function3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(ParserFile.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(ParserFile.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#returnStatment}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatment(ParserFile.ReturnStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#returnStatment}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatment(ParserFile.ReturnStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#returnStatment1}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatment1(ParserFile.ReturnStatment1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#returnStatment1}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatment1(ParserFile.ReturnStatment1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(ParserFile.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(ParserFile.SyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#pureReact}.
	 * @param ctx the parse tree
	 */
	void enterPureReact(ParserFile.PureReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#pureReact}.
	 * @param ctx the parse tree
	 */
	void exitPureReact(ParserFile.PureReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(ParserFile.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(ParserFile.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ParserFile.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ParserFile.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(ParserFile.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(ParserFile.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(ParserFile.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(ParserFile.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#useState}.
	 * @param ctx the parse tree
	 */
	void enterUseState(ParserFile.UseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#useState}.
	 * @param ctx the parse tree
	 */
	void exitUseState(ParserFile.UseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ParserFile.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ParserFile.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ParserFile.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ParserFile.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(ParserFile.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(ParserFile.UseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arrayy}.
	 * @param ctx the parse tree
	 */
	void enterArrayy(ParserFile.ArrayyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arrayy}.
	 * @param ctx the parse tree
	 */
	void exitArrayy(ParserFile.ArrayyContext ctx);
}