package pizza.blackolivepineapple.sentinel.ast;

import java.util.List;

public class WatcherDefNode extends StatementNode {
    String watcherName;
    List<StatementNode> statements;
    public WatcherDefNode(String watcherName, List<StatementNode> statements) {
        this.watcherName = watcherName;
        this.statements = statements;
    }
}
