package JavaDSA.Java_02_Arrays.Java_03_MultiDimensionalArrays;

public class Java_47_2DArraysQuestions {
////    count of a number in 2d arrays
//    public static int question1(int [][] matrix, int key){
//        int count=0;
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[0].length; j++){
//                if(key==matrix[i][j])
//                    count++;
//            }
//        }
//        return count;
//    }

//    Sum of second row of an 2d array
//    public static int question2(int [][]nums){
//        int sum=0;
//        for(int i=0; i<nums[0].length; i++){
//            sum+=nums[1][i];
//        }
//        return sum;
//    }

//    Transpose of a matrix
    public static void question3(int [][] matrix){
        int [][] transpose=new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int [][] arr={{4,7,8},{8,8,7}};
//        int key=8;
//        System.out.println("Count of "+key+" = "+question1(arr, key));

//        int [][]nums={{1,4,9},{11,4,3},{2,2,3}};
//        System.out.println("Sum of second row = "+question2(nums));

        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        question3(matrix);

    }
}
