package JavaDSA.Java_07_DivideAndConquer;

public class Java_104_SearchInRotatedSortedArrayUsingLoop {
    public static int search(int[] arr, int tar){
        int si=0, ei=arr.length-1, mid=si+(ei-si)/2;

        while(true){
            if(arr[mid]==tar){
                return mid;
            }
//            mid is on line 1
            if(arr[mid]>=arr[si]){
//                tar is on left of mid
                if(tar>=arr[si]&&tar<=arr[mid]){
                    ei=mid-1;
                }
//                tar is on right of mid
                else{
                    si=mid+1;
                }
            }
//            mid is on line 2
            else{
//                tar is on right of mid
                if(tar>=arr[mid] && tar<=arr[ei]){
                    si=mid+1;
                }
//                tar is on left of mid
                else{
                    ei=mid-1;
                }
            }
            mid=si+(ei-si)/2;
        }
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        System.out.println(search(arr, 4));
    }
}
