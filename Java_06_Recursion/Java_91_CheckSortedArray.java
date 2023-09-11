package JavaDSA.Java_06_Recursion;

public class Java_91_CheckSortedArray {
    public static boolean checkSorted(int [] arr, int n){
        if(n==arr.length-1){
            return true;
        } else if (arr[n]>arr[n+1]) {
            return false;
        }
        return checkSorted(arr, n+1);
    }
//    TC: O(n)

    public static void main(String[] args) {
        int[] a={1,2,3,6,5};
        System.out.println(checkSorted(a,0));
    }
}
