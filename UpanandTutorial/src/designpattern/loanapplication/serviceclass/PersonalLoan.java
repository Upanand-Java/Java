package designpattern.loanapplication.serviceclass;

import designpattern.loanapplication.AbstractLoanClass;

public class PersonalLoan extends AbstractLoanClass {

    private final double ROI = 10.5;
    @Override
    public double calculateEmi(double basPrice , int tenure) {
        double rate = ROI/100;
        return   basPrice * rate * (1 + rate)*tenure*12/((1 + rate)*tenure*12 - 1);
    }

    @Override
    public void isSeniorCitizenDiscount(){
        System.out.println("Senior citizen Discount is there!!");
    }
}
