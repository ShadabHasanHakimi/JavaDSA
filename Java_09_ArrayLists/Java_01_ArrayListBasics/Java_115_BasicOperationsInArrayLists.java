package JavaDSA.Java_09_ArrayLists.Java_01_ArrayListBasics;

import java.util.ArrayList;
public class Java_115_BasicOperationsInArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

//        Operations
//        1. Add Operation
        list.add(1);        //TC = O(1)
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);

//        2. Get Operations
        int element = list.get(2);      //TC = O(1)
        System.out.println(element);

//        3. Remove/Delete Operation
        list.remove(2);         //TC = O(n)
        System.out.println(list);

//        4. Set Operation  (used to set a new element at an index)
        list.set(1, 3);         //TC = O(n)
        System.out.println(list);

//        5. Contains Element Operation
        System.out.println(list.contains(5));
        System.out.println(list.contains(2));

//        Adding an element at a given index
//        Using this operation new element will be added to the given index and remaining elements will shift respectively
        list.add(1, 6);     //TC = O(n)
        System.out.println(list);
    }
}
