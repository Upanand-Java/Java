package basicJava;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmpManagmntImpl {
    public static void main(String[] args) {
        ArrayList<EmployeeManagement> employeeManagements = new ArrayList<EmployeeManagement>();
        employeeManagements.add(new EmployeeManagement("Upanand","SSE",100000,"BLR"));
        employeeManagements.add(new EmployeeManagement("appu","SSE",200000,"HYD"));
        employeeManagements.add(new EmployeeManagement("Upand","TL",233300,"CHN"));
        employeeManagements.add(new EmployeeManagement("Unand","SE",100000,"BLR"));
        employeeManagements.add(new EmployeeManagement("anand","CEO",1100000,"BLR"));
        employeeManagements.add(new EmployeeManagement("swati","CEO",100000,"BLR"));

        Predicate<EmployeeManagement> p1 = p-> p.designation.equals("CEO");
        //display(p1,employeeManagements);
        Predicate<EmployeeManagement> p2 = p->p.city.equals("BLR");
        //display(p2,employeeManagements);
        display(p1.and(p2),employeeManagements);

       // System.out.println(employeeManagements);

    }

    private static void display(Predicate<EmployeeManagement> p1, ArrayList<EmployeeManagement> employeeManagements) {
        for(EmployeeManagement e:employeeManagements){
            if(p1.test(e)){
                System.out.println(e);
            }
        }
    }
}
