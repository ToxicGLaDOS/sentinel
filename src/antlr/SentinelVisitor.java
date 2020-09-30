// Generated from src/antlr/Sentinel.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SentinelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SentinelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SentinelParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SentinelParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code twoParamWatcherDef}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoParamWatcherDef(SentinelParser.TwoParamWatcherDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code watchesDeclStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWatchesDeclStatement(SentinelParser.WatchesDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualStatement(SentinelParser.EqualStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclStatement}
	 * labeled alternative in {@link SentinelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclStatement(SentinelParser.VariableDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(SentinelParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(SentinelParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(SentinelParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link SentinelParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(SentinelParser.ParensExprContext ctx);
}