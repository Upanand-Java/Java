public class Solution {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        double result = 0;
        int minimum = salary[0];
        int maximum = salary[0];
        int totalSum = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]<minimum){
                minimum = salary[i];
            }
        }
        System.out.println("min "+minimum);
        for(int i=0;i<salary.length;i++){
            if(salary[i]>maximum){
                maximum = salary[i];
            }
        }
        for(int i=0;i<salary.length;i++){
            if(salary[i] ==minimum || salary[i]== maximum){
                continue;
            }else{
                System.out.println("inside "+salary[i]);
                totalSum += salary[i];
            }
        }
        System.out.println("max "+maximum);
        System.out.println("max "+totalSum);
        int temp = salary.length -2;

        result = totalSum/temp;
        System.out.println("resu "+result);


    }
}
