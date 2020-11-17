package missiondsa180Ques.array;



public class FirstAndLastinLogn {
    public static void main(String[] args) {
        int[] arr = {1,3,3,3,3,3,3,3,7,9};
        int[] output = new int[2];
        output[0] = firstSearch(arr ,3);
        System.out.println(output[0]);
       /* if(output[0] != -1) {
            if (arr[output[0] + 1] == 8) {
                output[1] = output[0] + 1;
            } else if (arr[output[0] - 1] == 8) {
                output[1] = output[0] - 1;
            } else {
                output[1] = output[0];
            }
        }else{
            output[1] = -1;
        }
        //output[1] = secondSearch(arr ,8 );
        System.out.println(output[1]);*/
    }

    private static int firstSearch(int[] arr, int i) {
        int indx = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]>= i){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            if(arr[mid]==i)
                indx = mid;
        }

        return indx;




    }

    private static int secondSearch(int[] arr, int i) {
        int index = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<=i){
                start = mid+1;

            }else{

                end = mid-1;

            }

            if(arr[mid]==i)
                index = mid;
        }

        return index;
    }



}
