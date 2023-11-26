package JavaDSA.Java_12_Queue.Java_01_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Java_147_QFirstNonRepeating {
    public static void nonRepeating(String s){
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1 + " ");
            }
            else{
                System.out.println(q.peek()+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "aabccxb";
        nonRepeating(s);
    }
}
