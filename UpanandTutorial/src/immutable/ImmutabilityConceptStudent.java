package immutable;

import java.util.HashMap;
import java.util.Map;

public final class ImmutabilityConceptStudent {

   private final String name;
    private final  String id;
    private final  AddressClass address ;
    private final HashMap<String,String> hashMap ;

   /* public ImmutabilityConceptStudent(String name,String id){
        this.name = name;
        this.id = id;
    }*/

    public ImmutabilityConceptStudent(String name,String id,AddressClass address ,HashMap<String,String> hashMap ){
        this.name = name;
        this.id = id;
        this.address = address;
        this.hashMap = hashMap;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public AddressClass getAddress() throws CloneNotSupportedException{
        //address.setZipcode("842001");
        return (AddressClass) address.clone();
       // return address;

    }

    @SuppressWarnings("unchecked")
    public HashMap<String,String> getHashMap() throws CloneNotSupportedException{
        return (HashMap<String, String>) hashMap.clone();
    }







}
