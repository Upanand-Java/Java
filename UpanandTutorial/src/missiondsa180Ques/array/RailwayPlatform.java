package missiondsa180Ques.array;

import java.util.Arrays;

/**
 *  Time      Event Type     Total Platforms Needed
 *                                at this Time
 *  9:00       Arrival                  1
 *  9:10       Departure                0
 *  9:40       Arrival                  1
 *  9:50       Arrival                  2
 *  11:00      Arrival                  3
 *  11:20      Departure                2
 *  11:30      Departure                1
 *  12:00      Departure                0
 *  15:00      Arrival                  1
 *  18:00      Arrival                  2
 *  19:00      Departure                1
 *  20:00      Departure                0
 */

public class RailwayPlatform {
    public static void main(String[] args) {

        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed = 1;
        int result =1;
        int i=1;
        int j =0;
        while(i<n && j< n){
            if(arr[i] <= dep[j]){
                plat_needed++;
                i++;
            }else if(arr[i]>dep[j]){
                plat_needed--;
                j++;
            }
            result = Math.max(result,plat_needed);
        }
        System.out.println(result);
    }
}
