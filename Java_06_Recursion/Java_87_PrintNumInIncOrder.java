package JavaDSA.Java_06_Recursion;

public class Java_87_PrintNumInIncOrder {
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
//        First calling Inner function then printing
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printInc(10);
    }
}
