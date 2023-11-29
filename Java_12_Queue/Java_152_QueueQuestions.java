package JavaDSA.Java_12_Queue;

import java.util.*;

public class Java_152_QueueQuestions {
    public static void printBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- >0){
            String s1 = q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printBinary(n);
    }
}

