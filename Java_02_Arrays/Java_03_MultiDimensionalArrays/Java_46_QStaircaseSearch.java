package JavaDSA.Java_02_Arrays.Java_03_MultiDimensionalArrays;

public class Java_46_QStaircaseSearch {
//    Starting point Top left
    public static boolean stairCaseSearchTop(int[][] matrix, int key){
//        We can use the below condition or row=matrix.length and col=0 condition
        int row=0, col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("Key found at index : ("+row+", "+col+")");
                return true;
            }
//            if key is less than cell value then move left
            else if(key<matrix[row][col]){
                col--;
            }
//            if key is greater than cell value then move bottom
            else{
                row++;
            }
        }
        System.out.println("Element not found!!!");
        return false;
    }
//    TC : O(

//    Starting point bottom left
    public static boolean stairCaseSearchBottom(int[][] matrix, int key){
        int row=matrix.length-1, col=0;
        while(row>=0 && col<=matrix[0].length-1){
            if(key==matrix[row][col]){
                System.out.println("Element found at index : ("+row+", "+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Element not found!!!");
        return false;
    }

    public static void main(String[] args) {
        int[][] m={{10,20,30,40},       // this matrix is sorted row and col wise
                   {15,25,35,45},
                   {27,29,37,48},
                   {32,33,39,50}};;
        int key = 20;
        boolean result = stairCaseSearchTop(m, key);
        int key1=35;
        boolean result1 = stairCaseSearchBottom(m, key1);
    }
}
