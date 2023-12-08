// Generated from C:/Users/Omar/Desktop/anas/Compiler/ParserFile.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link ParserFile#reactProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactProgram(ParserFile.ReactProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ParserFile.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#statemtn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatemtn(ParserFile.StatemtnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#variableDiclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDiclaration(ParserFile.VariableDiclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ParserFile.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#function2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction2(ParserFile.Function2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAssign(ParserFile.ObjectAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectDefnation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDefnation(ParserFile.ObjectDefnationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrayDefnation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefnation(ParserFile.ArrayDefnationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclartion(ParserFile.ConstDeclartionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionDefnetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefnetion(ParserFile.FunctionDefnetionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ParserFile.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#returnStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatment(ParserFile.ReturnStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatment(ParserFile.ImportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ParserFile.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#jsAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsAttribute(ParserFile.JsAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ParserFile.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(ParserFile.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(ParserFile.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#justOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustOpenTag(ParserFile.JustOpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#xmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTag(ParserFile.XmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#jsInJSX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsInJSX(ParserFile.JsInJSXContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAccess(ParserFile.ObjectAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#shortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortIf(ParserFile.ShortIfContext ctx);
}