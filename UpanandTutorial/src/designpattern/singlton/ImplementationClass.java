package designpattern.singlton;

public class ImplementationClass {


    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        singelton.showmessage();

       // Singelton singelton = new Singelton(); //I am getting error that prove we cant instantiate singelton class
    }
}
