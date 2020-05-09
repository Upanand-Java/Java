package dataStructure.array;

/*
* find the maximum value in array without using collection concept !!
 */
public class MaximumValueInArray {
    public static void main(String[] args) {
        int[] integerArray = {1,22,11,22,44,1,3,4,221,3,4,4};
        int max = 999999999;
        for(int i=0;i<=integerArray.length-1;i++){
            if(integerArray[i]<max){
                max = integerArray[i];
            }

        }
        System.out.println(max);
    }
}
