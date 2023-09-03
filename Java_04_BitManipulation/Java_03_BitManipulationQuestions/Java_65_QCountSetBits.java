package JavaDSA.Java_04_BitManipulation.Java_03_BitManipulationQuestions;

import javax.imageio.stream.ImageInputStream;

public class Java_65_QCountSetBits {
    public static int countSetBits(int num){
        int count=0;
        while(num>0) {
//            15=1111 and 15&1=0000 (count=1)
//            15>>1=0111 and 0111&1=0000 (count=2) and so on...
            if ((num & 1) != 0)
                count++;
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}
