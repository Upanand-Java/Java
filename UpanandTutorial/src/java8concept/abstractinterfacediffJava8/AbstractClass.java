package java8concept.abstractinterfacediffJava8;

public abstract class AbstractClass {

    int id;
    String name;

    static int b = 0;
    {
        b = 5;
        id = 10;
        Integer integer = new Integer(4);
        System.out.println("inside instance block !!"+b);


    }

    static {
        int a = 10;
        //System.out.println(a+" "+b+" "+name); // we cant use not static variable.
        System.out.println(a+" "+b+" ");
    }


    public AbstractClass(){}

    public AbstractClass(int id, String name) {
        this.id = id;
        this.name = name;
        int x = 3+id;
        System.out.println(x);

    }


    public abstract void m1();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public abstract String m2(String name);

    public String concreteMethod(String name){
        System.out.println("In abstract voncrete method !!");
        return name;
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass(4,"upanand") {
            @Override
            public void m1() {
                System.out.println("in m1");
            }

            @Override
            public String m2(String name) {
                System.out.println("in m2");
                return name;
            }
        };

        System.out.println(abstractClass.id);
      //  System.out.println(a);
        System.out.println(abstractClass.m2("upanand"));
    }
}
