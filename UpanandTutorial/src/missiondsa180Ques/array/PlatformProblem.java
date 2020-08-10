package missiondsa180Ques.array;

import java.util.Arrays;

public class PlatformProblem {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        //int[] arr = {900, 940};
        //int[] dep = {910, 1200};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int noOfPlatform = getPlatform(arr,dep);
        System.out.println(noOfPlatform);
    }

    private static int getPlatform(int[] arr, int[] dep) {
        int noOfPlatAtTime = 1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int finalPlatFormNeeded = 1;
        int arrLen = arr.length;
        int i=1; // arrival point
        int j=0; // departure point


        while(i<arrLen && j<arrLen){
            if(dep[j]>=arr[i]){
                noOfPlatAtTime++;
                i++;
            }else if(dep[j]<arr[i]) {
                noOfPlatAtTime--;
                j++;
            }
            finalPlatFormNeeded = Math.max(finalPlatFormNeeded,noOfPlatAtTime);
        }

        return finalPlatFormNeeded;
    }
}
