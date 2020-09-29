// Generated from src/antlr/Sentinel.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SentinelParser}.
 */
public interface SentinelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SentinelParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SentinelParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SentinelParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SentinelParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code twoParamWatcherDef}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTwoParamWatcherDef(SentinelParser.TwoParamWatcherDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code twoParamWatcherDef}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTwoParamWatcherDef(SentinelParser.TwoParamWatcherDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oneParamWatcherDef}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOneParamWatcherDef(SentinelParser.OneParamWatcherDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oneParamWatcherDef}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOneParamWatcherDef(SentinelParser.OneParamWatcherDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code watchesStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWatchesStatement(SentinelParser.WatchesStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code watchesStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWatchesStatement(SentinelParser.WatchesStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEqualStatement(SentinelParser.EqualStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEqualStatement(SentinelParser.EqualStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(SentinelParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(SentinelParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(SentinelParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(SentinelParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(SentinelParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(SentinelParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(SentinelParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(SentinelParser.ParensExprContext ctx);
}