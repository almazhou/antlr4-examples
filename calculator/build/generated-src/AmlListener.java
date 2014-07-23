// Generated from /Users/twer/antlr/calculator/src/main/antlr4/Aml.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmlParser}.
 */
public interface AmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmlParser#avail}.
	 * @param ctx the parse tree
	 */
	void enterAvail(@NotNull AmlParser.AvailContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlParser#avail}.
	 * @param ctx the parse tree
	 */
	void exitAvail(@NotNull AmlParser.AvailContext ctx);

	/**
	 * Enter a parse tree produced by {@link AmlParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull AmlParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull AmlParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link AmlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull AmlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull AmlParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link AmlParser#keyString}.
	 * @param ctx the parse tree
	 */
	void enterKeyString(@NotNull AmlParser.KeyStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlParser#keyString}.
	 * @param ctx the parse tree
	 */
	void exitKeyString(@NotNull AmlParser.KeyStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link AmlParser#keyInt}.
	 * @param ctx the parse tree
	 */
	void enterKeyInt(@NotNull AmlParser.KeyIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlParser#keyInt}.
	 * @param ctx the parse tree
	 */
	void exitKeyInt(@NotNull AmlParser.KeyIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link AmlParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(@NotNull AmlParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(@NotNull AmlParser.EntityContext ctx);

	/**
	 * Enter a parse tree produced by {@link AmlParser#network}.
	 * @param ctx the parse tree
	 */
	void enterNetwork(@NotNull AmlParser.NetworkContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlParser#network}.
	 * @param ctx the parse tree
	 */
	void exitNetwork(@NotNull AmlParser.NetworkContext ctx);
}