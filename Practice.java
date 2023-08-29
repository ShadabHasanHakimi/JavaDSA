package JavaDSA;

public class Practice {
    public static boolean stairCaseSearch(int [][]matrix, int key){
        int i=0, j=matrix[0].length-1;
        while(i<=matrix.length && j>=0){
            if(key<matrix[i][j]){
                j--;
            }
            else if(key>matrix[i][j]){
                i++;
            }
            else{
                System.out.println("Element found at index : ("+i+", "+j+")");
                return true;
            }
        }
        System.out.println("Element not found!!!");
        return false;
    }


}
