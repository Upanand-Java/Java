package strlite;

public class NodeDriverClass {
    public static void main(String[] args) {
        NodeImpl node = new NodeImpl();
        node.createSingleLinkedList(5);
        node.createSingleLinkedList(4);
        node.createSingleLinkedList(3);
        node.createSingleLinkedList(1);
        node.createSingleLinkedList(9);
        node.createSingleLinkedList(7);
        node.createSingleLinkedList(10);
        node.createSingleLinkedList(13);
        node.display();
        node.deleteAlternateNode();
        System.out.println("After delete !!");
        node.display();
    }
}
