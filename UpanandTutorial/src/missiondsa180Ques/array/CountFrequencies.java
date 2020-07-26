package missiondsa180Ques.array;

public class CountFrequencies {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 2, 5,6,7,6,6,8};
        int n = arr.length;
        //printfrequency(arr,n);


        //to change in n-1

        for(int i=0;i<n;i++){    //2,3,2,1 -ques
            arr[i] = arr[i]-1;  //1,2,1,0
                                //arr[1] =2
        }                       //arr[2] = 1 , arr[2] = 9 , arr[3]


        for(int j=0;j<n;j++){
            arr[arr[j]%n] = arr[arr[j]%n]+n;
        }

        for(int k=0;k<n;k++){
            System.out.println(k+1+"th position "+arr[k]/n);
        }
    }
   private static void printfrequency(int arr[], int n)
    {
        // Subtract 1 from every element so that the elements
        // become in range from 0 to n-1
        for (int j = 0; j < n; j++)
            arr[j] = arr[j] - 1;

        // Use every element arr[i] as index and add 'n' to
        // element present at arr[i]%n to keep track of count of
        // occurrences of arr[i]
        for (int i = 0; i < n; i++)
            arr[arr[i] % n] = arr[arr[i] % n] + n;

        // To print counts, simply print the number of times n
        // was added at index corresponding to every element
        for (int i = 0; i < n; i++)
            System.out.println(i + 1 + "->" + arr[i] / n);
    }
}
