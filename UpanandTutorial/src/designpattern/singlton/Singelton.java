package designpattern.singlton;

public class Singelton {

    private static  Singelton myObj ;

    private Singelton(){ }

    public static Singelton getInstance(){
        if(myObj == null)
            myObj = new Singelton();
        return myObj;
    }

    public void showmessage(){
        System.out.println("you are successfully access your singelton class !!");
    }

}
