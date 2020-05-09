package basicJava.defaultFuntionalInteface.funtion;

public class Student {
    String name;
    int marks;
    double scholarship;

    public Student(String name, int marks,double scholarship) {
        this.name = name;
        this.marks = marks;
        this.scholarship = scholarship;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", scholarship=" + scholarship +
                '}';
    }
}
