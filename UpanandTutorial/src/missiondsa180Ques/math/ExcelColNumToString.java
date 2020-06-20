package missiondsa180Ques.math;

public class ExcelColNumToString {
    public static void main(String[] args) {
      int n = 53;
      StringBuilder result = new StringBuilder();
      while(n>0){
          n--;
          result.insert(0,(char)('A'+n%26));
          n /= 26;

      }
        System.out.println(result.toString());
    }
}
