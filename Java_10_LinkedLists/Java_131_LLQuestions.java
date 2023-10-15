package JavaDSA.Java_10_LinkedLists;

public class Java_131_LLQuestions {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int count;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        count++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        count++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public void add(int index, int data) {
        Node newNode = new Node(data);
        count++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            count = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        count--;

        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int val = tail.data;
            head = tail = null;
            count = 0;
            return val;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = temp.next.data;
        count--;
        temp.next = null;
        tail = temp;

        return val;
    }

//    Question 2
    public Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while(temp!=null){
                if(temp == head2){
                    return temp;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

//    Question 2
    public void deleteNAfterM(int m, int n){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            int a=0, b=0;
            Node tempm = temp;

            while(a!=m-1){  //Reaching to m-1 node
                tempm = tempm.next;
                a++;
            }

            Node tempn = tempm;
            while(b!=n){    // Reaching to nth node after m-1 nodes
                tempn = tempn.next;
                b++;
            }

            tempm.next = tempn.next;    // Deleting the nodes

            temp = tempm.next;
        }

    }

    public static void main (String[]args){
//        Java_131_LLQuestions list = new Java_131_LLQuestions();
//        Node head1, head2;
//        head1 = new Node(10);
//        head2 = new Node(3);
//        Node newNode = new Node(6);
//        head2.next = newNode;
//        newNode = new Node(9);
//        head2.next.next = newNode;
//        newNode = new Node(15);
//        head1.next = newNode;
//        head2.next.next.next = newNode;
//        newNode = new Node(30);
//        head1.next.next = newNode;
//        head1.next.next.next = null;
//
//        Node intersectionPoint = list.getIntersectionNode(head1, head2);
//        if (intersectionPoint == null) {
//            System.out.print(" No Intersection Point \n");
//        } else {
//            System.out.print("Intersection Point: "
//                    + intersectionPoint.data);


        Java_131_LLQuestions ll = new Java_131_LLQuestions();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);

        ll.print();
        ll.deleteNAfterM(3,2);
        ll.print();
    }
}

