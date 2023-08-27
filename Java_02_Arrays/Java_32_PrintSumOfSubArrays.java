public class Java_32_PrintSumOfSubArrays {
    public static void printSubArraysSum(int[] a){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int sum=0;
                System.out.print("(");
                for(int k=i; k<=j; k++){
                    sum+=a[k];
                    System.out.print(" "+a[k]+" ");
                }
                System.out.print(")= "+sum+"  ");

                if(sum<min){
                    min=sum;
                }
                if(sum>max){
                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Min sum = "+min);
        System.out.println("Max sum = "+max);
    }

    public static void main(String[] args) {
        int [] arr={1,-2,6,-1,3};
        printSubArraysSum(arr);
    }
}
