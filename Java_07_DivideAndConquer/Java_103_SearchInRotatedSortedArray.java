package JavaDSA.Java_07_DivideAndConquer;

public class Java_103_SearchInRotatedSortedArray {
    public static void search(int[] arr, int si, int ei, int tar){
        int mid = si+(ei-si)/2;
        if(arr[mid]==tar){
            System.out.println(mid);
            return;
        }

//        If mid is on line 1
        if(arr[mid]>=arr[si]){
//            if tar is on left of mid
            if(tar<=arr[mid] && tar>=arr[si]){
                search(arr, si, mid-1, tar);
            }
//            if tar is on right of mid
            else{
                search(arr, mid+1, ei, tar);
            }
        }

//        if mid is on line 2
        else{
//            if tar is on right of mid
            if(tar>=arr[mid] && tar<=arr[ei]){
                search(arr, mid+1, ei, tar);
            }
//            if tar is on left of mid
            else{
                search(arr, si, mid-1, tar);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        search(arr, 0, arr.length-1, 0);
    }
}
