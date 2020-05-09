package dataStructure.linkedList.singlinkedlist;

public class SameSingleLinkedListImpl {
    Node head = null;
    Node tail = null;
    int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createSinglell(int value){
        head = new Node();
        Node node = new Node();
        node.setValue(value);
        node.setNext(null);
        head = node;
        tail = node;
        size = getSize()+1;
    }
    public void display(){
        Node node = head;
        for(int i = 0;i<size ; i++){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public void insert(int value , int location){
        Node node = new Node();
        node.setValue(value);
        if(head == null){
            //throw error;
        } else if(location == 0){
            node.setNext(head);
            head = node;
        }else if( location>= size){
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index <=location-1){
              tempNode = tempNode.getNext();
              index++;
            }
            Node nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);
        }
    }


}
