package dataStructure.array

class TwoDimensionalArray {
    public static void main(String[] args) {
         int[][] arr
        arr = new int[3][3]
        int row = 1
        int col =1
       int[][] res =  insert(arr,row,col)
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                println(" ${res[i][j]} ")
            }
        }


    }

    static int[][]  insert(int[][] ints,int row , int col) {
        if(ints[row][col]==0){
            ints[row][col] = 10
        }else {
            println("Not inserted!!")
        }
        return ints

    }
}
