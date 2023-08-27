public class Java_24_HollowRhombusPattern {
    public static void print(int nR, int nC){
        for(int i=1; i<=nR; i++){
            for(int j=1; j<=nR-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<nC; j++){
                if(i>1 && i<nR && j>1 && j<nC-1){       // Or if(i==1 || i==4 ||j==1 || j== 4
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(9,7);
    }
}
