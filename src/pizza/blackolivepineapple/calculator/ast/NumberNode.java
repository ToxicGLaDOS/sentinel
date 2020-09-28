package pizza.blackolivepineapple.calculator.ast;

public class NumberNode extends ExpressionNode {
        public double value;

        public NumberNode(double value){
                this.value = value;
        }
}
