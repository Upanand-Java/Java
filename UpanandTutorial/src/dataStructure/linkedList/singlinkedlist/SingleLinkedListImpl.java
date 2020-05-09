package dataStructure.linkedList.singlinkedlist;

public class SingleLinkedListImpl {
    int size;
    Node head = null;
    Node tail = null;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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

    /**
     * if there is empty list we have to assign both head and tail a as a node

     * @param value
     */
    public  void createSLL(int value){
        head = new Node();
        Node node = new Node();
        node.setValue(value);
        node.setNext(null);
        head = node;
        tail = node;
        size = size+1;
        //System.out.println(head.getValue());
        //return head;
    }

    public void insert(int value , int location){
        Node node = new Node();
        node.setValue(value);
        if(head == null){ //list is there
            System.out.println("please create the the list first !!");
        }else if(location == 0 ){
            node.setNext(head);
            head = node;

        }else if(location >= getSize()){ // insert at last position
            node.setNext(null);
            tail.setNext(node);
            tail = node; // to keep the track
        }else{
            Node tempNode = head;
            int index = 0;
            while(index<= location-1){
                tempNode = tempNode.getNext();
                index++;
            }
            Node nextNode = tempNode.getNext(); //here we take next node detail in temp
            tempNode.setNext(node); // here we replace the tempnode with the value
            node.setNext(nextNode); // here set the previous node to new node
        }
        setSize(getSize()+1);

    }

    public void traverseFromLastWithKindex(int k){
        Node tempNode = head;
        int indexFromhead = getSize()-k;
        System.out.println("indexFromHead "+indexFromhead);
        int index = 1;
        while(index <= indexFromhead){
            System.out.println("Inside loop");
            tempNode = tempNode.getNext();
            index++;
        }
        System.out.println(tempNode.getValue());


    }

  /*  public void reverse(){
        Node node = tail;
        int index = getSize();
        while (index)
    }*/

    public void display(){
        Node node = head;
        for(int i=0;i<size ; i++){
            System.out.println(node.getValue());
            node = node.getNext();

        }
    }
    public void middleNumberInList(){
        Node node = head;
        int middle = getSize()/2;
        int index = 0;
        while (index < middle-1){
            node = node.getNext();
            index++;
        }
        System.out.println("middle num is "+node.getValue());
    }

    void printNthFromLast(int position){

    }
}
