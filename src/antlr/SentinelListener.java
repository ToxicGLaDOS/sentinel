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
	 * Enter a parse tree produced by the {@code watchesDeclStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWatchesDeclStatement(SentinelParser.WatchesDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code watchesDeclStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWatchesDeclStatement(SentinelParser.WatchesDeclStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code variableDeclStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclStatement(SentinelParser.VariableDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclStatement(SentinelParser.VariableDeclStatementContext ctx);
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