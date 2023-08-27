public class Java_23_SolidRhombusPattern {
    public static void print(int nRows, int nCols){
        for(int i=1; i<=nRows; i++){
            for(int k=1; k<=(nCols-i); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=nCols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(4,4);
    }
}
