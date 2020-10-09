#include "StatementNode.h"
#include "ExpressionNode.h"
#include <string>

class VariableDeclStatementNode : public StatementNode{
    std::string typeName, varName;
    ExpressionNode expressionNode;
    public:
        VariableDeclStatementNode(std::string typeName, std::string varName, ExpressionNode expressionNode);
};
