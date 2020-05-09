package basicJava;

public class SoftwareEngineer {
    String name ;
    int age ;
    boolean isHavingGf;

    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHavingGf=" + isHavingGf +
                '}';
    }
}
