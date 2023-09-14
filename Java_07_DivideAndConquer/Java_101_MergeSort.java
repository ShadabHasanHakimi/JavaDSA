package JavaDSA.Java_07_DivideAndConquer;

public class Java_101_MergeSort {
    public static void printArr(int[] arr){
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);        //Left part
        mergeSort(arr, mid+1, ei);      //Right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp=new int[ei-si+1];
        int i=si;       //iterator for left part
        int j=mid+1;        //iterator for right part
        int k=0;        //iterator for temp arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

//        for leftover elements in left and right part after comparison
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

//        copying the sorted arrays into main arr
        for(k=0, i=si; k<=temp.length-1; k++, i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr={4,2,6,3,-2,8,0,-1};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
