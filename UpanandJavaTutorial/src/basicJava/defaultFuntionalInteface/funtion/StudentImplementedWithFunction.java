package basicJava.defaultFuntionalInteface.funtion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentImplementedWithFunction {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("upanand",67,12366));
        list.add(new Student("virat" , 88,3000));
        list.add(new Student("kohli", 66,2387));
        list.add(new Student("mallika" , 77,23454));
        list.add(new Student("katrina" , 33,654));

        Function<Student , String> f = s -> {
            if(s.marks>=80)
                return "A[Distinction]";
            else if(s.marks>= 60)
                return "B[First class]";
            else
                return "C[fail]";
        };
        for(Student a:list){
            System.out.println(a+" "+f.apply(a));
        }
        //Now want to print who got first class using predicate Functional Interface
        Predicate<Student> predicate = s-> s.marks>=60 && s.marks<80;
        for(Student student : list){
            if(predicate.test(student))
            System.out.println(student+" "+f.apply(student));
        }
        // Now I want to write the function which will always give me the output of total cost of scholarship
        Function<ArrayList<Student> , Double> listFunction = scholarList ->{
                double scholarshipCost = 0;
                for(Student st : scholarList){
                    scholarshipCost = scholarshipCost+st.scholarship;
                }
                return scholarshipCost;

        };
        System.out.println("Total cost is "+listFunction.apply(list));

        //My requirement is the student who got scholarhip less that 10k increment by 13% and return the updated list
        // By using predicate and Function functional interface
        Predicate<Student> studentPredicate = stud -> stud.scholarship<10000;
        Function<Student,Student> listFunction1 = students -> {
            students.scholarship = students.scholarship + (13*students.scholarship)/100;
                return students;};
        ArrayList<Student> list1 = new ArrayList<Student>();
        for(Student stdnt: list){
            if(studentPredicate.test(stdnt)){
                listFunction1.apply(stdnt);
                list1.add(stdnt);
            }
        }

        System.out.println("The student who is eligible for scholarship"+list1);
        System.out.println("Updated List is"+list);

        //System.out.println(listFunction1.apply(list));
    }

}
