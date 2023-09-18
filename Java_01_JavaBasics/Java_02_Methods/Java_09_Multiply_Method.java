package JavaDSA.Java_01_JavaBasics.Java_02_Methods;

import java.util.Scanner;

public class Java_09_Multiply_Method {
    public static int multiply(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int a, b, mul;
        System.out.println("Enter two numbers to multiply them:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        mul = multiply(a,b);
        System.out.println("Result = "+mul);
    }
}
