package JavaDSA.Java_01_JavaBasics.Java_01_Loops;

import java.util.Scanner;

public class Java_03_Conditionals_Questions {
//    Question 1
//    public static void main(String[] args) {
//        int num;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        num = sc.nextInt();
//        if(num<0)
//            System.out.println("Entered number is negative.");
//        else
//            System.out.println("Entered number is positive.");
//    }

    //    Question 2
//    public static void main(String[] args) {
//        double temp = 103.5;
//        if(temp<100)
//            System.out.println("You don't have fever.");
//        else
//            System.out.println("You have fever.");
//
//    }

    //    Question 3
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number(1-7)");
        day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Jumme-raat");
            case 5 -> System.out.println("Jumma");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday-Funday");
            default -> System.out.println("Invalid choice!!! Enter a " +
                    "number btw 1-7.");
        }
    }

//    Question 4
//    Value of x will be false and the value of y will be 63 (a)
}
