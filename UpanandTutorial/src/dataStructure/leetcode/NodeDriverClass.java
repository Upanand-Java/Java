package dataStructure.leetcode;

public class NodeDriverClass {
    public static void main(String[] args) {
        NodeImplementation nodeImplementation = new NodeImplementation();
        nodeImplementation.CreateList(2);
        //nodeImplementation.CreateList(2);
        nodeImplementation.insertAtTail(7);
        nodeImplementation.insertAtTail(9);
        nodeImplementation.insertAtTail(11);
       // nodeImplementation.insertAtTail(7);
        nodeImplementation.insertAtTail(13);
       // nodeImplementation.insertAtTail(5);
      // Node n1 = nodeImplementation.insertAtTail(7);
       //// System.out.println("our list is ");
       // nodeImplementation.display(n1);
        //Node n2 = nodeImplementation.findMiddleNode();
       //Node n2 =  nodeImplementation.deleteDuplicate();
        //System.out.println("removed dup");
        //Node n2 = nodeImplementation.sortList();
        //Node n2 = nodeImplementation.OddEven();
        //Node n2 = nodeImplementation.deleteAtIndex(3);
       // Node n2 = nodeImplementation.deleteFromLast(-0);
        //Node n2 = nodeImplementation.insertAtMiddle(9);
        //Node n2 = nodeImplementation.removeGivenValue(20);
        //Node n2 = nodeImplementation.del(20);
        Node firstHead = nodeImplementation.getHead();
        System.out.println("First head is ");
        System.out.println();
        nodeImplementation.display(firstHead);

        NodeImplementation nodeImplementation1 = new NodeImplementation();
        nodeImplementation1.CreateList(3);
        nodeImplementation1.insertAtTail(7);
        nodeImplementation1.insertAtTail(8);
        Node secondhead = nodeImplementation1.getHead();
        System.out.println("Second head is ");
        System.out.println();
        nodeImplementation1.display(secondhead);

        Node n2 = nodeImplementation.mergeTwoLists(firstHead ,secondhead);
        System.out.println();
        System.out.println("new list is");
       nodeImplementation.display(n2);

        //nodeImplementation.display(n2);




    }
}
