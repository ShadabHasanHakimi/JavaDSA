// Question 2
import java.util.*;

public class Java_05_Loops_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, even=0, odd=0;
        for(int i=0; i<5; i++){
            System.out.println("Enter number "+i+1);
            num = sc.nextInt();
            if(num%2==0){
                even+=num;
            }
            else
                odd+=num;
        }

        System.out.println("Sum of even integers : "+even);
        System.out.println("Sum of odd integers : "+odd);
    }
}
