package JavaDSA.Java_02_Arrays.Java_03_MultiDimensionalArrays;

import java.util.Scanner;

public class Java_43_2DArrays {
    public static void main(String[] args){
//        Rows=3 and Columns=4
        int [][] matrix=new int [3][4];
//        Total number of cells = 3*4=12
        int n=matrix.length;       // Number of rows
        int m=matrix[0].length;        // Number of columns

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements:");
//        Loop for entering array elements
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

//        Loop for printing array elements
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
