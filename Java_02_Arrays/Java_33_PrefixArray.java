//Prefix array is an array which stores sum of sub arrays of a given
//array.
public class Java_33_PrefixArray {
    public static int prefixArray(int[] a){
        int[] prefix = new int[a.length];
        prefix[0] = a[0];
//        Finding prefix array of the given array
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){      // One for is reduced due to use of prefix array
                sum= i==0 ? prefix[i] : prefix[j]-prefix[i-1];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr= {1,-2,6,-1,3};
        System.out.println(prefixArray(arr));
    }
}
