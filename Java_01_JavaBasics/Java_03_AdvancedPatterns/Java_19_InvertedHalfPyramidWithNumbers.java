package JavaDSA.Java_01_JavaBasics.Java_03_AdvancedPatterns;

public class Java_19_InvertedHalfPyramidWithNumbers {
    public static void print(int nRows, int nCols){
        for(int i=1; i<=nRows; i++){
            for(int j=1; j<=nCols-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5,5);
    }
}
