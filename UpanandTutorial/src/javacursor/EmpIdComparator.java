package javacursor;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee employee1) {
        if(employee.empId>employee1.empId){
            return 1;
        }else if(employee.empId == employee1.empId){
            return 0;
        }else{
            return -1;
        }

    }
}
