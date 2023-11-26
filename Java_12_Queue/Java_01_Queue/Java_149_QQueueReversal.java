package JavaDSA.Java_12_Queue.Java_01_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Java_149_QQueueReversal {
//    We will reverse a queue using a stack
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for(int i=0; i<size; i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
