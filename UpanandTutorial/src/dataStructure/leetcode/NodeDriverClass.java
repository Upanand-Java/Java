package dataStructure.leetcode;

public class NodeDriverClass {
    public static void main(String[] args) {
        NodeImplementation nodeImplementation = new NodeImplementation();
        nodeImplementation.CreateList(2);
        nodeImplementation.insertAtTail(2);
        nodeImplementation.insertAtTail(3);
       // nodeImplementation.insertAtTail(7);
        nodeImplementation.insertAtTail(4);
        nodeImplementation.insertAtTail(5);
       Node n1 = nodeImplementation.insertAtTail(5);
        System.out.println("our list is ");
        nodeImplementation.display(n1);
        //Node n2 = nodeImplementation.findMiddleNode();
       //Node n2 =  nodeImplementation.deleteDuplicate();
        //System.out.println("removed dup");
        //Node n2 = nodeImplementation.sortList();
        //Node n2 = nodeImplementation.OddEven();
        //Node n2 = nodeImplementation.deleteAtIndex(3);
       // Node n2 = nodeImplementation.deleteFromLast(-0);
        //Node n2 = nodeImplementation.insertAtMiddle(9);
        Node n2 = nodeImplementation.delDup();
        System.out.println();
        System.out.println("ok");
        nodeImplementation.display(n2);




    }
}
