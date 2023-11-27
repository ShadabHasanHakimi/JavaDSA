package JavaDSA.Java_12_Queue.Java_02_Deque;

import java.util.*;

public class Java_150_DequeBasics {
//    Deque and Dequeue are two different things.
//    Deque is Double Ended Queue and Dequeue is the process of removing
//    elements from the queue.

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        System.out.println("First el = "+deque.getFirst());
        System.out.println("Last el = "+deque.getLast());
    }
}
