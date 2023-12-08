// Generated from C:/Users/User/Desktop/compilerProject/ParserFile.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserFile}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserFile#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(ParserFile.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ParserFile.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportR(ParserFile.ImportRContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#variableDiclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDiclaration(ParserFile.VariableDiclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(ParserFile.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ParserFile.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserFile.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#function1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction1(ParserFile.Function1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#function2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction2(ParserFile.Function2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#function3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction3(ParserFile.Function3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(ParserFile.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#returnStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatment(ParserFile.ReturnStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#returnStatment1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatment1(ParserFile.ReturnStatment1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(ParserFile.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#pureReact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureReact(ParserFile.PureReactContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ParserFile.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ParserFile.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(ParserFile.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ParserFile.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(ParserFile.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ParserFile.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ParserFile.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ParserFile.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrayy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayy(ParserFile.ArrayyContext ctx);
}