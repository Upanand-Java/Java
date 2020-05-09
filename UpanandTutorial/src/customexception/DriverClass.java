package customexception;

public class DriverClass {
  //  Employee employee = new Employee();
    public static void main(String[] args) {
        Employee employee = new Employee();
        try{
            employee.findEmployee("upanan");

        }catch (EmployeeNotFoundException e){
            System.err.println(e);

        }

    }
}
