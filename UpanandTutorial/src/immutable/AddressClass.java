package immutable;

public class AddressClass implements Cloneable  {
    String Zipcode;
    String flatNo;

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public AddressClass(String zipcode) {
        Zipcode = zipcode;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
