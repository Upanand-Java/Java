package dataStructure.queue

class LineraQueueUsingArray {
    int topOfQueue = -1
    int beginingIndex = -1

    int getTopOfQueue() {
        return topOfQueue
    }

    void setTopOfQueue(int topOfQueue) {
        this.topOfQueue = topOfQueue
    }

    int getBeginingIndex() {
        return beginingIndex
    }

    void setBeginingIndex(int beginingIndex) {
        this.beginingIndex = beginingIndex
    }

    public boolean isEmptyQueue(){
        if(topOfQueue==-1){
            return true
        }else{
            return false
        }
    }

    public boolean isFullQueue(int[] arr){
        if(arr.length-1 == topOfQueue){
            return true
        }else {
            return false
        }
    }

    public void displayQueueContents(int[] arr){
        if(!isEmptyQueue()) {
            for (int i = beginingIndex; i <= topOfQueue; i++) {
                println("${arr[i]} ")
            }
        }else{
            println("queue is empty !!")
        }
    }
    public void enqueue(int[] arr, int value){
        if(isFullQueue(arr)){
            println("queue is already full !!")
        }else if(isEmptyQueue()){
            topOfQueue++
            beginingIndex++
            arr[topOfQueue]=value
        }else{
            topOfQueue++
            arr[topOfQueue] = value
        }
        println("After insertion value ${topOfQueue} and ${beginingIndex}")

    }
    public void dequeue(int[] arr){
        if(isEmptyQueue()){
            println("queue is empty !!")
        }else{
            println("Element value that is dequeued ${arr[beginingIndex]}")
            beginingIndex++
            if(beginingIndex>topOfQueue){
                topOfQueue = beginingIndex = -1
        }

        }

        displayQueueContents(arr)

    }
    void peek(int[] arr){
        if(!isEmptyQueue()){
            println("peek of queue is at ${beginingIndex} index and value is ${arr[beginingIndex]}")
        }else{
            println("queue is empty !!")
        }
       // displayQueueContents(arr)
    }

    void deleteQueue(int[] arr){
        arr = null
    }
}
