package dataStructure.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class NodeImplementation {
    Node head = null;


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node CreateList(int x){
        head =  new Node(x,null);
        return head;
    }

    public void display(Node h1){
        while (h1 != null){
            System.out.print(h1.value+" ");
            h1 = h1.next;
        }
    }

    public Node insertAtTail(int x){
        Node tempNode = null;
        Node n1 = head;
        Node lenNode = head;

        if(head == null){
            return new Node(x,null);
        }else {
            tempNode = new Node(x,null);
            int len = 0;
            while (lenNode != null){
                len++;
                lenNode = lenNode.next;
            }
            //System.out.println(len);
            while (len != 1){
               // System.out.println("Inside While!!");
                n1 = n1.next;
                len--;
            }
            n1.next = tempNode;
            return head;


        }

    }

    public Node deleteDuplicate(){
        Node n1 = head;
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        int len = 1;
        while (n1 != null){
            linkedHashSet.add(n1.value);
            n1 = n1.next;

        }
        System.out.println(linkedHashSet);
        ArrayList<Integer> integers  = new ArrayList<>(linkedHashSet.size());
        integers.addAll(linkedHashSet);
        Node newList = head;
        System.out.println("head val "+head.value);
        Node n2 = null;
        if(linkedHashSet.size()==1){
            newList.next = null;
        }

        for(int i=1;i<integers.size();i++){
            System.out.println("under for");
            n2 = new Node(integers.get(i),null);
            newList.next = n2;
            newList = newList.next;
        }


        return head;
    }

    public Node findMiddleNode(){
        Node n1 = head;
        int len = 0;
        while(n1 != null){

            n1 = n1.next;
            len++;
        }
        //System.out.println(" length"+len);
        Node n2 = head;
        int middle = len/2;
       // System.out.println("Middle is "+middle);
        int count =0;
        //if(len %2 ==0){
            while (count != middle){
                n2 = n2.next;
                count++;
            }
        //}
        /*else{
            while (count != middle){
                n2 = n2.next;
                count++;
            }

        }*/
        return  n2;

    }

   public Node sortList(){
        Node n1 = head;
        ArrayList<Integer> integers = new ArrayList<>();
        int len = 0;
        while (n1 != null){
            integers.add(n1.value);
            n1 = n1.next;
            len++;
        }
       Collections.sort(integers);
        Node n2 = head;
        for (int i =1;i<integers.size();i++){
            Node n3 = new Node(integers.get(i),null);
            n2.next = n3;
            n2 = n2.next;
        }
        return head;
   }

   public Node OddEven(){
        Node n1 = head;
        int count = 0;
        int len = 0;
        while (n1 != null){
            n1 = n1.next;
            len++;
        }
       System.out.println("siz is "+len);
        n1 = head;

       String oddPlace = String.valueOf(head.value);
       String evenPlace = String.valueOf(head.next.value);
       int counter = 0;
       int mid = len/2;
       if(len%2==0) {
           while (n1 != null && counter != mid-1){
               n1 = n1.next.next;
               counter++;
               oddPlace += n1.value;
              // evenPlace += n1.value;

           }
           n1 = head.next;
           counter = 0;
           while (n1 != null && counter != mid-1){
               n1 = n1.next.next;
               counter++;
               //oddPlace += n1.value;
              evenPlace += n1.value;

           }
       }else{
           n1 = head.next;
           while (n1 != null && counter != mid-1){
               n1 = n1.next.next;
               counter++;
               evenPlace += n1.value;
           }
          n1 = head;
           counter = 0;
           while (n1 != null && counter != mid){
               n1 = n1.next.next;
               counter++;
               oddPlace += n1.value;
           }
       }

       System.out.println("value is "+oddPlace);
       System.out.println("Value is "+evenPlace);


       String[] c = (oddPlace +evenPlace).split("");

       System.out.println("val c0 is "+c[0]);
       Node n2 = new Node(Integer.parseInt(c[0]),null);
       System.out.println("val ");
       Node n3 = n2;
       count = 1;
       while (count != c.length){
         Node  n4 = new Node(Integer.parseInt(c[count]),null);
         n3.next = n4;
         n3 = n3.next;
         count++;
       }


       System.out.println("hey");
        return n2;
       // throw IllegalArgumentException("fee");
   }

   public Node deleteAtIndex(int k){
        Node n1 = head;
        int count = 1;
        while (count != k-1){
            n1 = n1.next;
            count++;
        }
       System.out.println("val "+n1.value);
       n1.next = n1.next.next;
       return head;
   }

   public Node del(int d){
        Node n1 = head;
        Node temp = n1;
        while (temp.next.value != d && temp.next != null){
            temp = temp.next;
        }
       System.out.println("temp "+temp.value);
        temp.next = temp.next.next;
        return n1;
   }






   public int getLength(){
        Node n1 = head;
        int len = 0;
        while(n1 != null){
            n1 = n1.next;
            len++;
        }
        return len;
   }

   public Node deleteFromLast(int k){
        int len = getLength();
       System.out.println(len);
        int indexNeedToDel = len+1-k;
       System.out.println("index "+indexNeedToDel);
        if(indexNeedToDel>0 && indexNeedToDel<=len) {
            Node n1 = deleteAtIndex(indexNeedToDel);
            return n1;
        }
        throw new IllegalArgumentException("Input is not valid !!");
   }
   // how to add an element at the middle of list
    //remove all element which matches the given value
    //intersection of two linked list
    //given list is pallindrome

    public Node insertAtMiddle(int value){
        Node n1 = head;
        int mid = getLength()/2;
        System.out.println("Middle is "+mid);
        Node nodetoBeAdded = new Node(value);
        int count = 1;
        while (count != mid){
            n1 = n1.next;
            count++;
        }
        System.out.println("existing middle node "+n1.value);
        Node tempNode = n1.next;
        n1.next = nodetoBeAdded;
        nodetoBeAdded.next = tempNode;

        return head;
    }

    public Node removeGivenValue(int x){
        Node n1 = head;
        int count = 1;
        while (n1 != null){

            if(n1.value == x){
                System.out.println("Value inside if "+n1.value);
                n1.next = n1.next.next;
            }

            n1 = n1.next;

        }
        return head;

    }

    public Node mergeTwoLists(Node l1, Node l2) {
        Node dummyHead = new Node(0,null);
      //  dummyHead.next = null;
        Node newNode = dummyHead;
        while(l1 != null && l2 != null){
            if(l1.value < l2.value){
                newNode.next = new Node(l1.value,null);
                newNode =newNode.next;
                l1 = l1.next;
            }else if(l2.value<l1.value){
                newNode.next = new Node(l2.value,null);
                newNode = newNode.next;
                l2 = l2.next;
            }else {
                newNode.next = new Node(l1.value,null);
                newNode = newNode.next;
                l1 = l1.next;
                newNode.next = new Node(l2.value,null);
                newNode = newNode.next;
                l2 = l2.next;
            }
        }

        while (l1 != null){
            newNode.next = new Node(l1.value,null);
            newNode = newNode.next;
            l1 = l1.next;

        }

        while (l2 != null){
            newNode.next = new Node(l2.value,null);
            newNode = newNode.next;
            l2 = l2.next;

        }



        return dummyHead.next;


    }


    public Node reverseKGroup(Node head, int k) {
        Node begin;
        if (head==null || head.next ==null || k==1)
            return head;
        Node dummyhead = new Node(-1);
        dummyhead.next = head;
        begin = dummyhead;
        int i=0;
        while (head != null){
            i++;
            System.out.println("i is"+i);
            if (i%k == 0){
                System.out.println("head is "+head.value);
                begin = reversek(begin, head.next);
                head = begin.next;

            } else {
                head = head.next;
            }
        }
        return dummyhead.next;

    }

    public Node reversek(Node begin, Node end){
       System.out.println("inside method "+begin.value+" end "+end.value);
        Node curr = begin.next;
        Node next, first;
        Node prev = begin;
        first = curr;
        while (curr!=end){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        begin.next = prev; //for joining the one group to another group of node
        System.out.println("current "+curr.value);
        first.next = curr;
        System.out.println("first "+first.value);
        return first;
    }


    public Node reverseWithK(Node n , int k){
        Node current = n;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (count<k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        //return prev;
        return current;
    }

    public Node merging(Node n1,Node n2){
        Node newNode = new Node(0,null);
        Node new_head = newNode;

        while(n1 !=null){
            new_head.next = new Node(n1.value,null);
            new_head = new_head.next;
            n1 = n1.next;
        }

        while(n2 != null){
            new_head.next = new Node(n2.value,null);
            new_head = new_head.next;
            n2 = n2.next;
        }
        return new_head.next;

    }

    public Node delDupUnsorted(){
        Node n1 = head;
        Node n2 = null;

        while (n1 !=null && n1.next !=null){
            n2 = n1;
            while (n2.next != null) {
                if (n1.value == n2.next.value) {
                    System.out.println(n2.next.value + "duplicate value !!,<-");
                   // dup = n2.next;
                    n2.next = n2.next.next;

                } else {
                    n2 = n2.next;
                }
            }
            n1 = n1.next;

        }
        return head;
    }

    public Node delDup(){
        Node n1 = head;
        while (n1 != null && n1.next != null){
            if (n1.value == n1.next.value){
                n1.next = n1.next.next;
            }else{
                n1 = n1.next;
            }
        }
        return head;
    }

    public Node delAllDup(){
        if(head == null){
            return null;
        }

        Node node = new Node(0,null);
        node.next = head;
        Node tempNode =node;
        Node current = head;

        while(current != null){
            while(current.next != null && current.value == current.next.value){
                current = current.next;
            }
            if(tempNode.next == current){
                tempNode = tempNode.next;
            }else{
                tempNode.next = current.next;
            }
            current = current.next;
        }
        return node.next;
    }


    public Node insertAtMiddleNode( int value){
        Node n1 = head;
        int length = 0;
        Node node =  new Node(value,null);

        while(n1 != null){
            n1 = n1.next;
            length++;
        }
        int mid = length/2;
        n1 = head;
        int count =1;
        while(count != mid){
            n1 = n1.next;
            count++;
        }
        Node tempNode = n1.next;
        n1.next = node;
        node.next = tempNode;

        return head;
    }


    public Node deleteNodeAgain(int k){
        Node n1 = head;
        System.out.println("K is "+k);
        int count = 0;
        while (n1  != null){
            n1 = n1.next;
            count++;
        }
        System.out.println("size of list is "+count);
        int indexDel = count -k+1;
        n1 = head;
        count = 1;
        while (count != indexDel-1){
            n1 = n1.next;
            count++;

        }
        System.out.println("n1 val "+n1.value);
        n1.next = n1.next.next;
        return head;
    }








}
