package javatrickyquestion;

public class InterviewQuestion {

    public int sum(Integer a,Integer b){
       return a+b;
    }

    public int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        InterviewQuestion question = new InterviewQuestion();
        Integer i = 2;
        int j = 10;

       //int a =  question.sum(i,j); //ambigious
       int a =  question.sum(3,6); //ambigious
        System.out.println(a);
    }
}
