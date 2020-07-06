package javadoc;

public class temp {
    String value ;

    public temp(String value) {
        this.value = value;
    }

    public static class temp1{
        String value ;

        public temp1(String value) {
            this.value = value;
        }

    }

    public static void main(String[] args) {
        temp t1 = new temp("1");
        temp t2 = new temp("2");
        System.out.println(t1.value);
        System.out.println(t2.value);
        swap(t1,t2);
        System.out.println(t1.value);
        System.out.println(t2.value);




    }

    public static void swap(temp item1, temp item2) {
        temp temp = item2;
        item2 = item1;
        item1 = temp;

    }
}
