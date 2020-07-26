package immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableEmployeeClass {
   private final int id;
   private final String name;
   private final ArrayList<String> project;
   private final List<String> role;
   private final AddressClass addressClass;


    public ImmutableEmployeeClass(int id, String name, ArrayList<String> project,List<String> role,
                                    AddressClass addressClass) {
        this.id = id;
        this.name = name;
        ArrayList<String> stringsDeepCopy = new ArrayList<>(project);
        ArrayList<String> rolesDeepCopy = new ArrayList<>(role);
        this.project = stringsDeepCopy;
        this.role = rolesDeepCopy;
        AddressClass deepCopy = new AddressClass(addressClass.getZipcode());
        deepCopy.setFlatNo(addressClass.getFlatNo());
        this.addressClass = deepCopy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getProject()  throws CloneNotSupportedException{

        return (ArrayList<String>) project.clone();
        //return project;
    }

    public List<String> getRole() throws CloneNotSupportedException{
       ArrayList<String> list = new ArrayList<>(role);
       // list.addAll(role);
        return (List<String>) list.clone();
    }

    public AddressClass getAddressClass() throws CloneNotSupportedException{
        return (AddressClass) addressClass.clone();
    }

   /* @Override
    public String toString() {
        return "ImmutableEmployeeClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", project=" + project +
                '}';
    }*/
}
