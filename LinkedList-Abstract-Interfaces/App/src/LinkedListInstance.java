public class LinkedListInstance extends LinkedListImpl {


    private static int sizeList = 0;

    public LinkedListInstance() {
        this(null, null);
    }

    public LinkedListInstance(ListItem nodeHead, ListItem nodeTail) {
        super(nodeHead, nodeTail);
    }

    @Override
    public ListItem createNode(Object value) {
        return new Node(value);
    }

    @Override
    public void printList() {
        System.out.println();
        System.out.printf("\nSize: %d", LinkedListInstance.sizeList);
        System.out.println();
        for (ListItem node = super.getNodeHead(); node != null; node = node.nodeNext()) {
            System.out.printf(" %s", (String) node.getValue());
        }
        System.out.println();
    }

    public ListItem addHeadIsNull(ListItem node) {
        super.setNodeHead(node);
        super.setNodeTail(node);
        LinkedListInstance.sizeList++;
        return super.getNodeHead();
    }

    public ListItem addTailIsNull(ListItem node) {
        super.setNodeHead(node);
        super.setNodeTail(node);
        LinkedListInstance.sizeList++;
        return super.getNodeTail();
    }

    @Override
    public ListItem addHead(ListItem node) {
        if (node == null) return null;

        ListItem nodeHead = super.getNodeHead();
        if (nodeHead == null) {
            return addHeadIsNull(node);
        }

        ListItem resultSearch = searchNode(node.getValue());
        if (resultSearch != null) {
            System.out.print("\nValue of node have exited in List !");
            return null;
        }

        node.setNodeNext(super.getNodeHead());
        super.setNodeHead(node);
        LinkedListInstance.sizeList++;
        return node.getNode();
    }

    @Override
    public ListItem addTail(ListItem node) {
        if (node == null) return null;

        ListItem nodeTail = super.getNodeTail();
        if (nodeTail == null) {
            return addTailIsNull(node);
        }

        ListItem resultSearch = searchNode(node.getValue());
        if (resultSearch != null) {
            System.out.print("\nValue of node have exited in List !");
            return null;
        }

        node.setNodeNext(null);
        nodeTail.setNodeNext(node);
        super.setNodeTail(node);
        LinkedListInstance.sizeList++;
        return node.getNode();
    }

    @Override
    public ListItem addAfterNode(Object value, ListItem node) {
        if (node == null) return null;

        ListItem resultSearch = searchNode(node.getValue());
        if (resultSearch != null) {
            System.out.print("\nValue of node have exited in List !");
            return null;
        }

        ListItem nodeTail = super.getNodeTail();
        if (nodeTail.CompareNode(value)) return addTail(node);

        resultSearch = searchNode(value);
        if (resultSearch == null) return null;

        node.setNodeNext(resultSearch.nodeNext());
        resultSearch.setNodeNext(node);
        LinkedListInstance.sizeList++;
        return node.getNode();
    }

    @Override
    public ListItem addBeforeNode(Object value, ListItem node) {
        if (node == null) return null;

        ListItem nodeHead = super.getNodeHead();
        if (nodeHead == null) return null;

        ListItem resultSearch = searchNode(node.getValue());
        if (resultSearch != null) {
            System.out.print("\nValue of node have exited in List !");
            return null;
        }

        if (nodeHead.CompareNode(value)) return addHead(node);

        ListItem nodeCurrent = nodeHead;
        while (nodeCurrent.nodeNext() != null) {
            if (nodeCurrent.nodeNext().CompareNode(value)) {
                node.setNodeNext(nodeCurrent.nodeNext());
                nodeCurrent.setNodeNext(node);
                LinkedListInstance.sizeList++;
                return node.getNode();
            }
            nodeCurrent = nodeCurrent.nodeNext();
        }

        return null;
    }

    @Override
    public ListItem searchNode(Object value) {
        if (value == null) return null;

        ListItem nodeHead = super.getNodeHead();
        if (nodeHead == null) return null;

        ListItem nodeTail = super.getNodeTail();
        if (nodeHead.CompareNode(value)) return nodeHead;
        else if (nodeTail != null && nodeTail.CompareNode(value)) return nodeTail;
        else {
            ListItem node = nodeHead.nodeNext();
            while (node != null) {
                if (node.CompareNode(value)) return node.getNode();

                node = node.nodeNext();
            }
        }

        return null;
    }

    @Override
    public ListItem updateNode(Object oldValue, Object newValue) {
        ListItem resultSearch = searchNode(oldValue);

        if (resultSearch == null) return null;

        resultSearch.setValue(newValue);
        return resultSearch.getNode();
    }

    @Override
    public boolean removeNode(Object value) {

        ListItem nodeHead = super.getNodeHead();

        if (nodeHead == null || value == null) return false;

        if (nodeHead.CompareNode(value)) return removeNodeHead();

        ListItem nodeTail = super.getNodeTail();
        if (nodeTail.CompareNode(value)) return removeNodeTail();

        ListItem nodeCurrent = nodeHead;
        while (nodeCurrent.nodeNext() != null) {
            if (nodeCurrent.nodeNext().CompareNode(value)) {
                ListItem nodeNext = nodeCurrent.nodeNext();
                nodeCurrent.setNodeNext(nodeNext.nodeNext());
                LinkedListInstance.sizeList--;
                return true;
            }

            nodeCurrent = nodeCurrent.nodeNext();
        }

        return false;
    }

    @Override
    public boolean removeNodeHead() {
        ListItem nodeHead = super.getNodeHead();
        ListItem nodeTail = super.getNodeTail();
        if (nodeHead == null) return false;

        if (nodeHead == nodeTail) {
            super.setNodeTail(nodeTail.nodeNext());
            super.setNodeHead(super.getNodeTail());
            LinkedListInstance.sizeList--;
            return true;
        }

        super.setNodeHead(nodeHead.nodeNext());
        LinkedListInstance.sizeList--;
        return true;
    }

    @Override
    public boolean removeNodeTail() {
        ListItem nodeHead = super.getNodeHead();
        ListItem nodeTail = super.getNodeTail();
        if (nodeTail == null) return false;

        if (nodeHead == nodeTail) {
            super.setNodeTail(nodeTail.nodeNext());
            super.setNodeHead(super.getNodeTail());
            LinkedListInstance.sizeList--;
            return true;
        }

        ListItem nodeCurrent = nodeHead;
        while (nodeCurrent.nodeNext() != nodeTail) {
            nodeCurrent = nodeCurrent.nodeNext();
        }

        nodeCurrent.setNodeNext(null);
        super.setNodeTail(nodeCurrent);
        LinkedListInstance.sizeList--;

        return true;
    }

    @Override
    public boolean removeAfterNode(Object value) {

        ListItem nodeHead = super.getNodeHead();
        if (nodeHead == null || value == null) return false;

        if (nodeHead.CompareNode(value)) {
            ListItem nodeHeadNext = nodeHead.nodeNext();
            nodeHead.setNodeNext(nodeHeadNext.nodeNext());
            LinkedListInstance.sizeList--;
            return true;
        }

        ListItem nodeTail = super.getNodeTail();
        if (nodeTail.CompareNode(value)) return false;

        ListItem nodeCurrent = nodeHead.nodeNext();
        while (nodeCurrent != null) {
            if (nodeCurrent.CompareNode(value) && nodeCurrent.nodeNext() != null) {
                if (nodeCurrent.nodeNext() == nodeTail) return removeNodeTail();

                ListItem nodeNext = nodeCurrent.nodeNext();
                nodeCurrent.setNodeNext(nodeNext.nodeNext());
                LinkedListInstance.sizeList--;
                return true;
            }

            nodeCurrent = nodeCurrent.nodeNext();
        }

        return false;
    }

    @Override
    public boolean removeBeforeNode(Object value) {

        ListItem nodeHead = super.getNodeHead();
        if (nodeHead == null || value == null) return false;

        ListItem nodeCurrent = nodeHead;
        while (nodeCurrent.nodeNext() != null) {
            if (nodeCurrent.nodeNext().CompareNode(value)) return removeNodeHead();

            ListItem nodeNextNext = nodeCurrent.nodeNext();
            if (nodeNextNext != null && nodeNextNext.CompareNode(value)) {
                nodeCurrent.setNodeNext(nodeNextNext);
                LinkedListInstance.sizeList--;
                return true;
            }

            nodeCurrent = nodeCurrent.nodeNext();
        }

        return false;
    }
}
