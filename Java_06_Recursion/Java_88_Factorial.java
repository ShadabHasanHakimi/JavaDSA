package JavaDSA.Java_06_Recursion;

public class Java_88_Factorial {
    public static int factorial(int n){
        int fact=1;
        if(n==0){
            return fact;
        }
        fact=n*factorial(n-1);
        return fact;
    }
//    TC: O(n)
//    SC is not constant because memory is used by call stack
//    So, SC: O(n)

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
