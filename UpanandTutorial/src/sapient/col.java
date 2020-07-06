package sapient;

import designpattern.builder.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class col {
    public static class student {
        int id;
        String name;

        public student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        TreeSet<student> students = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                if(o1.id>o2.id){
                    return -1;
                }else if(o1.id<o2.id){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        students.add(new student(1,"name"));
        students.add(new student(3,"name"));
        students.add(new student(-1,"name"));
        students.add(new student(4,"name"));

        System.out.println(students);

    }
}
