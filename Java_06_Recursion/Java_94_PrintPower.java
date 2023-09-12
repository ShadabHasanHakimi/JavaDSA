package JavaDSA.Java_06_Recursion;

public class Java_94_PrintPower {
    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        int ans=x*power(x, n-1);
        return ans;
    }
//    TC: O(n)

    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
