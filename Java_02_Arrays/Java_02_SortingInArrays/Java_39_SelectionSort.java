package JavaDSA.Java_02_Arrays.Java_02_SortingInArrays;

public class Java_39_SelectionSort {
    public static void selectionSort(int[] a){
        int n=a.length;
        for(int i=0; i<n-1; i++){       //Loop is upto second last element because there is no need to compare last element
            int minPos=i;
//            Second loop is upto last element because every element should be compared to every element of the array
            for(int j=i+1; j<n; j++){
                if(a[minPos]>a[j]){
//                    Now, minPos holds the position of element which is less than a[i]
                    minPos=j;
                }
            }
//            Swapping outside the loop for reducing time
            int temp=a[minPos];
            a[minPos] = a[i];
            a[i]=temp;
        }
    }
//    Time complexity : O(n^2)

    public static void main(String[] args) {
        int [] a = {2,7,4,3,6,1,9,5,8};
        selectionSort(a);
        for(int element:a){
            System.out.print(element);
        }
    }
}
