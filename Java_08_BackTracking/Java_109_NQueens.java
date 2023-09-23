package JavaDSA.Java_08_BackTracking;

//We will be given N queens and N*N chessboard, now we have to set position
//of queens such that no 2 queens can attack each other
public class Java_109_NQueens {
//    step 3
    public static boolean isSafe(char[][] board, int row, int col){
//        vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
//        diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
//        diag right up
        for(int i=row-1, j=col+1; i>=0 &&j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
//    step 1
    public static void nQueens(char[][] board, int row){
        if(row==board.length){
            count++;        //We can only count the solution instead of printing them although the time comp. will be same
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]='x';      // Removing the queen for changing place while backtracking
            }
        }
    }
//    step 2
    public static void printBoard(char[][] board){
        System.out.println("----chess board----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
//    T(n) = (Time required to place 1 Queen)*T(n-1) + Time taken by function isSafe()
//    T(n) = (n*T(n-1))+isSafe()
//    TC: O(n!)

    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char[][] board = new char[n][n];
//        initializing the char 2d array
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='x';
            }
        }

        nQueens(board, 0);
        System.out.println(count);
    }
}
