package JavaDSA;


import JavaDSA.Java_10_LinkedLists.Java_124_OperationsInLL;
import JavaDSA.Java_10_LinkedLists.Java_129_QZigZagLL;

public class Practice {
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
    public static int count;

    public void addFirst(int data){
        Node newNode = new Node(data);
        count++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        count++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int index, int data){
        Node newNode= new Node(data);
        count++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        int i=0;
        Node temp = head;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next= newNode;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

    }
}


