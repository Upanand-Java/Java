package designpattern.builder;

public class ClientImplementation {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.name = "upanand";
        System.out.println(stud);
        Student student = new Student("upanand","Bangalore-560068" ,2,
                false,7,"7304531310");
        System.out.println(student);

        StudentBuilder builder = new StudentBuilder();
        Student st = builder.setAdrress("Muzaffarpur=842001").setName("Kishan").getStudentDetail();
        System.out.println(st);
    }
}
