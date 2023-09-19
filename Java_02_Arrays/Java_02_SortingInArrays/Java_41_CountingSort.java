package JavaDSA.Java_02_Arrays.Java_02_SortingInArrays;

public class Java_41_CountingSort {
    public static void countingSort(int[] a){
        int largest = Integer.MIN_VALUE;
//        Loop for finding the range or largest element of the given loop
        for(int i=0; i<a.length; i++){
            largest=Math.max(largest, a[i]);
        }

//        Because 0 is also considered for sorting
        int[] count=new int[largest+1];
//        Loop for constructing count array which stores the frequency of elements of a
        for(int j=0; j<a.length; j++){
            count[a[j]]++;
        }

        int k=0;
//        Loop for sorting the given array using count array
        for(int l=0; l<count.length; l++){
            while(count[l]>0){
                a[k]=l;
                k++;
                count[l]--;
            }
        }
    }
//    TC : O(n+k) where n is the number of elements and k is the range
//    if the range of elements is small then counting sort is best

    public static void main(String[] args) {
        int [] arr={2,1,5,2,1,4,6,4,7,3,9,7,9,5};
        countingSort(arr);
        for(int element: arr){
            System.out.print(element);
        }
    }
}
