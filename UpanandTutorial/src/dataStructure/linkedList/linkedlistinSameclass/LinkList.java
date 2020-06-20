package dataStructure.linkedList.linkedlistinSameclass;

 class LinkedListC {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    private static  Node display(Node n){
        while (n != null){
            System.out.print(n.data+" ,");
           n = n.next;
        }
        return n;

    }

    public static Node reverse(Node n){
        Node prev = null;
        Node current = n;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev =current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
       LinkedListC list = new LinkedListC();
       list.head = new Node(3);
       list.head.next = new Node(4);
       list.head.next.next = new Node(5);
       list.head.next.next.next = new Node(4);
       list.head.next.next.next.next = new Node(4);
       list.head.next.next.next.next.next = new Node(4);

       list.display(head);

       Node x = list.reverse(head);
        System.out.println("Reversing is :");

       list.display(x);



    }
}
