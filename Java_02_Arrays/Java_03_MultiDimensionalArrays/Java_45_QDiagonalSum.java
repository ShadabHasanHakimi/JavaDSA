package JavaDSA.Java_02_Arrays.Java_03_MultiDimensionalArrays;

public class Java_45_QDiagonalSum {
    public static void diagonalSum(int[][] a){
//        no of cols and rows is same
        int n=a.length, sum=0;

//        for(int i=0; i<n; i++){     //Non optimized (TC: O(n^2))
//            for(int j=0; j<n; j++){
//                if(i==j){       //For primary diagonal
//                    sum+=a[i][j];
//                }
//                else if(i+j==n-1){      //For secondary diagonal
////                    or if(j==n-1-i)
//                    sum+=a[i][j];
//                }
//            }
//        }

        for(int i=0; i<=n-1; i++){
            sum+=a[i][i];
            int j=n-i-1;
            if(i!=j)        //Condition for middle element where n is odd
                sum+=a[i][j];
        }
//        TC:O(n)
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        diagonalSum(arr);
        int[][] arr1 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {13, 14, 15, 16}};
        diagonalSum(arr1);
    }
}
