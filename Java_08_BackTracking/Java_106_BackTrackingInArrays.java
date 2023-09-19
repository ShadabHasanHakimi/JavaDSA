package JavaDSA.Java_08_BackTracking;

public class Java_106_BackTrackingInArrays {
    public static void printArr(int[] arr){
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void changeArr(int[] arr, int i, int val){
//        Base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
//        Recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
//        Backtracking step
        arr[i]=arr[i]-2;    //Decreasing the value of arr after calling recursive function
    }
    public static void main(String[] args) {
        int[] arr= new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
