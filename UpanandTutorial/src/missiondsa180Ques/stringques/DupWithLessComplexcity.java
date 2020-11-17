package missiondsa180Ques.stringques;

public class DupWithLessComplexcity {
    public static void main(String[] args) {
        String s = "aabcddcfgd";
        String a = removeAllDup(s);
        System.out.println(a);
        int res = findDup(s);
        System.out.println(res);
    }

    private static String removeAllDup(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(sb.indexOf(String.valueOf(s.charAt(i)))<0){
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }

    private static int findDup(String s) {
        int[] arr = {1,3,4,3,5,6};
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];

        }while (slow != fast);

        slow = arr[0];
        while (slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return fast;
    }
}
