package pizza.blackolivepineapple.sentinel.ast;

public class EqualStatementNode extends StatementNode {
    String varName;
    ExpressionNode expressionNode;

    public EqualStatementNode(String varName, ExpressionNode expressionNode) {
        this.varName = varName;
        this.expressionNode = expressionNode;
    }
}
