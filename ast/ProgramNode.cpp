#include <ProgramNode.h>

ProgramNode::ProgramNode(std::vector<StatementNode*> statements){
    this->statementNodes = statements;
}