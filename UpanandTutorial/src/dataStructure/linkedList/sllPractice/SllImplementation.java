package dataStructure.linkedList.sllPractice;

import dataStructure.linkedList.singlinkedlist.Node;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class SllImplementation {
    SingleNode head;
    SingleNode tail;
    int size;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createSingleList(int value){
        head = new SingleNode();
        SingleNode singleNode = new SingleNode();
        singleNode.setData(value);
        head = singleNode;
        tail = singleNode;
        tail.setNext(null);
        setSize(getSize()+1);
    }

    public void display(){
        if(getSize()>0) {
            SingleNode singleNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(singleNode.getData());
                singleNode = singleNode.getNext();
            }
        }
    }

    public void insert(int value , int location) {
        SingleNode node = new SingleNode();
        node.setData(value);
        if (head == null) {
            System.out.println("throw a error !!");
        } else if (location == 0) { // insert at 0th or head position position
            node.setNext(head);
            head = node;
        } else if (location >= getSize()) { //insert at last position !!
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else { // insert at random location in linked list
            SingleNode tempNode = head;
            int index = 0;
            while (index <= location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            SingleNode nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);

        }
        setSize(getSize() + 1);
    }

      public  void printNthFromLast ( int position){
            SingleNode node1 = head;
            int length = 0;
            SingleNode singleNode;
            while (node1 != null) {
                node1 = node1.Next;
                length++;
            }
            System.out.println("length is " + length);
            node1 = head;
            for(int i =1 ; i<length-position+1;i++){
                node1 = node1.getNext();
            }
          System.out.println("Nth position from last is "+ node1.getData());
        }

    public void middleNode(){
        SingleNode tempNode = head;
        int lenghth  = 0;
        while (tempNode != null){
            tempNode = tempNode.getNext();
            lenghth++;
        }
        int mid = lenghth/2;
        tempNode = head;

        for(int i = 1;i<mid;i++){
            tempNode = tempNode.getNext();

        }
        System.out.println("Middle node is "+tempNode.getData());

    }
    public boolean loop(){
        SingleNode singleNode = head;
        HashSet<SingleNode> singleNodes = new HashSet<>();
        while(singleNode != null){

            if (singleNodes.contains(singleNode)){
                return true;
            }
            singleNodes.add(singleNode);

            singleNode = singleNode.getNext();

        }
        return false;
    }
    public void reverse(){
        SingleNode headNode = head;
        SingleNode tailNode = tail;
        System.out.println("Reverse Linked List!!");
        for(int i=1;i<=getSize();i++){
            System.out.println();
        }
    }
    public void shortList(){
        LinkedList<Integer> linkedList = new LinkedList();
       // linkedList.add(head.getData());
        for(int i=0;i<=getSize()-1;i++){
            linkedList.add(head.getData());
            head = head.getNext();

        }
        System.out.println("Sorting of linked lis is :");
        Collections.sort(linkedList);
        for(int i:linkedList){
            System.out.println(i);
        }
        System.out.println("Reversing of list is");
        Collections.reverse(linkedList);
        System.out.println(linkedList);

    }

}
