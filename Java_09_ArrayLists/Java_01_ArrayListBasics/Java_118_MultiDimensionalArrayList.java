package JavaDSA.Java_09_ArrayLists.Java_01_ArrayListBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_118_MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);
//        Now our mainList contains two ArrayLists

//        Printing multidimensional ArrayLists
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
//        or
        System.out.println(mainList);
    }
}
