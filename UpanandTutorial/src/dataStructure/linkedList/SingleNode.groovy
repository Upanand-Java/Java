package dataStructure.linkedList

class SingleNode {
    private int value;
    private SingleNode next;

    public SingleNode(int value){

     this.value = value;
        this.next = null
    }
    public SingleNode(){

    }



   @Override
    String toString() {
        return value + " "
    }

    int getValue() {
        return value
    }

    void setValue(int value) {
        this.value = value
    }

    SingleNode getNext() {
        return next
    }

    void setNext(SingleNode next) {
        this.next = next
    }
}
