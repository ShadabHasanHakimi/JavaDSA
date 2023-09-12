package JavaDSA;

public class Practice {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int verTiles = tilingProblem(n-1);
        int horTiles = tilingProblem(n-2);

        int totWays = verTiles+horTiles;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
