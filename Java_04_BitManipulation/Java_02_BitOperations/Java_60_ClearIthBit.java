package JavaDSA.Java_04_BitManipulation.Java_02_BitOperations;

public class Java_60_ClearIthBit {
    public static int clearIthBit(int num, int i){
        int bitmask=~(1<<i);
        return num&bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
    }
}
