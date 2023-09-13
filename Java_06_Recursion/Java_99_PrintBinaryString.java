package JavaDSA.Java_06_Recursion;

//Print binary string of n length without consecutive 1

public class Java_99_PrintBinaryString {
    public static void binString(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastPlace==0){
            binString(n-1, 0, str+"0");
            binString(n-1, 1, str+"1");
        }
        else
            binString(n-1, 0, str+"0");
    }

    public static void main(String[] args) {
        binString(3, 0, "");
    }
}
