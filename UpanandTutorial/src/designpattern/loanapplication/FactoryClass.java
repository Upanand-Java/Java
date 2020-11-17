package designpattern.loanapplication;

import designpattern.loanapplication.serviceclass.CarLoan;
import designpattern.loanapplication.serviceclass.HomeLoan;
import designpattern.loanapplication.serviceclass.PersonalLoan;

public class FactoryClass {

    public AbstractLoanClass getServiceInstance(String loanType){
        if(loanType.equalsIgnoreCase("personal")){
            return new PersonalLoan();
        }else if(loanType.equalsIgnoreCase("home")){
            return new HomeLoan();
        }else if(loanType.equalsIgnoreCase("car")){
            return new CarLoan();
        }
        throw new RuntimeException("Not a valid input");

    }
}
