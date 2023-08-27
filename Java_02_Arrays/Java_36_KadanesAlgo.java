public class Java_36_KadanesAlgo {
    public static int kadanesAlgo(int [] a){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int e: a){
            currSum+=e;
            if(currSum<0){      // If value of currSum is less than 0 then it is reset to 0
                currSum=0;
            }
            else        // Value of currSum is greater than 0, hence it is given to maxSum if it is greater than previous maxSum
                maxSum=Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadanesAlgo(arr));
    }
}
