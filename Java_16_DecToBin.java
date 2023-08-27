public class Java_16_DecToBin {

    public static int decToBin(int decNum){
        int rem, binNum=0, pow =0;
        while(decNum>0){
            rem = decNum%2;
            binNum = (rem*(int)Math.pow(10, pow))+binNum;
            decNum = decNum/2;
            pow++;
        }
        return binNum;
    }

    public static void main(String[] args) {
        int num=10;
        int decNum = decToBin(num);
        System.out.println(decNum);
    }
}
