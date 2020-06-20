package immutable;

public class AddressClass implements Cloneable  {
    String Zipcode;

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public AddressClass(String zipcode) {
        Zipcode = zipcode;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
