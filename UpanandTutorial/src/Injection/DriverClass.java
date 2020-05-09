package Injection;

public class DriverClass {
    public static void main(String[] args) {
        InjectionExampleStudent student = new InjectionExampleStudent("upanand",10);
        student.setId(15);
        System.out.println(student.getName());
        System.out.println(student.getId());
    }
}
