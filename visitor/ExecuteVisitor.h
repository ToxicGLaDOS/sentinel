/*
 * Declarations for methods of ExecuteVisitor
 * 
 * When a context is visited by methods of ExecuteVisitor the code they represent are executed
 * For example, visiting an InfixExprContext with the visitInfixExpr method will execute the sentinel code
 * in that InfixExprContext. If the InfixExprContext has 2 + 2 in it then visiting it will do 2 + 2.
 * What I'm getting at here is to execute sentinel code you visit the context.
 * 
 * The entry point to all of these methods is visitProgram which visits the rest of the
 * rest of the parse tree. Because of that you should never call any of the visitXXX
 * from outside of another visitXXX method except visitProgram.
*/

#include "SentinelBaseVisitor.h"
#include "SentinelParser.h"
#include "Scope.h"
#include <memory>

class ExecuteVisitor : public antlrcpptest::SentinelBaseVisitor {
    public:
        std::shared_ptr<Scope> scope;
        ExecuteVisitor();
        ExecuteVisitor(std::shared_ptr<Scope> scope);
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

        antlrcpp::Any visitVariableExpr(antlrcpptest::SentinelParser::VariableExprContext* context) override;

        antlrcpp::Any visitTwoParamWatcherDef(antlrcpptest::SentinelParser::TwoParamWatcherDefContext* context) override;
    
        antlrcpp::Any visitWatchesDeclStatement(antlrcpptest::SentinelParser::WatchesDeclStatementContext* context) override;

        //antlrcpp::Any visitUnaryExpr(antlrcpptest::SentinelParser::UnaryExprContext* context) override;
};