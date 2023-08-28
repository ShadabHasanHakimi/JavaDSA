package JavaDSA;

import java.util.Arrays;

public class Practice {
    public static void countingSort(int[] a){
        int largest=Integer.MIN_VALUE;
        for (int j : a) {
            largest = Math.max(largest, j);
        }
        int [] count = new int [largest+1];
        for(int i=0; i<a.length; i++){
            count[a[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={1,4,1,3,2,4,3,7};
        countingSort(arr);
        System.out.println();
        for(int e: arr){
            System.out.print(e);
        }
    }
}
