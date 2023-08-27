import java.util.Scanner;

public class Java_12_Prime_Method {
    public static boolean isPrime(int n){
//        Corner Case
        if(n==2){
            return true;
        }

//        for(int i=2; i<n; i++){
//            if(n%i==0) {
//                return false;
//            }
//        }

//        Optimised Approach : We can use this method in which there will be
//        no repetition
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number to check it is prime or not:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(isPrime(n));

    }

}
