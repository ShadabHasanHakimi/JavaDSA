package JavaDSA.Java_12_Queue.Java_01_Queue;
import java.util.*;

public class Java_144_QueueUsingJavaCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();      // ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
