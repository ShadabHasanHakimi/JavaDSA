package JavaDSA.Java_04_BitManipulation.Java_03_BitManipulationQuestions;

public class Java_63_QClearRangeOfBits {
    public static int clearRangeOfBits(int num, int i, int j){
//        10=00001010
        int a=(~0)<<j+1;    //(~0)<<5=11110000
        int b=(1<<i)-1;     //(1<<2)=00000010-1=00000011
        int bitMask=(a)|(b);    //11110000 | 00000011 =11110011
        return num&bitMask;     //11110011 & 00001010 = 00000010 =2
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10,2,4));
    }
}
