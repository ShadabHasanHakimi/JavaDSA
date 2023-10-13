package JavaDSA.Java_10_LinkedLists;

public class Java_130_DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void print(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

//    Reverse a doubly linked list
    public Node reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Java_130_DoublyLL dll = new Java_130_DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();
        System.out.println(size);
        head = dll.reverse();
        dll.print();
    }
}
