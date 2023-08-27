public class Java_37_BubbleSort {
    public static void bubbleSort(int[] a){
        int n=a.length;
//        Loop for turns
        for(int i=0; i<n-1; i++){
//            Loop for swaps
            for(int j=0; j<n-1-i; j++){
                if(a[j+1]<a[j]){
//                    Swapping the values
                    int temp;
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
//    Time complexity of bubble sort : O(n^2) [Because two loops are used]

    public static void main(String[] args) {
        int [] arr={5,2,8,4,6,1,3,9};
        bubbleSort(arr);
        for(int e : arr){
            System.out.print(e);
        }
    }
}
