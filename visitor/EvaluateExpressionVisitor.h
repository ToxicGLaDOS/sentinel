#pragma once
#include "AstVisitor.h"
#include "NumberNode.h"

class EvaluateExpressionVisitor : public AstVisitor<double> {
    public:
        //double visit(AdditionNode node) {
        //        return visit(node.left) + visit(node.right);
        //}

        //double visit(SubtractionNode node) {
        //        return visit(node.left) - visit(node.right);
        //}

        //double visit(MultiplicationNode node) {
        //        return visit(node.left) * visit(node.right);
        //}

        //double visit(DivisionNode node) {
        //        return visit(node.left) / visit(node.right);
        //}

        //double visit(NegateNode node) {
        //        return -visit(node.innerNode);
        //}

        //double visit(FunctionNode node) {
        //    try {
        //        var arg = visit(node.argument);
        //        return (Double)node.function.invoke(Math.class, arg);
        //    }
        //    catch (IllegalAccessException e){ throw new UnsupportedOperationException();}
        //    catch (InvocationTargetException e) {throw new UnsupportedOperationException();}
        //}

        double visit(NumberNode node);
};