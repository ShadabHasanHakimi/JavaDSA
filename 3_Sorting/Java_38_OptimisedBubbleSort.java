public class Java_38_OptimisedBubbleSort {
    public static void bubbleSort(int [] a){
        int n=a.length;
        boolean swap;
        for(int i=0; i<=n-2; i++){
            swap=false;
            for(int j=0; j<=n-2-i; j++){
                if(a[j+1]<a[j]){
                    int temp;
                    temp=a[j+1];
                    a[j+1]= a[j];
                    a[j]=temp;
                    swap = true;
                }
//                If the values in inner for loop is swapped then swap will
//                be false, hence we do not need to continue the process
//                because the array is already swapped
                if(swap==false)
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={4,5,3,1,2};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
