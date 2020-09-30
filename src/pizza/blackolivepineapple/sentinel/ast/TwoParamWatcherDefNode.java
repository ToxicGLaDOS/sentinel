package pizza.blackolivepineapple.sentinel.ast;

import java.util.List;

public class TwoParamWatcherDefNode extends WatcherDefNode {
    String type, varName0, varName1;

    public TwoParamWatcherDefNode(String watcherName, String type, String varName0, String varName1, List<StatementNode> statements) {
        super(watcherName, statements);
        this.type = type;
        this.varName0 = varName0;
        this.varName1 = varName1;
        System.out.println("Created two param watcher");
    }

}
