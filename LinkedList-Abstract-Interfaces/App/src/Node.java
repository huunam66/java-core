public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    public Node(Object value, ListItem nodeNext) {
        super(value, nodeNext);
    }

    @Override
    public ListItem getNode() {
        return this;
    }

    @Override
    public ListItem nodeNext() {
        return super.getNodeNext();
    }

    @Override
    public boolean CompareNode(Object value) {
        if (value == null) return false;

        return value.toString().equalsIgnoreCase(super.getValue().toString());
    }

}
