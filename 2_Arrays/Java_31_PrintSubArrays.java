public class Java_31_PrintSubArrays {
    public static void printSubArrays(int[] a){
        for(int i=0; i<a.length; i++){      // i is the starting index
            for(int j=i; j<a.length; j++){      // j is the ending index
                System.out.print("(");
                for(int k=i; k<=j; k++)     // k prints element from i(start) to j(end)
                    System.out.print(" "+a[k]+" ");
                System.out.print(")  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] arr= {2,4,6,8,10};
        printSubArrays(arr);
    }
}
