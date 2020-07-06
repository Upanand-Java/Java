package designpattern.builder;

public class StudentBuilder {
    String name;
    String adrress;
    int rank;
    boolean isScholarShipRequired;
    int unitTestRank;
    String mobileNumber;


    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAdrress(String adrress) {
        this.adrress = adrress;
        return this;
    }

    public StudentBuilder setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public StudentBuilder setScholarShipRequired(boolean scholarShipRequired) {
        isScholarShipRequired = scholarShipRequired;
        return this;
    }

    public StudentBuilder setUnitTestRank(int unitTestRank) {
        this.unitTestRank = unitTestRank;
        return this;
    }

    public StudentBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public Student  getStudentDetail(){
        return new Student(name,adrress,rank,isScholarShipRequired,unitTestRank,mobileNumber);
    }
}
