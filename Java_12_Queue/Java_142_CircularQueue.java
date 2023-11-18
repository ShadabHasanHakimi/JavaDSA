package JavaDSA.Java_12_Queue;

import java.beans.PropertyEditorManager;
import java.util.Currency;

public class Java_142_CircularQueue {
    static class CircularQueue{
        static int[] arr;
        static int front;
        static int rear;
        static int size;
        CircularQueue(int n){
            arr = new int[n];
            size = n;
            rear = front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full!!!");
                return;
            }
            if(front == -1){
                front++;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){     // O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty!!!");
                return -1;
            }
            int element = arr[front];
            if(front == rear){
                front = rear = -1;
            }
            else
                front = (front+1)%size;
            return element;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!!");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);

        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(5);
        while (!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
