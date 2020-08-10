package javacursor;

public class Employee {
    int empId;
    String name;
    String dept;

    public Employee(int empId, String name, String dept) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department=" + dept +
                '}';
    }
}
