package JavaDSA.Java_08_BackTracking;

public class Java_111_GridWaysTrick {
//    There are (n-1) Right turns and (m-1) Down turns
//    So, there will be (n-1 + m-1) Total turns
//    Hence, using permutations, total ways will be ((n-1 + m-1)!) / ((n-1)! * (m-1)!)
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int gridWays(int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        return factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1));
    }

    public static void main(String[] args) {
        System.out.println(gridWays(3,3));
    }
}
