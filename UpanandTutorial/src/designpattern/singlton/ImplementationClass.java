package designpattern.singlton;

import sapient.SingeltonClass;

public class ImplementationClass {


    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        singelton.showmessage();
       // singelton.showmessage();
        Singelton singelton1  = Singelton.getInstance();
      //  singelton1.showmessage();
        Singelton si  = Singelton.getInstance();
       // singelton1.showmessage();
        Singelton s  = Singelton.getInstance();
       // singelton1.showmessage();
        Singelton singe  = Singelton.getInstance();
       // singelton1.showmessage();


        System.out.println(singelton1==singe);

        SingeltonClass s1 = SingeltonClass.getInstanceOf();
        s1.showMsg();
        SingeltonClass s2 = SingeltonClass.getInstanceOf();
        s2.showMsg();

        System.out.println(s1 == s2);

        System.out.println(s1.hashCode());


       // Singelton singelton = new Singelton(); //I am getting error that prove we cant instantiate singelton class
    }
}
