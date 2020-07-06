package sapient;

public class SingeltonClass {
    private static SingeltonClass singeltonClass;

    private SingeltonClass(){ }

    public static SingeltonClass getInstanceOf(){
        if(singeltonClass == null){
            singeltonClass = new SingeltonClass();
           // return new SingeltonClass();
        }
        return singeltonClass;
    }
    public void showMsg(){
        System.out.println("Success !!");
    }
}
