public class Java_28_BinarySearch {
    public static int binarySearch(int[] a, int key){
        int start=0, end=a.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                end = mid-1;
            }
            else
                start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 9, 11, 12, 15, 17};
        int key = 12 ;
        if(binarySearch(arr,key)==-1)
            System.out.println("Element not found!!!");
        else
            System.out.println("Element found at "+binarySearch(arr,key)+" index");
    }
}
