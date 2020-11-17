package strlite;

public class NodeImpl {
    Node head ;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void createSingleLinkedList(int val){
        Node node = new Node(val , null);
        //Node temp = new Node(0,null);
        if(head == null) {
           head = node;
        }else{
            Node temp = head;
            Node prev = new Node(0,null);
            prev.next = head;
            Node prev1 = prev;

           while(temp != null) {
               //head = head.next;
                temp= temp.next;
                prev1 =prev1.next;
           }
           prev1.next = node;
           head = prev.next;




        }

    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");

            temp = temp.next;
        }

    }

    public void deleteAlternateNode(){
        Node prev = new Node(0, null);
        //1-3-4-5-6-7-8
        //0-1-3-4-5-6-7-8

        prev.next = head;
        Node prev1 = prev;
        Node temp = head;
        int counter = 0;
        while ( temp != null){
            counter++;
            if(counter%2 == 0){
                prev1.next = prev1.next.next;
                temp = temp.next;

            }else{
                temp = temp.next;
                prev1 = prev1.next;
            }
        }
        head = prev.next;
    }
}
