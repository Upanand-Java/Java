package immutable;

import java.util.ArrayList;
import java.util.List;

public class DriverOfEmployeeImmutable {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> list = new ArrayList<>();
        list.add("p1");
        List<String> stringList = new ArrayList<>();
        stringList.add("SDE1");

        AddressClass addressClass = new AddressClass("842001");
        addressClass.setZipcode("560068");
        addressClass.setFlatNo("A-306");

        ImmutableEmployeeClass immutableEmployeeClass = new ImmutableEmployeeClass(1,"upanand",
                                                                list,stringList,addressClass);

        System.out.println(immutableEmployeeClass.getProject()+" "+immutableEmployeeClass.getRole()
                            +" "+immutableEmployeeClass.getAddressClass().getZipcode()
                            +" "+immutableEmployeeClass.getAddressClass().getFlatNo());

        list.add("p2"); // illustration of deep copy of constructor,If we wont pass deep
        //copy of constructor of mutable then p2 would be be added
        stringList.add("SDE2");
        addressClass.setZipcode("560100");
        addressClass.setFlatNo("A-308");

        System.out.println(immutableEmployeeClass.getProject()+" "+immutableEmployeeClass.getRole()
                            +" "+immutableEmployeeClass.getAddressClass().getZipcode()
                            +" "+immutableEmployeeClass.getAddressClass().getFlatNo());


        immutableEmployeeClass.getProject().add("p3"); // illustration of clone from getter method
        //if we wont pass clone of object the p3 would be get added
        immutableEmployeeClass.getRole().add("SDE3");
        immutableEmployeeClass.getAddressClass().setZipcode("560103");
        immutableEmployeeClass.getAddressClass().setFlatNo("A-314");



        System.out.println(immutableEmployeeClass.getProject()+" "+immutableEmployeeClass.getRole()
                            +" "+immutableEmployeeClass.getAddressClass().getZipcode()
                            +" "+immutableEmployeeClass.getAddressClass().getFlatNo());


    }
}
