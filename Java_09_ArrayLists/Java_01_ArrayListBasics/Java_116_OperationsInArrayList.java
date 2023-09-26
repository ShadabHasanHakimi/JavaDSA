package JavaDSA.Java_09_ArrayLists.Java_01_ArrayListBasics;

import java.util.ArrayList;
public class Java_116_OperationsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

////        Size of an ArrayList
//        System.out.println(list.size());
//
////        Printing the ArrayList
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i)+" ");
//        }
//        System.out.println();

//        Printing reverse of an ArrayList
//        TC = O(n)
//        for(int i=list.size()-1; i>=0; i--){
//            System.out.println(list.get(i));
//        }

//        find maximum in an arraylist
//        TC = O(n)
        int max= Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("Maximum Element is " +max);
    }
}
