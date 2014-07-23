// Generated from /Users/twer/antlr/calculator/src/main/antlr4/Aml.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AmlParser#avail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvail(@NotNull AmlParser.AvailContext ctx);

	/**
	 * Visit a parse tree produced by {@link AmlParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull AmlParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link AmlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull AmlParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link AmlParser#keyString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyString(@NotNull AmlParser.KeyStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link AmlParser#keyInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyInt(@NotNull AmlParser.KeyIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link AmlParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(@NotNull AmlParser.EntityContext ctx);

	/**
	 * Visit a parse tree produced by {@link AmlParser#network}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork(@NotNull AmlParser.NetworkContext ctx);
}