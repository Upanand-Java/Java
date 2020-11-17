package missiondsa180Ques.array;
public class Count1 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,0,0,1,1,1,1,0};

        int count1 = 0;
        int max =0;
        for(int i:arr){
            if(i==1){
                count1++;
            }else {
                max = Math.max(max,count1);
                count1 =0;
            }


        }
        System.out.println(max);
    }
}
