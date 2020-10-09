#include "VariableDeclStatementNode.h"

VariableDeclStatementNode::VariableDeclStatementNode(std::string typeName, std::string varName, ExpressionNode expressionNode) {
    this->typeName = typeName;
    this->varName = varName;
    this->expressionNode = expressionNode;
}