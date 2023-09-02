package JavaDSA.Java_04_BitManipulation.Java_01_BitManipulationBasics;

public class Java_57_OddOrEven {
    public static void oddOrEven(int num){
        int bitMask=1;
        if((num&bitMask)==0){
            System.out.println("Even Number!!!");
        }
        else
            System.out.println("Odd Number!!!");
    }

    public static void main(String[] args) {
        int num=8476;
        oddOrEven(num);
    }
}
