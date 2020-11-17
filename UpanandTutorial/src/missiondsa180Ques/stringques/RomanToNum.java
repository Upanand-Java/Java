package missiondsa180Ques.stringques;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToNum {
    public static void main(String[] args) {
        String x = "CLIV";
        int[] arr = new int[x.length()];
        for(int i = 0;i<arr.length;i++){
            switch (x.charAt(i)){
                case 'C' :arr[i]=100;
                break;
                case 'L' :arr[i]=50;
                    break;
                case 'I' :arr[i]=1;
                    break;
                case 'V' :arr[i]=5;
                    break;
                case 'M' :arr[i]=1000;
                    break;


            }
        }
        //VII
        int sum = 0;
        for(int i=0;i<x.length()-1;i++){
            if(arr[i]<arr[i+1])
                sum -= arr[i];
            else
                sum += arr[i];
        }
        System.out.println(sum+arr[arr.length-1]);
    }
}
