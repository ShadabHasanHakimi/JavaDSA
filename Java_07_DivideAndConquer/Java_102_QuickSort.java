package JavaDSA.Java_07_DivideAndConquer;

public class Java_102_QuickSort {
    public static void printArr(int[] arr){
        for(int e: arr){
            System.out.print(e);
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }

//        place the pivot on right position and returns its index
        int pIdx=partition(arr, si, ei);

        quickSort(arr, si, pIdx-1);     //For left part
        quickSort(arr, pIdx+1, ei);     //For right part
    }
    public static int partition(int[] arr, int si, int ei){
//        Taking last element as pivot
        int pivot=arr[ei];
//        i=-1 for the first case
        int i=si-1;

        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
//                Swapping the values at i and j
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

//            Placing pivot at right position
        i++;
        arr[ei]=arr[i];
        arr[i]=pivot;
//        returning the position of pivot i.e. i
        return i;
    }
//    TC: O(log n)
//    SC: O(1)

//    But in worst case (when pivot is always the smallest or the largest element), TC: O(n^2)

    public static void main(String[] args) {
        int[] arr={2,4,5,1,8,9,6};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
