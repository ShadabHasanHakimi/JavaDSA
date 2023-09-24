package JavaDSA.Java_08_BackTracking;

//Find the number of ways to reach from (0, 0) to (n-1, m-1) in a n*m grid.
//Allowed moves - right or down

public class Java_110_GridWays {

    public static int gridWays(int i, int j, int n, int m){
//        i and j are the starting points and n and m are destinations
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }
//        Ways for moving down
        int w1=gridWays(i+1, j, n, m);
//        Ways for moving left
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;
    }
//    TC: O(2^(n+m))
    public static void main(String[] args) {
        int n=4, m=3;
        System.out.println(gridWays(0,0,n,m));
    }
}
