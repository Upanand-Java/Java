package basicGroovyCodePractice

class Person {
    String fname
    String lname
    int age
    Person(String fname, String lname, int age) {
        this.fname = fname
        this.lname = lname
        this.age = age
    }


    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
