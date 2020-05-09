package dataStructure.linkedList.singlinkedlist;

import dataStructure.linkedList.sllPractice.SllImplementation;

class DriverClass {
    public static void main(String[] args) {
        SllImplementation singleLinkedList = new SllImplementation();
        //singleLinkedList.createSLL(2);
        singleLinkedList.createSingleList(2);
        singleLinkedList.insert(4,1);
        singleLinkedList.insert(3,2);
        singleLinkedList.insert(33,1);
        singleLinkedList.insert(3,4);
        singleLinkedList.insert(33,12);
        singleLinkedList.insert(13,0);
        singleLinkedList.insert(77,3);
        singleLinkedList.printNthFromLast(3);
      boolean x =  singleLinkedList.loop();
      if(x){
          System.out.println("loop is there ");
      }else{
          System.out.println("loop is not!!");
      }
      singleLinkedList.shortList();
        singleLinkedList.middleNode();
       // singleLinkedList.insert(22,9);
        /*singleLinkedList.insert(22,9);
        singleLinkedList.insert(29,9);
        singleLinkedList.insert(26,9);
        singleLinkedList.insert(20,9);
        singleLinkedList.insert(21,9);
        singleLinkedList.insert(22,9);
        singleLinkedList.insert(12,9);
        singleLinkedList.insert(22,9);*/
        //System.out.println(singleLinkedList.getSize());

      //  System.out.println("Before");
        singleLinkedList.display();
      //  System.out.println("after");
       //// singleLinkedList.traverseFromLastWithKindex(2);
       // singleLinkedList.display();
       // singleLinkedList.middleNumberInList();
    }
}
