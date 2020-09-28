package pizza.blackolivepineapple.calculator.visitor;

import antlr.MathLexer;
import antlr.MathParser;
import antlr.MathBaseVisitor;
import pizza.blackolivepineapple.calculator.ast.*;

import java.lang.Double;
import java.lang.reflect.Method;

public class BuildAstVisitor extends MathBaseVisitor<ExpressionNode> {
        public ExpressionNode visitCompileUnit(MathParser.CompileUnitContext context) {
                return visit(context.expr());
        }

        public ExpressionNode visitNumberExpr(MathParser.NumberExprContext context) {
                return new NumberNode(Double.parseDouble(context.value.getText()));
        }

        public ExpressionNode visitParensExpr(MathParser.ParensExprContext context) {
                return visit(context.expr());
        }

        public ExpressionNode visitInfixExpr(MathParser.InfixExprContext context){
                InfixExpressionNode node;

                switch (context.op.getType()) {
                case MathLexer.OP_ADD:
                    node = new AdditionNode(visit(context.left), visit(context.right));
                    break;

                case MathLexer.OP_SUB:
                    node = new SubtractionNode(visit(context.left), visit(context.right));
                    break;

                case MathLexer.OP_MUL:
                    node = new MultiplicationNode(visit(context.left), visit(context.right));
                    break;

                case MathLexer.OP_DIV:
                    node = new DivisionNode(visit(context.left), visit(context.right));
                    break;

                default:
                    throw new UnsupportedOperationException();
                }

                return node;
        }

        public ExpressionNode visitUnaryExpr(MathParser.UnaryExprContext context) {
                switch (context.op.getType()) {
                case MathLexer.OP_ADD:
                        return visit(context.expr());

                case MathLexer.OP_SUB:
                        return new NegateNode(visit(context.expr()));

                default:
                        throw new UnsupportedOperationException();
                }
        }

        public ExpressionNode visitFuncExpr(MathParser.FuncExprContext context) {
                var functionName = context.func.getText();
                Class[] cArg = new Class[1];
                cArg[0] = double.class;
                try {
                        Method method = Math.class.getMethod(functionName, cArg);
                        return new FunctionNode(method, visit(context.expr()));
                }
                catch (NoSuchMethodException e) {
                        System.out.println("Function is not supported");
                        throw new UnsupportedOperationException();
                }
        }
}