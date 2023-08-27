package JavaDSA;

public class Practice {
    public static void selectionSort(int []a){
        int n = a.length;
        for(int i=0; i<=n-1; i++){
            int minPos=i;
            for(int j=i+1; j<=n-1; j++){
                if(a[j]<a[minPos]){
                    minPos=j;
                }
            }
            int temp = a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        selectionSort(arr);
        for(int e: arr){
            System.out.print(e);
        }
    }
}
