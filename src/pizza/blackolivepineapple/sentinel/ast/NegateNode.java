package pizza.blackolivepineapple.sentinel.ast;

public class NegateNode extends ExpressionNode {
        public ExpressionNode innerNode;

        public NegateNode(ExpressionNode innerNode) {
                this.innerNode = innerNode;
        }
}
