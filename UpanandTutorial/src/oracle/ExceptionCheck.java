package oracle;

import java.sql.SQLException;

public class ExceptionCheck {
    public void m1()  {
        System.out.println("In m1 method");
    }
}

class subclass extends ExceptionCheck{
    @Override
   // public void m1() throws InterruptedException { //Checked exception not allowed
    //if not there in super class
    public void m1() throws NullPointerException { //Unchecked exception allowed
        super.m1();
        System.out.println("In m1 overidden method");
    }

    public static void main(String[] args) {
        ExceptionCheck s = new ExceptionCheck();
        s.m1();
    }
}
