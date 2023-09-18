package JavaDSA.Java_01_JavaBasics.Java_02_Methods;

public class Java_14_binToDec {
    public static int binToDec(int binNum){
        int pow=0, ld, decNum=0;
        while(binNum > 0){
            ld = binNum%10;
            decNum += ld*(int)Math.pow(2, pow);     //Math.pow() will return a double value hence type casted into int
            pow++;
            binNum=binNum/10;
        }
        return decNum;
    }

    public static void main(String[] args) {
        int binNum=1010;
        int decNum=binToDec(binNum);
        System.out.println(decNum);
    }
}
