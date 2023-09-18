package JavaDSA.Java_01_JavaBasics.Java_02_Methods;

import java.util.Scanner;

public class Java_10_Binomial_Coeff_Method {
    public static int factorial(int a){
        int fact=1;
        for(int i=a; i>=1; i--){
            fact*=i;
        }
        return fact;
    }

    public static int bCoeff(int n, int r){
        int result;
        result=factorial(n)/(factorial(r)*factorial(n-r));
        return result;
    }

    public static void main(String[] args) {
        int n, r;
        System.out.println("Enter values of n and r :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        System.out.println("Binomial coefficient = "+bCoeff(n,r));
    }
}
