package JavaDSA.Java_03_Sorting;

public class Java_42_BasicSortingQuestion {
//    Q) Use bubble, selection, insertion and counting sort to sort the following array :
//    [3,6,2,1,8,7,4,5,3,1]

    public static void printArray(int []a){
        for(int element: a){
            System.out.print(element+" ");
        }
    }

//    Bubble sort
    public static void bubbleSort(int []a){
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j+1]>a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void selectionSort(int [] a){
        for(int i=0; i<a.length; i++){
            int maxPos=i;
            for(int j=i+1; j<a.length; j++){
                if(a[maxPos]<a[j]){
                    maxPos=j;
                }
            }
            int temp=a[maxPos];
            a[maxPos]=a[i];
            a[i]=temp;
        }
    }

    public static void insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]<curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }

    public static void countingSort(int[] a){
        int range=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            range=Math.max(range, a[i]);
        }
        int[] count= new int [range+1];
        for(int j=0; j<a.length; j++){
            count[a[j]]++;
        }
        int k=0;
        for(int l=count.length-1; l>=0; l--){
            while(count[l]>0){
                a[k]=l;
                k++;
                count[l]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        printArray(arr);
    }
}
