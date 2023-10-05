package JavaDSA.Java_10_LinkedLists;

public class Java_125_QCheckIfLLIsPalindrome {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // +1
            fast = fast.next.next;      // +2
        }
        return slow;
    }

//    public void reverse(Node curr){
//        Node prev = null;
//        Node next = curr.next;
//        while(curr == tail){
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            next = next.next;
//        }
//    }
//
//    public boolean compare(){
//        Node first=head, last=tail;
//        while(last != null){
//            if(first.data!=last.data){
//                return false;
//            }
//            first = first.next;
//            last = last.next;
//        }
//        return true;
//    }

    public boolean isPalindrome(){
//        Base condition
        if(head == null || head.next==null){
            return true;
        }
        // step 1 : find mid
        Node midNode = findMid(head);
        // step 2 : reverse 2nd half
        Node prev = null, curr = midNode, next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;      // right half head because curr in null
        Node left = head;

        // step 3 : check left and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Java_125_QCheckIfLLIsPalindrome LL = new Java_125_QCheckIfLLIsPalindrome();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(2);
        LL.addLast(1);

        System.out.println(LL.isPalindrome());
    }
}
