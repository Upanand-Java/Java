package designpattern.loanapplication.serviceclass;

import designpattern.loanapplication.AbstractLoanClass;

public class CarLoan extends AbstractLoanClass {
    private final double ROI = 8.7;
    @Override
    public double calculateEmi(double basPrice , int tenure) {
        double rate = ROI/100;

        return   basPrice * rate * (1 + rate)*tenure*12/((1 + rate)*tenure*12 - 1);
    }


}
