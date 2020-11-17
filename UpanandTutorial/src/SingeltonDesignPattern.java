public class SingeltonDesignPattern {
    public static SingeltonDesignPattern myObj = null;

    private SingeltonDesignPattern(){}

    public static SingeltonDesignPattern  getInstance(){
        if(myObj == null){
            myObj = new SingeltonDesignPattern();
        }

        return myObj;

    }
}
