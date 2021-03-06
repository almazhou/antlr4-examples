// Generated from /Users/twer/antlr/listener/src/main/antlr4/PropertyFile.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PropertyFileParser}.
 */
public interface PropertyFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PropertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull PropertyFileParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull PropertyFileParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link PropertyFileParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(@NotNull PropertyFileParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyFileParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(@NotNull PropertyFileParser.PropContext ctx);
}