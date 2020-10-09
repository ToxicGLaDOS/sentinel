#pragma once
#include <AstNode.h>
#include <StatementNode.h>
#include <vector>

class ProgramNode : public AstNode {
    std::vector<StatementNode*> statementNodes;
    public:
        ProgramNode(std::vector<StatementNode*> statements);

};
