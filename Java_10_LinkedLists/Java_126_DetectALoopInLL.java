package JavaDSA.Java_10_LinkedLists;

import java.security.PublicKey;

public class Java_126_DetectALoopInLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

//    Detect a Loop
//    floyd's cycle finding algo
    public static boolean detectLoop(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){       // condition for checking cycle
                return true;
            }
        }
        return false;
    }

//    Remove a Loop
    public static void remLoop(){
//        Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                return;
            }
        }
        if(cycle == false){
            return;
        }

//        Find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

//        Remove cycle
        prev.next = null;
        System.out.println("Done");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);     // cycle
        head.next.next.next.next = head.next;
        System.out.println(detectLoop());
        remLoop();
        System.out.println(detectLoop());
    }
}
