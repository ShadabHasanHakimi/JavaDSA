package JavaDSA.Java_02_Arrays;

public class Java_26_LinearSearch {
    public static int linearSearch(int[] numbers, int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {18, 12, 14, 3, 5, 6, 4, 16, 9};
        int key = 16;
        int result = linearSearch(a, key);
        if(result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key Found at index : "+result);

    }
}
