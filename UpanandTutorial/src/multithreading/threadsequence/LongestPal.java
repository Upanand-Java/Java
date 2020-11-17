package multithreading.threadsequence;

class  LongestPal{

       static int longestValue = 0;
       static String input = "abaccfcchjaaabaaa";
        static int n = input.length();
        static int lowerIndex = 0;

   public static void main(String[] args){
        for(int i=0;i<n-1;i++){
        streched(input , i , i); // nedd to handle for odd number of length
        streched(input , i,i+1); //need to handle for even number of length
        }

        System.out.println(longestValue);
       String maxSub = input.substring(lowerIndex, lowerIndex+longestValue);
       System.out.println(maxSub);

        }

       private static void streched(String input , int low ,int high){
        while(low>=0 && high< input.length() && input.charAt(low) == input.charAt(high)){
        high++;
        low--;

        }

        if(longestValue < (high -1 - low)){
        longestValue = high -1 - low;
            lowerIndex = low +1;
        }


        }




        }
