package JavaDSA.Java_01_JavaBasics.Java_01_Loops;// Question : Display all numbers entered by user except multiples of 10
import java.util.*;
public class Java_04_Question_Continue {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number :");
            num = sc.nextInt();
            if(num%10==0)
                continue;
            System.out.println(num);
        }while(true);

    }
}
