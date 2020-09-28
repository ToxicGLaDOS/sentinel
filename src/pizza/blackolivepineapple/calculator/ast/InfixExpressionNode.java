package pizza.blackolivepineapple.calculator.ast;

public abstract class InfixExpressionNode extends ExpressionNode {
        public ExpressionNode left;
        public ExpressionNode right;

        public InfixExpressionNode(ExpressionNode left, ExpressionNode right) {
                this.left = left;
                this.right = right;
        }
}
