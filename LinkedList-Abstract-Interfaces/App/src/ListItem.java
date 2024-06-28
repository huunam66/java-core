public abstract class ListItem {

    private Object value;
    private ListItem nodeNext;

    public ListItem(Object value) {
        this(value, null);
    }

    public ListItem(Object value, ListItem nodeNext) {
        this.value = value;
        this.nodeNext = nodeNext;
    }

    public abstract ListItem getNode();

    public abstract ListItem nodeNext();

    public abstract boolean CompareNode(Object value);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public ListItem getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(ListItem nodeNext) {
        this.nodeNext = nodeNext;
    }

    @Override
    public String toString() {
        return "ListItem{" + "value=" + value + ", nodeNext=" + nodeNext + '}';
    }
}
