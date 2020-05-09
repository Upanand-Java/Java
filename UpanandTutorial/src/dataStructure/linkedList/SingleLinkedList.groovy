package dataStructure.linkedList

class SingleLinkedList {
    SingleNode head;
    SingleNode tail;
    int Size;

    SingleNode getHead() {
        return head
    }

    void setHead(SingleNode head) {
        this.head = head
    }

    SingleNode getTail() {
        return tail
    }

    void setTail(SingleNode tail) {
        this.tail = tail
    }

    int getSize() {
        return Size
    }

    void setSize(int size) {
        Size = size
    }

    /**
     * create single list which n value
     * @param value
     * @return
     */
    public void createSingleLinkedList(int value) {
        //head = new SingleNode()
        SingleNode node = new SingleNode(value)


        //because at first condition both head and tail would be same only !!
        if (head == null) {
            head = node
            tail = node
            //size = size+1;

        } else {
            tail.next = node
            tail = node
            // size = size+1
        }
        size++;


    }

    public boolean existLinkedList() {
        return head != null
    }

    /**
     * Insert value in linked list in different scenerio
     * @param nodeValue
     * @param location
     */
    public void insertInLinkedList(int nodeValue, int location) {
        SingleNode singleNode = new SingleNode(nodeValue)
        // singleNode.setValue(nodeValue)
        if (!existLinkedList()) { //Add from front
            println("Linked list is not exists !!")

        } else if (location == 0) { //Insert at first position i.e after head
            singleNode.setNext(head)
            head = singleNode
        } else if (location == size) { //insert at last position i.e before tail
            println("Inside second scener")
            singleNode.setNext(null)
            tail.setNext(singleNode)
            tail = singleNode //to keep track of last node

        } else { //insert at particular location
            // println("Inside 3rd scenerio !!${location} head..${head}..tail..${tail}..Size..${getSize()}")
            SingleNode tempnode = head
            int i = 0
            while (i < location - 1) {
                tempnode = tempnode.getNext()
                i++
            }
            tempnode.setNext(singleNode)
            singleNode.setNext(tempnode.getNext())
        }
        setSize(getSize() + 1)


    }

    void reverseFunction() {
        if (existLinkedList()) {

        }

    }

    SingleNode reverse() {
        SingleNode prev = null
        SingleNode current = getHead()
        SingleNode next = null
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
        return head
    }

    //Traverses Linked List
    /**
     * Reading each and every node
     */
    void traverseLinkedList() {
        if (existLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getValue());
                if (i != getSize() - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Linked List does not exists !");
        }
        System.out.println("\n");
    }


    void deleteLinkedList() {
        if(existLinkedList()){
            head = null
            tail = null
        }else{
            println("there is no any linked List")
        }
    }

   boolean search(int valuePresent){
       if(existLinkedList()){
           SingleNode tempNode = head;
           for(int i = 0;i<=getSize()-1;i++){

               if(tempNode.getValue()==valuePresent){

                   println("Element found at ${i}th location")
                   return true

               }
               tempNode = tempNode.getNext()
           }

       }else{
           println("Linked does not exists !!")
       }
       return false;
   }
   /* void deletionOfNode(int value) {
        SingleNode singleNode = new SingleNode()
        SingleNode tempNode = head
        for(int i=0;i<=getSize()-1;i++){
            if(tempNode.getValue() == value){
                println("inside if")
             if(   singleNode.next =i)
                 

            }
            tempNode = tempNode.getNext()
        }
    }*/
    void display(){
        if(existLinkedList()){
            SingleNode tempNode = head;
            for(int i=0;i<=getSize()-1;i++){
                println("${tempNode.getValue()}->")
                tempNode = tempNode.getNext()

            }
        }else{
            println("list is not exists !!")
        }
    }
    void deleteNode(int location){
        if(existLinkedList()){
            if(location==0){ //delete the initial node
                println("In zeroth location")
                head = head.getNext()
                setSize(getSize()-1)
                if(getSize()==0){
                    tail = null
                }
            }else if(location>=getSize()){ //delete the last node
                println("In last location !!")
                SingleNode tempNode = head;
                for(int i=0;i<size-1;i++){
                    tempNode = tempNode.getNext()
                }
                if(tempNode == head) {
                    head= tail = null;
                    setSize(getSize()-1)

                }//only head is in the list !!
                tempNode.setNext(null);
                tail = tempNode;
                setSize(getSize()-1)
            }else{// delete at particular location !!
                SingleNode temp = head;
                for(int i=0;i<location-1;i++){
                    temp = temp.getNext()
                }
                temp.setNext(temp.getNext().getNext())
                setSize(getSize()-1)
                println("Node successfully deleted !!")
            }
        }else{
            println("Linked does not exists !!")
        }
    }
}