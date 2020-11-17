package missiondsa180Ques.stack.customizedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackClass {
    int topOfStack = -1;
    Integer min = Integer.MAX_VALUE;
    List<Object> ls ;
    Stack<Object> stackObjects ;


    public StackClass(){
        ls = new ArrayList<>();
        stackObjects = new Stack<>();
        stackObjects.push(min);
    }

    public int getTopOfStack() {
        return topOfStack;
    }

    public void setTopOfStack(int topOfStack) {
        this.topOfStack = topOfStack;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public boolean push(Object val){
        if(val  == null)
            return false;
        if( getMin() > (Integer) val){
            stackObjects.push(val);
            setMin((Integer) val);
        }
        ls.add(val);
        topOfStack ++;
        return true;
    }
    public void pop(){
        if(getMin() == (Integer) ls.get(topOfStack)){
            stackObjects.pop();
            setMin((Integer) stackObjects.peek());
        }
        ls.remove(topOfStack);
        topOfStack --;

    }

    public void printStack(){
        System.out.println(ls);
    }
}
