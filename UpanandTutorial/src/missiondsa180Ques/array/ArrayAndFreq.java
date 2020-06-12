package missiondsa180Ques.array;

public class ArrayAndFreq {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 5, 5, 3, 2, 1, 2, 3, 4, 3, 5, 2, 1};
        int visited = -1;

        int[] freq = new int[arr.length];
        int count = 0;

        for (int i =0;i<arr.length;i++){
            count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    count++;
                    //make sure same index we do not traverse second time
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited){
                freq[i] = count;
            }

        }

       /* for (int j:freq){
            System.out.println(" "+j);
        }*/

        for(int k = 0;k<arr.length;k++){
            if(freq[k] != visited){
                System.out.println("Number is "+arr[k]+" value is "+freq[k]);
            }
        }


    }


}
