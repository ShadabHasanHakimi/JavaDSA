package JavaDSA.Java_10_LinkedLists;

//For a LL of the form L(1) -> L(2) -> L(3) ..... L(n-1) -> L(n)
//Convert it into a zigzag form i.3. : L(1) -> L(n) -> L(2) -> L(n-1) -> L(3) -> L(n-2)...
public class Java_129_QZigZagLL {
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

    private Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void zigZag(){
//        Step 1: Find mid
        Node mid = findMid(head);
//        Step 2: Reverse the LL
        Node rH = reverse(mid);
//        Step 3: ZigZag merge
        Node lH = head;
        Node nextL, nextR;
        while(lH!=null && rH!=null){
            nextL = lH.next;
            lH.next = rH;
            nextR = rH.next;
            rH.next = nextL;

            lH = nextL;
            rH = nextR;
        }
    }

    public static void main(String[] args) {
        Java_129_QZigZagLL LL = new Java_129_QZigZagLL();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.addLast(6);

        LL.print();
        LL.zigZag();
        LL.print();
    }
}
