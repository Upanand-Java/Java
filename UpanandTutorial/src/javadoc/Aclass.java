package javadoc;

public class Aclass {
    public void printName() {
        System.out.println("A");
    }


    static class Bclass extends Aclass {
        public void printName() {
            System.out.println("A");
        }
    }

   static class Cclass {

        public void printName(Aclass a) {
            System.out.println("AA");
        }

        public void printName(Bclass b) {
            System.out.println("BB");
        }

    }

    public static void main(String[] args) {
        Aclass a = new Aclass();
        a.printName();
        a = new Bclass();
        a.printName();
        Cclass cclass = new Cclass();
        cclass.printName(a); //
        cclass.printName(new Bclass()); //

    }
}
