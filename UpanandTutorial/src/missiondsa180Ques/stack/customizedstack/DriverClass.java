package missiondsa180Ques.stack.customizedstack;

public class DriverClass {
    public static void main(String[] args) {
        StackClass stackClass = new StackClass();
        stackClass.push(3);
        stackClass.push(6);
        stackClass.push(1);
        stackClass.pop();
        stackClass.pop();
       // stackClass.pop();
        System.out.println(stackClass.getMin());
        stackClass.printStack();
    }
}
