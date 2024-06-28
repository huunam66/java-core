public interface LinkedList {

    ListItem createNode(Object value);

    void printList();

    ListItem addHead(ListItem node);

    ListItem addTail(ListItem node);

    ListItem addAfterNode(Object value, ListItem node);

    ListItem addBeforeNode(Object value, ListItem node);

    ListItem searchNode(Object value);

    ListItem updateNode(Object oldValue, Object newValue);

    boolean removeNode(Object value);

    boolean removeNodeHead();

    boolean removeNodeTail();

    boolean removeAfterNode(Object value);

    boolean removeBeforeNode(Object value);

}
