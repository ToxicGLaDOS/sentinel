package pizza.blackolivepineapple.sentinel.visitor;

import antlr.SentinelLexer;
import antlr.SentinelParser;
import antlr.SentinelBaseVisitor;
import pizza.blackolivepineapple.sentinel.ast.*;

import java.lang.Double;
import java.util.LinkedList;
import java.util.List;

public class BuildAstVisitor extends SentinelBaseVisitor<AstNode> {
        public AstNode visitProgram(SentinelParser.ProgramContext context) {
            List<StatementNode> statementNodes = new LinkedList<>();
            for (SentinelParser.StatementContext statementContext :
                    context.statement()) {
                StatementNode statementNode = (StatementNode) visit(statementContext);
                statementNodes.add(statementNode);
            }
            return new ProgramNode(statementNodes);
        }

        public AstNode visitTwoParamWatcherDef(SentinelParser.TwoParamWatcherDefContext context){
            return new TwoParamWatcherDefNode(context.watcherName.getText(), context.type.getText(), context.varName0.getText(), context.varName1.getText());
        }

        public AstNode visitNumberExpr(SentinelParser.NumberExprContext context) {
                return new NumberNode(Double.parseDouble(context.value.getText()));
        }

        public AstNode visitParensExpr(SentinelParser.ParensExprContext context) {
                return visit(context.expr());
        }

        public AstNode visitInfixExpr(SentinelParser.InfixExprContext context){
                InfixExpressionNode node;

                switch (context.op.getType()) {
                case SentinelLexer.OP_ADD:
                    node = new AdditionNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
                    break;

                case SentinelLexer.OP_SUB:
                    node = new SubtractionNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
                    break;

                case SentinelLexer.OP_MUL:
                    node = new MultiplicationNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
                    break;

                case SentinelLexer.OP_DIV:
                    node = new DivisionNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
                    break;

                default:
                    throw new UnsupportedOperationException();
                }

                return node;
        }

        public AstNode visitUnaryExpr(SentinelParser.UnaryExprContext context) {
                switch (context.op.getType()) {
                case SentinelLexer.OP_ADD:
                        return visit(context.expr());

                case SentinelLexer.OP_SUB:
                        return new NegateNode((ExpressionNode) visit(context.expr()));

                default:
                        throw new UnsupportedOperationException();
                }
        }
}