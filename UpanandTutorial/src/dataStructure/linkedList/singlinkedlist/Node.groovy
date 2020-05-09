package dataStructure.linkedList.singlinkedlist

class Node {
    int value;
    Node next ;

    int getValue() {
        return value
    }

    void setValue(int value) {
        this.value = value
    }

    Node getNext() {
        return next
    }

    void setNext(Node next) {
        this.next = next
    }

    @Override
    String toString() {
        return value + " ";
    }
}
