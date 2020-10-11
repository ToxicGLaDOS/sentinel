#include "SentinelBaseVisitor.h"
#include "SentinelParser.h"

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

        antlrcpp::Any visitLiteralExpr(antlrcpptest::SentinelParser::LiteralExprContext* context) override;

        antlrcpp::Any visitFloatLiteral(antlrcpptest::SentinelParser::FloatLiteralContext* context) override;

        antlrcpp::Any visitIntLiteral(antlrcpptest::SentinelParser::IntLiteralContext* context) override;

        // public AstNode visitParensExpr(SentinelParser.ParensExprContext context) {
        //         return visit(context.expr());
        // }

        antlrcpp::Any visitInfixExpr(antlrcpptest::SentinelParser::InfixExprContext* context) override;

        //antlrcpp::Any visitUnaryExpr(antlrcpptest::SentinelParser::UnaryExprContext* context) override;
};