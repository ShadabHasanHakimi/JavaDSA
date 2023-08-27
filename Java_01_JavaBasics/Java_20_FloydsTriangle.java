public class Java_20_FloydsTriangle {
    public static void print(int nRows, int nCols){
        int n=1;
        for(int i=1; i<=nRows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5,5);
    }
}
