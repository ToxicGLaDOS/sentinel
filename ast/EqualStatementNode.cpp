#include <EqualStatementNode.h>

EqualStatementNode::EqualStatementNode(std::string varName, ExpressionNode* expressionNode){
    this->varName = varName;
    this->expressionNode = expressionNode;
}