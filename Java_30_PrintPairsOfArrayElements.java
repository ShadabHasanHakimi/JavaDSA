public class Java_30_PrintPairsOfArrayElements {
    public static void printPairs(int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<=a.length-1;j++){
                System.out.print("("+a[i]+","+a[j]+")\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        printPairs(arr);
    }
}
