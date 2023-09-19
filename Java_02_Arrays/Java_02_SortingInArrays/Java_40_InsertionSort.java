package JavaDSA.Java_02_Arrays.Java_02_SortingInArrays;

public class Java_40_InsertionSort {
    public static void insertionSort(int[] a){
        for(int i=0; i<a.length; i++){
            int curr=a[i];
            int prev=i+1;
//          this while loop will find the correct position for curr element
            while(prev>=0 &&a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
//            insertion of the curr element at correct position
            a[prev+1]=curr;
        }
    }
//    Time complexity of Insertion sort : O(n^2)

    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        insertionSort(arr);
        for(int e: arr){
            System.out.print(e);
        }
    }
}
