package dish;

public class NodeDriverClass {
    public static void main(String[] args) {
        NodeImpl node = new NodeImpl();
        node.createSingleLinkedList(3);
        node.createSingleLinkedList(6);
        node.display();
    }
}
