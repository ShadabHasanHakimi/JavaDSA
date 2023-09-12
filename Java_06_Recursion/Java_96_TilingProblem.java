package JavaDSA.Java_06_Recursion;

public class Java_96_TilingProblem {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int verArr = tilingProblem(n-1);        //For vertical arrangement of tiles
        int horArr = tilingProblem(n-2);        //For horizontal arrangement of tiles
        int totWays = verArr+horArr;        //Total ways to place a tile on given 2*n
        return totWays;
    }
//    Code will be dame for 4*n surface

    public static void main(String[] args) {
        System.out.println(tilingProblem(2));
    }
}
