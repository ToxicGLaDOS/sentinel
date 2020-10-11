/*
 * Definitions for methods of ExecuteVisitor
 * 
 * See ExecuteVisitor.h for more information.
*/

#include "ExecuteVisitor.h"
#include "SentinelValue.h"
#include "DoubleValue.h"
#include <memory>


/*
 * This is the only method that should be called from outside this class.
*/
antlrcpp::Any ExecuteVisitor::visitProgram(antlrcpptest::SentinelParser::ProgramContext* context) {

    for (antlrcpptest::SentinelParser::StatementContext* statementContext : context->statement()){
        visit(statementContext);
    }
    return nullptr;
}

antlrcpp::Any ExecuteVisitor::visitEqualStatement(antlrcpptest::SentinelParser::EqualStatementContext *context){
    return visit(context->expression);
}

antlrcpp::Any ExecuteVisitor::visitVariableDeclStatement(antlrcpptest::SentinelParser::VariableDeclStatementContext* context){
    // Here we probably add the variable to the symbol table
    return visit(context->expression);
}

antlrcpp::Any ExecuteVisitor::visitLiteralExpr(antlrcpptest::SentinelParser::LiteralExprContext* context) {
    if(context->literal()->children.size() < 1){
        throw std::runtime_error("literal expression with no children?");
    }
    return visit(context->literal()->children[0]);
}

antlrcpp::Any ExecuteVisitor::visitFloatLiteral(antlrcpptest::SentinelParser::FloatLiteralContext* context) {
    auto number = std::make_shared<DoubleValue>(stod(context->FLOAT()->getText()));
    return std::dynamic_pointer_cast<SentinelValue>(number);
}

antlrcpp::Any ExecuteVisitor::visitIntLiteral(antlrcpptest::SentinelParser::IntLiteralContext* context) {
    auto number = std::make_shared<IntValue>(stoi(context->INT()->getText()));
    return std::dynamic_pointer_cast<SentinelValue>(number);
}

antlrcpp::Any ExecuteVisitor::visitInfixExpr(antlrcpptest::SentinelParser::InfixExprContext* context){
    std::shared_ptr<SentinelValue> value;
    auto left = visit(context->left).as<std::shared_ptr<SentinelValue>>();
    auto right = visit(context->right).as<std::shared_ptr<SentinelValue>>();

    switch (context->op->getType()) {
        case antlrcpptest::SentinelParser::OP_ADD:
            value = left->add(*right);
            break;

        //case antlrcpptest::SentinelParser::OP_SUB:
        //    node = SubtractionNode(visit(context->left).as<ExpressionNode>(), visit(context->right).as<ExpressionNode>());
        //    break;

        //case antlrcpptest::SentinelParser::OP_MUL:
        //    node = MultiplicationNode(visit(context->left).as<ExpressionNode>(), visit(context->right).as<ExpressionNode>());
        //    break;

        //case antlrcpptest::SentinelParser::OP_DIV:
        //    node = DivisionNode(visit(context->left).as<ExpressionNode>(),visit(context->right).as<ExpressionNode>());
        //    break;

        default:
            throw std::runtime_error("Infix expression with operator that isn't *,-,+,/ found :(");
    }
    std::cout << "Hey I just did an addition the result was: " <<  value->toString() << std::endl;
    return value;
}

// antlrcpp::Any ExecuteVisitor::visitUnaryExpr(antlrcpptest::SentinelParser::UnaryExprContext* context){
//     std::cout << "Unary expr" << std::endl;
//     switch (context->op->getType()) {
//         case antlrcpptest::SentinelParser::OP_ADD:
//                 return visit(context->expr());
// 
//         case antlrcpptest::SentinelParser::OP_SUB:
//                 return new NegateNode(visit(context->expr()).as<ExpressionNode>());
// 
//         default:
//                 throw std::runtime_error("Unary expression that is neither + nor - detected :(");
//     }
// }