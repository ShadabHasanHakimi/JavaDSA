package JavaDSA.Java_06_Recursion;

public class Java_89_SumOfNNumbers {
    public static int sum(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        sum=n+sum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
