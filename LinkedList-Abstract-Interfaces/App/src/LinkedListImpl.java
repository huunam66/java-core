public abstract class LinkedListImpl implements LinkedList {

    private ListItem nodeHead;
    private ListItem nodeTail;

    public LinkedListImpl(ListItem nodeHead, ListItem nodeTail) {
        this.nodeHead = nodeHead;
        this.nodeTail = nodeTail;
    }

    @Override
    public abstract ListItem createNode(Object value);

    @Override
    public abstract void printList();

    @Override
    public abstract ListItem addHead(ListItem node);

    @Override
    public abstract ListItem addTail(ListItem node);

    @Override
    public abstract ListItem addAfterNode(Object value, ListItem node);

    @Override
    public abstract ListItem addBeforeNode(Object value, ListItem node);

    @Override
    public abstract ListItem searchNode(Object value);

    @Override
    public abstract ListItem updateNode(Object oldValue, Object newValue);

    @Override
    public abstract boolean removeNode(Object value);

    @Override
    public abstract boolean removeNodeHead();

    @Override
    public abstract boolean removeNodeTail();

    @Override
    public abstract boolean removeAfterNode(Object value);

    @Override
    public abstract boolean removeBeforeNode(Object value);


    public ListItem getNodeHead() {
        return nodeHead;
    }

    public void setNodeHead(ListItem nodeHead) {
        this.nodeHead = nodeHead;
    }

    public ListItem getNodeTail() {
        return nodeTail;
    }

    public void setNodeTail(ListItem nodeTail) {
        this.nodeTail = nodeTail;
    }
}
