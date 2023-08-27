public class Java_15_ReverseNum {
    public static int reverse(int num){
        int rev=0, ld;
        while(num>0){
            ld = num%10;
            rev = (rev*10)+ld;
            num = num/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num=82766389;
        int numRev=reverse(num);
        System.out.println(numRev);
    }
}
