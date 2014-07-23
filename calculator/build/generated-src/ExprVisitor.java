// Generated from /Users/twer/antlr/calculator/src/main/antlr4/Expr.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(@NotNull ExprParser.SContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(@NotNull ExprParser.EContext ctx);
}