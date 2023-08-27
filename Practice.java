public class Practice {
    public static void bubbleSort(int [] a){
        int n=a.length;
        for(int i=0; i<=n-2; i++){
            int swap=0;
            for(int j=0; j<=n-2-i; j++){
                if(a[j+1]<a[j]){
                    int temp;
                    temp=a[j+1];
                    a[j+1]= a[j];
                    a[j]=temp;
                    swap++;
                }
            }
            System.out.println(swap);
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
