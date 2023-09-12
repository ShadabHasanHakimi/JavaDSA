package JavaDSA.Java_06_Recursion;

public class Java_92_FindFirstOccurence {
    public static int firstOccurence(int[] n, int key, int idx){
        if(n[idx]==key){
            return idx;
        }
        else if(idx==n.length-1){
            return -1;
        }
        return firstOccurence(n, key, idx+1);
    }
//    TC: O(n)

    public static void main(String[] args) {
        int[] n={8,3,6,9,5,4,2,5,3};
        System.out.println(firstOccurence(n, 4, 0));
    }
}
