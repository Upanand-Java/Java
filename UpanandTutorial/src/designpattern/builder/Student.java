package designpattern.builder;

public class Student {
    String name;
    String adrress;
    int rank;
    boolean isScholarShipRequired;
    int unitTestRank;
    String mobileNumber;
    public Student(){}


    public Student(String name, String adrress, int rank, boolean isScholarShipRequired, int unitTestRank, String mobileNumber) {
        this.name = name;
        this.adrress = adrress;
        this.rank = rank;
        this.isScholarShipRequired = isScholarShipRequired;
        this.unitTestRank = unitTestRank;
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name){
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adrress='" + adrress + '\'' +
                ", rank=" + rank +
                ", isScholarShipRequired=" + isScholarShipRequired +
                ", unitTestRank=" + unitTestRank +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
