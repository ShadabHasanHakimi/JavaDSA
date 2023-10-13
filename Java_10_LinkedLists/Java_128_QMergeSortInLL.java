package JavaDSA.Java_10_LinkedLists;

public class Java_128_QMergeSortInLL {
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

    public int removeFirst(){
        if(head == null){
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        } else if(head == tail){
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
        if(head == null){
            System.out.println("LL is already empty!!!");
            return Integer.MIN_VALUE;
        }else if(head == tail){
            int val = tail.data;
            head = tail = null;
            count=0;
            return val;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = temp.next.data;
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

    public void reverse(){
        if(head == null){
            System.out.println("LL is empty!!!");
            return;
        }
        Node curr = tail = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void delete(int n){
        if(head == null){
            System.out.println("LL is already empty!!!");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        int size =0;
        Node temp =head;
        while(temp!= null){
            temp=temp.next;
            size++;
        }

        if(n==size){        // If we want to delete first element
            head = head.next;
            count--;
            return;
        }

        Node prev=head;
        int i=1;
        while(i!=size-n){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        count--;
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

    public Node merge(Node lHead, Node rHead){
        Node mergeLL = new Node(-1);        //This will be the sorted LL
        Node temp = mergeLL;        //Head of sorted LL

        while(lHead!=null && rHead!=null){
            if(lHead.data <= rHead.data){
                temp.next = lHead;
                lHead=lHead.next;
                temp = temp.next;
            }
            else{
                temp.next = rHead;
                rHead = rHead.next;
                temp = temp.next;
            }
        }

//For remaining elements after one of the half is fully sorted
        while(lHead!=null){
            temp.next = lHead;
            lHead=lHead.next;
            temp = temp.next;
        }
        while(rHead!=null){
            temp.next = rHead;
            rHead = rHead.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node lHead){
        if(lHead == null || lHead.next == null){
            return lHead;
        }
//        Step 1: Find mid
        Node mid = findMid(lHead);
//        Step 2: call merge sort for left and right half
        Node rHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(lHead);
        Node newRight = mergeSort(rHead);
//        merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        Java_128_QMergeSortInLL LL = new Java_128_QMergeSortInLL();
        LL.addFirst(1);
        LL.addLast(4);
        LL.addFirst(6);
        LL.addLast(2);
        LL.addFirst(5);
        LL.print();

        head = LL.mergeSort(head);

        LL.print();
    }
}
