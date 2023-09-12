package JavaDSA.Java_06_Recursion;

public class Java_93_FindLastOccurence {
    public static int lastOccur(int[] n, int key, int idx){
        if(n[idx]==key){
            return idx;
        }
        else if(idx==0){
            return -1;
        }
        return lastOccur(n, key, idx-1);
    }

    public static void main(String[] args) {
        int[] n={2,4,3,6,2,4,8,5,6,3};
        System.out.println(lastOccur(n, 3, n.length-1));
    }
}
