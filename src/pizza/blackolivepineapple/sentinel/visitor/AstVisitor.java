package pizza.blackolivepineapple.sentinel.visitor;

import pizza.blackolivepineapple.sentinel.ast.*;

abstract class AstVisitor<T> {
    public abstract T visit(AdditionNode node);
    public abstract T visit(SubtractionNode node);
    public abstract T visit(MultiplicationNode node);
    public abstract T visit(DivisionNode node);
    public abstract T visit(NegateNode node);
    public abstract T visit(FunctionNode node);
    public abstract T visit(NumberNode node);

    public T visit(AstNode node) {
        if (node instanceof AdditionNode){
            return visit((AdditionNode)node);
        }
        else if (node instanceof SubtractionNode){
            return visit((SubtractionNode)node);
        }
        else if (node instanceof MultiplicationNode){
            return visit((MultiplicationNode)node);
        }
        else if (node instanceof DivisionNode){
            return visit((DivisionNode)node);
        }
        else if (node instanceof NegateNode){
            return visit((NegateNode)node);
        }
        else if (node instanceof FunctionNode){
            return visit((FunctionNode)node);
        }
        else if (node instanceof NumberNode){
            return visit((NumberNode)node);
        }
        else{
            throw new UnsupportedOperationException();
        }
    }
}