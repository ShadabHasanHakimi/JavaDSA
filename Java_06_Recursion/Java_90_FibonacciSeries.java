package JavaDSA.Java_06_Recursion;

public class Java_90_FibonacciSeries {
    public static int fibonacci(int n){
        int sum;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        sum=fibonacci(n-1)+fibonacci(n-2);  //Sum of (n-1)th and (n-2)th number
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(23));
    }
}
