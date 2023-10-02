package JavaDSA.Java_10_LinkedLists;

public class Java_124_OperationsInLL {
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
//    For counting the size of LL
    public static int count;
//    Adding at first Position
    public void addFirst(int data){
//        Step1 : create new node
        Node newNode = new Node(data);
        count++;
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
        count++;
//        if ll is empty
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
//    TC for addLast() is O(1)


//    Adding at any index
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

//    Printing a LL
    public void print(){
//        Making a new reference variable temp and traversing it through
//        the LL
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


//    Removing a node at first position
    public int removeFirst(){
//        If linked list is empty
        if(head == null){       // or count == 0
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        } else if(head == tail){        // If LL have only one element
            int val = head.data;
            head = tail = null;
            count=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        count--;

        return val;
    }

    public int removeLast(){
        if(head == null){       // or count==0
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        }else if(head == tail){
            head = tail = null;
            int val = tail.data;
            count=0;
            return val;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = temp.next.data; // or tail.data
        count--;
        temp.next = null;
        tail=temp;

        return val;
    }

    public int search(int key){
        if(count == 0){
            System.out.println("LL is empty!!!");
            return -1;
        }
        int i=0;
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }

    public int helper(Node temp, int key){
        if(temp==null){
            return -1;
        }
        if(temp.data==key){
            return 0;
        }
        int idx = helper(temp.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String[] args) {
        Java_124_OperationsInLL ll = new Java_124_OperationsInLL();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.add(2,6);

        ll.removeFirst();

        ll.removeLast();

        ll.print();

        System.out.println(count);

        System.out.println("Key found at "+ll.search(5+1));

        System.out.println(ll.recSearch(3));
    }
}
