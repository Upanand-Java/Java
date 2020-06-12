package synechron;

public class Student {

    String name ;
    int Zipcode;

    public Student(String name, int zipcode) {
        this.name = name;
        Zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZipcode() {
        return Zipcode;
    }

    public void setZipcode(int zipcode) {
        Zipcode = zipcode;
    }
}
