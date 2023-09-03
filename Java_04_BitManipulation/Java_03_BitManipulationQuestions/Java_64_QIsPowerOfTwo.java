package JavaDSA.Java_04_BitManipulation.Java_03_BitManipulationQuestions;

public class Java_64_QIsPowerOfTwo {
    public static boolean isPowerOfTwo(int num){
//        num&(num-1) returns true if the number is in the form of 2^n
//        It is a property of binary numbers
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(256));
    }
}
