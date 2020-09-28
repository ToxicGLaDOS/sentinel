package pizza.blackolivepineapple.calculator.visitor;

import pizza.blackolivepineapple.calculator.ast.*;

import java.lang.reflect.InvocationTargetException;

public class EvaluateExpressionVisitor extends AstVisitor<Double> {
    public Double visit(AdditionNode node) {
            return visit(node.left) + visit(node.right);
    }

    public Double visit(SubtractionNode node) {
            return visit(node.left) - visit(node.right);
    }

    public Double visit(MultiplicationNode node) {
            return visit(node.left) * visit(node.right);
    }

    public Double visit(DivisionNode node) {
            return visit(node.left) / visit(node.right);
    }

    public Double visit(NegateNode node) {
            return -visit(node.innerNode);
    }

    public Double visit(FunctionNode node) {
        try {
            var arg = visit(node.argument);
            return (Double)node.function.invoke(Math.class, arg);
        }
        catch (IllegalAccessException e){ throw new UnsupportedOperationException();}
        catch (InvocationTargetException e) {throw new UnsupportedOperationException();}
    }

    public Double visit(NumberNode node) {
            return node.value;
    }
}