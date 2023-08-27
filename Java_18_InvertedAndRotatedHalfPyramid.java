public class Java_18_InvertedAndRotatedHalfPyramid {
    public static void print(int nRows, int nCols){
        for(int i=1; i<=nRows; i++){
            for(int j=nCols-1; j>=i; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(4,4);
    }
}
