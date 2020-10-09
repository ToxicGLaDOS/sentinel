#include "AstNode.h"
#include "SentinelBaseVisitor.h"
#include "SentinelParser.h"
#include "StatementNode.h"
#include "ProgramNode.h"

class BuildAstVisitor : public antlrcpptest::SentinelBaseVisitor {
    public:
        antlrcpp::Any visitProgram(antlrcpptest::SentinelParser::ProgramContext* context) override;

        // public AstNode visitTwoParamWatcherDef(SentinelParser.TwoParamWatcherDefContext context){
        //     List<StatementNode> statementNodes = new LinkedList<>();

        //     // Visit each statement and add the resulting node the the list
        //     for (SentinelParser.StatementContext statementContext :
        //             context.statement()) {
        //         StatementNode statementNode = (StatementNode) visit(statementContext);
        //         statementNodes.add(statementNode);
        //     }
        //     return new TwoParamWatcherDefNode(context.watcherName.getText(), context.type.getText(), context.varName0.getText(), context.varName1.getText(), statementNodes);
        // }

        antlrcpp::Any visitEqualStatement(antlrcpptest::SentinelParser::EqualStatementContext* context) override;


        antlrcpp::Any visitVariableDeclStatement(antlrcpptest::SentinelParser::VariableDeclStatementContext* context) override;

        // public AstNode visitWatchesDeclStatement(SentinelParser.WatchesDeclStatementContext context) {
        //     return new WatchesDeclStatementNode(context.watcherName.getText(), context.watchable.getText());
        // }

        antlrcpp::Any visitNumberExpr(antlrcpptest::SentinelParser::NumberExprContext* context) override;

        // public AstNode visitParensExpr(SentinelParser.ParensExprContext context) {
        //         return visit(context.expr());
        // }

        // public AstNode visitInfixExpr(SentinelParser.InfixExprContext context){
        //         InfixExpressionNode node;

        //         switch (context.op.getType()) {
        //         case SentinelLexer.OP_ADD:
        //             node = new AdditionNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
        //             break;

        //         case SentinelLexer.OP_SUB:
        //             node = new SubtractionNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
        //             break;

        //         case SentinelLexer.OP_MUL:
        //             node = new MultiplicationNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
        //             break;

        //         case SentinelLexer.OP_DIV:
        //             node = new DivisionNode((ExpressionNode) visit(context.left), (ExpressionNode) visit(context.right));
        //             break;

        //         default:
        //             throw new UnsupportedOperationException();
        //         }

        //         return node;
        // }

        // public AstNode visitUnaryExpr(SentinelParser.UnaryExprContext context) {
        //         switch (context.op.getType()) {
        //         case SentinelLexer.OP_ADD:
        //                 return visit(context.expr());

        //         case SentinelLexer.OP_SUB:
        //                 return new NegateNode((ExpressionNode) visit(context.expr()));

        //         default:
        //                 throw new UnsupportedOperationException();
        //         }
        // }
};