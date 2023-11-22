package JavaDSA.Java_12_Queue;

public class Java_143_QueueUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!!");
                return -1;
            }
            int front = head.data;
            if(head == tail){       // if there is only one element
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){       // printing queue elements
            System.out.println(q.peek());
            q.remove();
        }
    }
}
