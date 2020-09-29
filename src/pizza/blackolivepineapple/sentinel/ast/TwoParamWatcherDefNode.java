package pizza.blackolivepineapple.sentinel.ast;

public class TwoParamWatcherDefNode extends StatementNode {
    String watcherName, type, varName0, varName1;

    public TwoParamWatcherDefNode(String watcherName, String type, String varName0, String varName1) {
        this.watcherName = watcherName;
        this.type = type;
        this.varName0 = varName0;
        this.varName1 = varName1;
        System.out.println("Created two param watcher");
    }

}
