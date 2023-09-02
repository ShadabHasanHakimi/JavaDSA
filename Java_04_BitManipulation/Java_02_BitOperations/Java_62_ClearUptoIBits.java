package JavaDSA.Java_04_BitManipulation.Java_02_BitOperations;

public class Java_62_ClearUptoIBits {
    public static int clearUptoIBits(int num, int i){
        int bitMask=(~0)<<i;
//        (~0)=11111111 and (~0)<<2 = 11111100
        return num&bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearUptoIBits(15,2));
    }
}
