package JavaDSA.Java_04_BitManipulation.Java_02_BitOperations;

public class Java_61_UpdateIthBit {
    public static int setIthBit(int num, int i){
        int bitMask=(1<<i);
        return num|bitMask;
    }

    public static int clearIthBit(int num, int i){
        int bitMask=~(1<<i);
        return num&bitMask;
    }

    public static int updateIthBit(int num, int i, int newBit){
        if(newBit ==0){
            return clearIthBit(num, i);
        }
        else{
            return setIthBit(num, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10,1,0));
    }
}
