package missiondsa180Ques.math;

import sun.misc.GC;

public class LcmAndGcd {

    public static void main(String[] args) {
        int firstNum = 700;
        int secondNum = 8;
        int lcm = findLcm(firstNum,secondNum);
       // int gcd = findGcd(firstNum,secondNum);
        int res = recursiveGcd(firstNum,secondNum);
        System.out.println(res);
    }

    private static int recursiveGcd(int firstNum, int secondNum) {
        if(secondNum == 0){
            return firstNum;
        }
        return recursiveGcd(secondNum, firstNum%secondNum);




    }

    private static int findLcm(int firstNum, int secondNum) {
        int res = recursiveGcd(firstNum,secondNum);
        int result = res *(firstNum/res)*(secondNum/res);






        return result;
    }

    private static int findGcd(int firstNum, int secondNum) {
       // int result =0;
        int Gcd =1;

        if(firstNum>secondNum){
            for(int i=1;i<=secondNum;i++){
                if(firstNum%i ==0 && secondNum%i ==0){
                    if(i>Gcd){
                        Gcd = i;
                    }

                }

            }
        }else {
            for(int i=1;i<=firstNum;i++){

                if(firstNum%i ==0 && secondNum%i ==0){
                    if(i>Gcd){
                        Gcd = i;
                    }

                }

            }

        }


        System.out.println("GCD is "+Gcd);
        return Gcd;
    }


}
