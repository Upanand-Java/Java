package missiondsa180Ques.dynamicprogrammng;

public class FibSer {
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21
        int n =8;
       // fib(n);
       //int x =  fibonacci(n);
        //System.out.println("ans "+x);

        int x =  recursiveMemonization(n);
        System.out.println("ans "+x);


    }

    private static void fib(int n) {

       /* if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);*/
       int x = 0;
       int y=1;
       int a =100;

       for(int i=1;i<=n;i++){
          // if(x<=100) {
               System.out.print(x + " ");
               int z = x + y;
               x = y;
               y = z;
         //  }
       }



    }

    public static int  fibonacci(int n){ //bottom-up approach , tabulation ,DP
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;

        for(int i =2;i<=n;i++){
            f[i] = f[i-1]+f[i-2];
            System.out.println(f[i]);
        }


        return f[n];
    }
    public static int recursiveMemonization(int n){

        int[] arr = new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = -1;
        }
        if(arr[n]!= -1){
            return arr[n];
        }

        if(n == 0 || n==1)
            arr[n] = n;
        else
        arr[n] = recursiveMemonization(n-2)+recursiveMemonization(n-1);

        return arr[n];
    }
}
