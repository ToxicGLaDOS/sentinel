package pizza.blackolivepineapple.sentinel.ast;

import java.util.List;

public class ProgramNode extends AstNode {
    List<StatementNode> statementNodes;
    public ProgramNode(List<StatementNode> statements){
        this.statementNodes = statements;
    }
}
