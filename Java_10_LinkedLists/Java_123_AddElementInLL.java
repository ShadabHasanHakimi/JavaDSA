package JavaDSA.Java_10_LinkedLists;

public class Java_123_AddElementInLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
//    Adding at first Position
    public void addFirst(int data){
//        Step1 : create new node
        Node newNode = new Node(data);
//        if ll is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
//        Step2 : newNode next = head;
        newNode.next = head;        //Link

//        Step3 : head=newNode
        head = newNode;
    }
//    TC for addFirst() is O(1)


//    Adding at last Position
    public void addLast(int data){
        Node newNode = new Node(data);
//        if ll is empty
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
//    TC for addLast() is O(1)

    public static void main(String[] args) {
        Java_123_AddElementInLL ll = new Java_123_AddElementInLL();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
