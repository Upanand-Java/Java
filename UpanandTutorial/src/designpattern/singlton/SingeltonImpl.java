package designpattern.singlton;

public class SingeltonImpl {
    public static void main(int[] o) throws Exception {
        System.out.println(o[1]);
        Singelton singelton = Singelton.getInstance();
        System.out.println(singelton.hashCode());
        Singelton s2 = (Singelton) singelton.clone();
        System.out.println(s2.hashCode());
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1,2};
        SingeltonImpl.main(arr);
        System.out.println(arr[0]);
    }
}
