package JavaDSA.Java_06_Recursion;

public class Java_95_PrintPowerOptimised {
//    Case 1: x^n = x^(n/2) * x^(n/2)       [When power is even]
//            2^10 =  2^5   *  2^5
//    Case 2: x^n = x * x^(n/2) * x(n/2)    [When power is odd]
//            2^11= 2 *   2^5   *  2^5

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
//        int ans= power(x, n/2) * power(x, n/2);     // TC: O(n)
        int halfPower = power(x, n/2);      //Now, TC: O(log n)
        int ans = halfPower*halfPower;
        if(n%2==0){
            return ans;
        }
        return x*ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
