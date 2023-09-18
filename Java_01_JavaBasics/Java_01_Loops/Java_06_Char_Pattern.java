package JavaDSA.Java_01_JavaBasics.Java_01_Loops;

public class Java_06_Char_Pattern {
    public static void main(String[] args) {
        char s = 'A';
        for(int i=0; i<4; i++){
            for(int j=0;j<=i;j++){
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
    }
}
