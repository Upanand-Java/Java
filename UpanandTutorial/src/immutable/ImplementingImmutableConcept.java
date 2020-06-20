package immutable;

import java.util.HashMap;
import java.util.Map;

public class ImplementingImmutableConcept {
    public static void main(String[] args) throws CloneNotSupportedException {
      //  ImmutabilityConceptStudent immutabilityConceptStudent = new ImmutabilityConceptStudent("Upanand","23");
        //immutabilityConceptStudent.id = "1";

      //  System.out.println(immutabilityConceptStudent.getName());

        AddressClass addressClass = new AddressClass("01");

        ImmutabilityConceptStudent addr = new ImmutabilityConceptStudent("upanand" , "23",addressClass, new HashMap<>());
        System.out.println("prev value "+addr.getAddress().getZipcode());
        addressClass.setZipcode("56000");
        //System.out.println(addr.getAddress());
        System.out.println("name value "+addr.getAddress().getZipcode());
    }
}
