package java8concept.interviewcall;

import java.util.Objects;

public class EmployeeClass {
    String name;
    String Designation;

    public EmployeeClass(String name, String designation) {
        this.name = name;
        Designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", Designation='" + Designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeClass that = (EmployeeClass) o;

        if (!name.equals(that.name)) return false;
        return Designation.equals(that.Designation);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Designation.hashCode();
        return result;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(Designation, that.Designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Designation);
    }*/



}
