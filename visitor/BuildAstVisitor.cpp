#include "BuildAstVisitor.h"
#include "ExpressionNode.h"
#include "EqualStatementNode.h"
#include "NumberNode.h"
#include "VariableDeclStatementNode.h"
#include "AstNode.h"
#include "ProgramNode.h"

antlrcpp::Any BuildAstVisitor::visitProgram(antlrcpptest::SentinelParser::ProgramContext* context) {
    std::vector<StatementNode*> statementNodes;


    for (antlrcpptest::SentinelParser::StatementContext* statementContext : context->statement()){
        antlrcpp::Any anyType = visit(statementContext);
        StatementNode* statementNode = anyType.as<EqualStatementNode*>();
        statementNodes.push_back(statementNode);
    }

    return new ProgramNode(statementNodes);
}

antlrcpp::Any BuildAstVisitor::visitEqualStatement(antlrcpptest::SentinelParser::EqualStatementContext *context){
    
    std::string varName = context->varName->getText();
    antlrcpp::Any anyType = visit(context->expression);
    ExpressionNode* expressionNode = anyType.as<NumberNode*>();
    return new EqualStatementNode(varName, expressionNode);
}

antlrcpp::Any BuildAstVisitor::visitVariableDeclStatement(antlrcpptest::SentinelParser::VariableDeclStatementContext* context){
    ExpressionNode expressionNode = (ExpressionNode) visit(context->expression);
    return new VariableDeclStatementNode(context->typeName->getText(), context->varName->getText(), expressionNode);
}

antlrcpp::Any BuildAstVisitor::visitNumberExpr(antlrcpptest::SentinelParser::NumberExprContext* context) {
    return new NumberNode(stod(context->value->getText()));
}