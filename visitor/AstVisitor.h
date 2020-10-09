#include <NumberNode.h>
#include <AstNode.h>

template <class T>
class AstVisitor {
    // public T visit(AdditionNode node);
    // public T visit(SubtractionNode node);
    // public T visit(MultiplicationNode node);
    // public T visit(DivisionNode node);
    // public T visit(NegateNode node);
    // public T visit(FunctionNode node);
    public:
        virtual T visit(NumberNode node);
        T visit(AstNode node);
};