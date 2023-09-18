package JavaDSA.Java_01_JavaBasics.Java_03_AdvancedPatterns;

public class Java_22_ButterflyPattern {
    public static void print(int nRows, int nCols){
        for(int i=1; i<=(nRows/2); i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*((nCols/2)-i); k++){
                System.out.print("  ");
            }
            for(int m=1; m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=(nRows/2); i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*((nCols/2)-i); k++){
                System.out.print("  ");
            }
            for(int m=1; m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(8, 8);
    }
}
