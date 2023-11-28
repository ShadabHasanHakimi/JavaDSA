package JavaDSA.Java_12_Queue.Java_02_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Java_151_StackAndQueueUsingDeque {
    static class Stack{
        static Deque<Integer> dq = new LinkedList<>();
        public static boolean isEmpty(){
            if(dq.isEmpty()){
                return true;
            }
            return false;
        }
        public static void push(int data){
            dq.addLast(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            return dq.removeLast();
        }
        public static int peek(){
            return dq.getLast();
        }
    }

    static class Queue{
        static Deque<Integer> dq = new LinkedList<>();
        public static boolean isEmpty(){
            if(dq.isEmpty()){
                return true;
            }
            return false;
        }
        public static void add(int data){
            dq.addLast(data);
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            return dq.removeFirst();
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println();
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
