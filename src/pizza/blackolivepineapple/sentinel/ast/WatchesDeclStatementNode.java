package pizza.blackolivepineapple.sentinel.ast;

public class WatchesDeclStatementNode extends StatementNode {
    String watcherName, watchable;
    public WatchesDeclStatementNode(String watcherName, String watchable) {
        this.watcherName = watcherName;
        this.watchable = watchable;
    }
}
