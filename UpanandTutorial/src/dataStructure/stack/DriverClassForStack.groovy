package dataStructure.stack

class DriverClassForStack {
    public static void main(String[] args) {
        println("Enter the length of the stack !!")
        Scanner scanner = new Scanner(System.in)
        int n = scanner.nextInt()
        int[] stack = new int[n]

        StackUsingArray usingArray = new StackUsingArray()
        println("Enter the stack value !!")
        for(int i=0;i<=stack.length-1;i++) {
            int value = scanner.nextInt()
            usingArray.push(stack, value)
        }
        usingArray.display(stack)
        println("poping from stack !!")
        usingArray.pop(stack)
        println("after poping")
        usingArray.display(stack)
        println("peek the array")
        usingArray.peek()
    }
}
