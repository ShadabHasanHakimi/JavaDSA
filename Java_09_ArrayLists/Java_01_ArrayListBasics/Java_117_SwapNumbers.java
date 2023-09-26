package JavaDSA.Java_09_ArrayLists.Java_01_ArrayListBasics;

import java.util.ArrayList;

public class Java_117_SwapNumbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before Swapping : "+list);

        int idx1=1, idx2=3;     //Swap numbers of idx1 and idx2
        swap(list, idx1, idx2);
        System.out.println("Before Swapping : "+list);
    }
}
