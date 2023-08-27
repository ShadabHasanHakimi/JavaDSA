import java.util.Scanner;

public class Java_17_Functions_Questions {
//    Question 1
//    public static int average(int a, int b, int c){
//        return (a+b+c)/3;
//    }
//
//    public static void main(String[] args) {
//        int a=10, b=15, c=23;
//        int avg = average(a, b, c);
//        System.out.println(avg);
//    }

//    Question 2
//    public static boolean isEven(int num){
//        if(num%2!=0)
//            return false;
//        else
//            return true;
//    }
//
//    public static void main(String[] args) {
//        int num;
//        System.out.println("Enter a number ot check it is even or not :");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        System.out.println(isEven(num));
//    }

//    Question 3
//    public static int isPalindrome(int num){
//        int rem, pow=0, rev=0;
//        while(num>0){
//            rem = num%10;
//            rev = (rev*10)+rem;
//            pow++;
//            num=num/10;
//        }
//        return rev;
//    }
//
//    public static void main(String[] args) {
//        int num=123321;
//        int rev=isPalindrome(num);
//        if(num==rev)
//            System.out.println("The given number is a palindrome number.");
//        else
//            System.out.println("The given number is not a palindrome number");
//    }

//    Question 5
    public static int sumOfDigits(int num){
        int ld, sum=0;
        while(num>0){
            ld = num%10;
            sum += ld;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num=154;
        int sum = sumOfDigits(num);
        System.out.println(sum);
    }
}
