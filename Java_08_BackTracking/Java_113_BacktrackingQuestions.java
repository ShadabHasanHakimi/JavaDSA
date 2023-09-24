package JavaDSA.Java_08_BackTracking;

public class Java_113_BacktrackingQuestions {
//    Question 1
    public static boolean isSafe(int[][] maze, int row, int col){
        if(row==maze.length && col==maze.length){
            return false;
        }
        else if(maze[row][col]==0){
            return false;
        }
        return true;
    }
    public static int[][] RatInMaze(int[][] maze, int i, int j){

        if(i==maze.length-1 && j==maze.length-1){
            return res;
        }
        if(isSafe(maze, i, j+1)){
            res[i][j]=1;
//        Moving right
            RatInMaze(maze, i, j+1);
        }
        if(isSafe(maze, i, j-1)){
            res[i][j]=1;
//        Moving Left
            RatInMaze(maze, i, j-1);
        }
        if(isSafe(maze, i+1, j)){
            res[i][j]=1;
//        Moving up
            RatInMaze(maze, i+1, j);
        }
        if(isSafe(maze, i-1, j)){
            res[i][j]=1;
//        Moving down
            RatInMaze(maze, i-1, j);
        }
        return maze;
    }
    public static void printMaze(int[][] maze){
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze.length; j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] res=new int[4][4];
    public static void main(String[] args) {
        int[][] maze= { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };

        printMaze(res);

    }
}
