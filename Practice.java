package JavaDSA;

import java.util.Arrays;

public class Practice {
    public static void countingSort(int [] a, int r){
        int[] freq=new int[r+1];
        Arrays.fill(freq,0);
        for(int i=0; i<=r;i++){
            for(int j=0; j<a.length; j++){
                if(i==a[j]){
                    freq[i]+=1;
                }
            }
            System.out.print(freq[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr={1,4,1,3,2,4,3,7};
        countingSort(arr,7);
        System.out.println();
        for(int e: arr){
            System.out.print(e);
        }
    }
}
