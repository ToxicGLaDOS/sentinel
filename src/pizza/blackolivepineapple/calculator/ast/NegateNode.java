package pizza.blackolivepineapple.calculator.ast;

public class NegateNode extends ExpressionNode {
        public ExpressionNode innerNode;

        public NegateNode(ExpressionNode innerNode) {
                this.innerNode = innerNode;
        }
}
