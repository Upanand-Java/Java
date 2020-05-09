package dataStructure.queue

class DriverQueueClass {

    public static void main(String[] args) {
        println("Enter the length of the queue")
        Scanner scanner = new Scanner(System.in)
        int length = scanner.nextInt()
        int[] arr = new int[length]
        LineraQueueUsingArray usingArray = new LineraQueueUsingArray()
        println("Enter the Value !!")
        for(int i=0;i<=arr.length-1;i++){
            int val = scanner.nextInt()
            usingArray.enqueue(arr,val)
        }
        usingArray.displayQueueContents(arr)
        println("How many time you want to dequeued!!")
        int temp = scanner.nextInt()
        if(temp>0) {
            for (int i = 0; i < temp; i++) {
                usingArray.dequeue(arr)
            }
        }else{
            println("Give some proper input to pop !! ")
        }
        usingArray.peek(arr)





    }
}
