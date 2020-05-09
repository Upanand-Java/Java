package dataStructure.queue

class CircularQueueArray {
    int topOfqueue = -1
    int beginingIndex = -1

    int getTopOfqueue() {
        return topOfqueue
    }

    void setTopOfqueue(int topOfqueue) {
        this.topOfqueue = topOfqueue
    }

    int getBeginingIndex() {
        return beginingIndex
    }

    void setBeginingIndex(int beginingIndex) {
        this.beginingIndex = beginingIndex
    }

    public boolean isEmpty(){
        if(topOfqueue==-1){
            return true
        }else {
            return false
        }

    }

    public boolean isFull(int[] arr){
        if(topOfqueue+1 == beginingIndex){
            return true //when completed the circle
        }else if((arr.length-1 == topOfqueue) && (beginingIndex==0)){ //when a basic scenerio that beginIndex at start topOfqueue at last
            return true
        } else{
            return false;
        }
    }

    public void enqueue(int[] arr,int value){
        if(!isFull(arr)){
            beginingIndex=0
            if(topOfqueue[beginingIndex]==-1)
            topOfqueue=0;
            else {
                topOfqueue++
            }
            arr[topOfqueue]==value


        }else{
            println("queue is already full !!")
        }
    }

    public void dequeue(int[] arr){
        if (!isEmpty()){

            if(beginingIndex+1== topOfqueue){
                beginingIndex=topOfqueue=-1;
            }else if( beginingIndex+1== arr.length) {
                beginingIndex = 0
            }else{
                beginingIndex++
            }
        }else{
            println("queue is empty")
        }
    }
}
