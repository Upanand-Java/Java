package dataStructure.linkedList.sllPractice;

public class SingleNode {
    int data;
    SingleNode Next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleNode getNext() {
        return Next;
    }

    public void setNext(SingleNode next) {
        Next = next;
    }

    @Override
    public String toString() {
        return data +" ";
    }
}
