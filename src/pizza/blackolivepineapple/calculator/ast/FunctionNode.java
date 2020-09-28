package pizza.blackolivepineapple.calculator.ast;

import java.lang.reflect.Method;

public class FunctionNode extends ExpressionNode {
        public Method function;
        public ExpressionNode argument;

        public FunctionNode(Method function, ExpressionNode argument) {
                this.function = function;
                this.argument = argument;
        }
}
