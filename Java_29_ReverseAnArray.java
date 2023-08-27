public class Java_29_ReverseAnArray {
    public static void reverse(int[] a){
        int first=0, last=a.length-1, temp;
        while(first<last){
            temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first = first+1;
            last = last-1;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,12,5,6,11,19};
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
