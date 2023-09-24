package JavaDSA.Java_08_BackTracking;

//A sudoku contains a grid of (9*9) dimensions which have numbers from 1-9
//It also have 9 mini grids of dimensions (3*3)
//There are some empty spaces which we have to fill with a number
//The number should be unique in respect to its row, column and mini grid
//The number should not be present in its column and row and the mini grid in which it is present
public class Java_112_SudokuSolver {
//    This function returns true if it is allowed to place a number in a place by comparing
//    it with its respective row, column and mini grid
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){
//        For comparing row and column
        for(int j=0; j<9; j++){
            if(sudoku[row][j]==digit || sudoku[j][col]==digit){
                return false;
            }
        }

//        For comparing in mini grid
        int sr=(row/3)*3, sc=(col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }

//    Function for solving sudoku
    public static boolean sudokuSolver(int[][] sudoku, int row, int col){
//        Base condition
        if(row==9){
            return true;
        }

//        For traversing through the row and then changing row after reaching last column
        int nextRow=row, nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

//        If an entry is non 0 then allowing it to remain as it is
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

//        For fixing the right number and finding the solution
        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }

        return false;
    }

//    Function for printing resultant sudoku
    public static void printSudoku(int[][] Sudoku){
        for(int i=0; i<Sudoku.length; i++){
            for(int j=0; j<Sudoku.length; j++){
                System.out.print(Sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

//    Driver function
    public static void main(String[] args) {
        int[][] sudoku  =  {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                            {4, 9, 0, 1, 5, 7, 0, 0, 2},
                            {0, 0, 3, 0, 0, 4, 1, 9, 0},
                            {1, 8, 5, 0, 6, 0, 0, 2, 0},
                            {0, 0, 0, 0, 2, 0, 0, 6, 0},
                            {9, 6, 0, 4, 0, 5, 3, 0, 0},
                            {0, 3, 0, 0, 7, 2, 0, 0, 4},
                            {0, 4, 9, 0, 3, 0, 0, 5, 7},
                            {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        }
        else
            System.out.println("Solution Does Not Exists!!!");
    }
}
