package JavaDSA.Java_12_Queue.Java_01_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*Given Sting : 1 2 3 4 5 6 7 8 9 10
* Output: 1 6 2 7 3 8 4 9 5 10*/
public class Java_148_QInterleave2Halves {
    public static Queue<Integer> interleave(Queue<Integer> q1){
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> res = new LinkedList<>();
        int size = q1.size();
//        for(int i=0; i<q1.size(); i++){     // This is wrong because the q1.size() will change after each loop due to removal of elemnents
        for(int i=0; i<q1.size(); i++){
            q2.add(q1.remove());
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            res.add(q2.remove());
            res.add(q1.remove());
        }
        return res;
    }

    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        Queue<Integer> res = interleave(q);
        while(!res.isEmpty()){
            System.out.print(res.remove()+" ");
        }
    }
}
