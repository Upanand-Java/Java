package customexception;

public class Employee {
    public void findEmployee(String name) throws EmployeeNotFoundException{
        if(name.equalsIgnoreCase("upanand")){
            System.out.println("Valid");
        }else{
            throw new EmployeeNotFoundException("Employee name is not valid !!");
        }
    }
}
