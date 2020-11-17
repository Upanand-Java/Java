package designpattern.singlton;

public class Singelton implements Cloneable {

    private static  Singelton myObj ;

    private Singelton(){ }

    public static Singelton getInstance(){
        if(myObj == null)
            myObj = new Singelton();
        return myObj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    public void showmessage(){
        System.out.println("you are successfully access your singelton class !!");
    }

}
