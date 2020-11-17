package dish;

public class NodeImpl {
    Node head;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeImpl node = (NodeImpl) o;

        return head != null ? head.equals(node.head) : node.head == null;
    }

    @Override
    public int hashCode() {
        return head != null ? head.hashCode() : 0;
    }

    public Node createSingleLinkedList(int value){
        Node node = new Node(value , null);

        if(head == null){
           head = node;
        }else{
            System.out.println("in");
            Node tempHead = head;
            Node prev = new Node(0 ,null);
            prev.next = head;
            Node temp = prev;


            while (tempHead != null){

                tempHead = tempHead.next;
                temp = temp.next;
            }

            temp.next = node;
            head = prev.next;


        }
        return head;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
