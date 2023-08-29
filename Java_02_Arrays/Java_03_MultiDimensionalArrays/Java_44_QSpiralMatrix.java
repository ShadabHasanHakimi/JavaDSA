package JavaDSA.Java_02_Arrays.Java_03_MultiDimensionalArrays;

public class Java_44_QSpiralMatrix {
    public static void spiralmatrix(int [][] matrix) {
        int n = matrix.length;        //Number of rows
        int m = matrix[0].length;     //Number of cols
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = m - 1;

//        i denote the cols
//        j denote the rows
//        top
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

//        right
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(matrix[j][endCol] + " ");
            }

//        bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

//        left
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[j][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main (String[]args){
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        spiralmatrix(arr);
        int[][] arr1 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {13, 14, 15, 16}};
        spiralmatrix(arr1);
        int[][] arr2= {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        spiralmatrix(arr2);
    }
}
