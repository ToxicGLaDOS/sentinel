#include <iostream>
#include <ExpressionNode.h>
#include <StatementNode.h>

class EqualStatementNode : public StatementNode {
    std::string varName;
    ExpressionNode* expressionNode;

    public:
        EqualStatementNode(std::string varName, ExpressionNode* expressionNode);
};
