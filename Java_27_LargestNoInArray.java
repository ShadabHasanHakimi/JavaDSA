import java.util.*;
public class Java_27_LargestNoInArray {
    public static int largest(int[] a){
        int l=Integer.MIN_VALUE;        // min possible value in int
//        For max value : Integer.MAX_Value
        for (int j : a) {
            if (j > l) {
                l = j;
            }
        }
        return l;
    }
//    Time complexity of these functions is : O(n)
    public static int smallest(int[] a){
        int s = Integer.MAX_VALUE;
        for(int element : a){
            if(element<s)
                s = element;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {5, 26, 34, 4, 45, 56, 72, 32, 64};
        System.out.println("Largest Element of given array : "+largest(arr));
        System.out.println("Smallest Element of given array : "+smallest(arr));
    }
}
