// Generated from /Users/twer/antlr/calculator/src/main/antlr4/LExpr.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LExprParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull LExprParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(@NotNull LExprParser.SContext ctx);

	/**
	 * Visit a parse tree produced by {@link LExprParser#Mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull LExprParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link LExprParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull LExprParser.IntContext ctx);
}