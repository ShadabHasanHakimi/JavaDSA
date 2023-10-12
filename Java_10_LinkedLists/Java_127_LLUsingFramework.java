package JavaDSA.Java_10_LinkedLists;

import java.util.LinkedList;
public class Java_127_LLUsingFramework {
    public static void main(String[] args) {
//            create
//    use Integer, Float instead of int, float, etc.
        LinkedList<Integer> ll = new LinkedList<>();

//    Adding
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
//        0->1->2

//        Printing
        System.out.println(ll);

//        Removing
        ll.removeLast();
        System.out.println(ll);
    }
}
