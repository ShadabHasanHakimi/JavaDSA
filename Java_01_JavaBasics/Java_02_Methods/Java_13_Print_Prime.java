package JavaDSA.Java_01_JavaBasics.Java_02_Methods;

import java.util.Scanner;

// We have to print all prime numbers from in given range
public class Java_13_Print_Prime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start, end, num;
        System.out.println("Enter Range :");
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
