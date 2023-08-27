public class Java_21_01TrianglePattern {
    public static void print(int nRows, int nCols){
        for(int i=1; i<=nRows; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5,5);
    }
}
