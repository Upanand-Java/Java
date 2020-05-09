package dataStructure.stack

class StackUsingArray {
    int topOfStack = -1
    int getTopOfStack() {
        return topOfStack
    }

    void setTopOfStack(int topOfStack) {
        this.topOfStack = topOfStack
    }
   // int topOfStack ;





    public def void push(int[] ints,int value) {
        if(!isFull(ints)){
           // println("inside push")
            topOfStack++
            //println("AFter incement !!")
            ints[getTopOfStack()]=value
            //println("after first insertion !!")
        }else{
            println("Create the stack first !!")
        }

    }

    public def void pop(int[] ints) {
        int temp = getTopOfStack()
        if(temp==-1){
            println("Stack is empty !!")
        }else{
            println("stack is popped ${ints[temp]}")
            setTopOfStack(getTopOfStack()--)
        }

    }

     public void peek(int[] ints) {
         if(!isEmpty()){
             println("current tp element is at ${topOfStack} index !!")
         }


    }

    public boolean isEmpty(){
        if(getTopOfStack()==-1){
            return true
        }else{
            return false
        }
    }

    public boolean isFull(int[] arr){
        if(topOfStack==arr.length){
            return true;
        }else{
            return false;
        }

    }
    public void display(int[] arr){
        for(int i=0;i<=topOfStack-1;i++){
            println("${arr[i]} ")
        }
        println("Top of index for stack is ..${topOfStack}")
    }

    public void delete(int[] arr){
        if(arr.length!=0){
            arr = null;
        }
    }
}
