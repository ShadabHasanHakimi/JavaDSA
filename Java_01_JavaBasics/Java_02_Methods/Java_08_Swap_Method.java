package JavaDSA.Java_01_JavaBasics.Java_02_Methods;

public class Java_08_Swap_Method {
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        return;
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = 7;
        System.out.println("Before swapping:");
        System.out.println(num1 + "\t" + num2);
//        swap(num1, num2);       - Call by value (value will not change)

        System.out.println("After swapping:");
        System.out.println(num1 + "\t" + num2);
    }
}
