package sapient;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Objectclass {

    public static class Student{
        int id;
        String name;

        public Student(int id, String name ){
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
           if (o instanceof Student){
               return this.name.equals(((Student) o).name);
           }
           return false;
        }

        @Override
        public int hashCode() {
            System.out.println(this.name.hashCode());
            return this.name.hashCode();

        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1,"upa");
        Student student1 = new Student(6,"upa");

        Map<Student,String> studentStringMap = new HashMap<>();
        studentStringMap.put(student,"CSE");
        studentStringMap.put(student1,"IT");
        studentStringMap.put(null,"it");
        studentStringMap.put(null,"it");

        System.out.println(studentStringMap);

        System.out.println("equal "+(student.equals( student1)));


    }


}
