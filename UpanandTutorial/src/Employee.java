import java.util.*;

public class Employee {
    String dept;
    String name ;
    int id;

    public Employee(String dept, String name, int id) {
        this.dept = dept;
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("HR","khusboo",1));
        employees.add(new Employee("HR","virat",2));
        employees.add(new Employee("Finance","upanand",44));
        employees.add(new Employee("FInance","kohli",9));

        Map<String ,List<Employee>> stringListMap = new HashMap<>();

        /*for(Employee emp: employees){
            if(stringListMap.containsKey(emp.dept))

        }*/

       // employees.stream().map(i-> stringListMap.put(i.dept , i))
        int max = employees.stream().max(Comparator.comparingInt(e->e.id)).get().id;
        System.out.println(max);
    }
}
