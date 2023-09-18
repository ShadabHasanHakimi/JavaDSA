package JavaDSA.Java_01_JavaBasics.Java_03_AdvancedPatterns;

public class Java_25_DiamondPattern {
    public static void print(int nR, int nC){
        for(int i=1; i<=nR; i++){
            for(int j=1; j<=nC-i; j++){
                System.out.print("  ");
            }
//            for(int k=1; k<=i; k++){
//                System.out.print("* ");
//            }
//            if(i>1){
//                for(int j=1; j<=i-1; j++){
//                    System.out.print("* ");
//                }
//            }
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=nR; i>=1; i--){
            for(int j=1; j<=nC-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            if(i>1){
                for(int j=1; j<=i-1; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(4,4);
    }
}
