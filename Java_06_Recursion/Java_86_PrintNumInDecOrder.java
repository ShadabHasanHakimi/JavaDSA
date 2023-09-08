package JavaDSA.Java_06_Recursion;

public class Java_86_PrintNumInDecOrder {
    public static void printDec(int n){
//        Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
//        Work
        System.out.println(n);
//        Calling inner function
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}
