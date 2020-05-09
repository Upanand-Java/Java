package javacursor;

public class Student implements Comparable<Student> {
    int id;
    int marks;
    String name;
    public Student(int id, int marks, String name){
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
   /*     if(id>student.id){
            return -1;
        }
        else if(id==student.id){
            return 0;
        }else{
            return 1;
        }
        */
   return (student.name.compareTo(name));
    }
}
