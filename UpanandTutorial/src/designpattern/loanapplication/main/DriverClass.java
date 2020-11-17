package designpattern.loanapplication.main;

import designpattern.loanapplication.AbstractLoanClass;
import designpattern.loanapplication.FactoryClass;


public class DriverClass  {
    public static void main(String[] args) {
        FactoryClass factoryClass = new FactoryClass();
       AbstractLoanClass instance =  factoryClass.getServiceInstance("personal" );
       instance.isSeniorCitizenDiscount();

       double a = instance.calculateEmi(140000 , 10);
        System.out.println(a);
    }
}
