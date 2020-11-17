package missiondsa180Ques.stringques;

public class Interview {
    public static void main(String[] args) {
        int[] arr = {9,1,3,7,5,13,15};
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        int min =arr[0];
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }

        System.out.println(max+" "+min);
        int commonDiff = (max-min)/arr.length;
        System.out.println(commonDiff);


        int nthAp = arr.length+1;
        //formula for ap n/2[2a + (n – 1)d]
        int apSum = (((arr.length*commonDiff)+(2*min))*nthAp)/2;

        System.out.println(apSum);

        int sum =0;
        for(int i:arr){
            sum+= i;
        }

        int missingElement = apSum - sum;
        System.out.println(missingElement);
    }
}
