package pizza.blackolivepineapple.sentinel.ast;

public class VariableDeclStatementNode extends StatementNode{
    String typeName, varName;
    ExpressionNode expressionNode;
    public VariableDeclStatementNode(String typeName, String varName, ExpressionNode expressionNode){
        this.typeName = typeName;
        this.varName = varName;
        this.expressionNode = expressionNode;
    }
}
