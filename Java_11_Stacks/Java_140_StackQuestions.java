package JavaDSA.Java_11_Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class Java_140_StackQuestions {
//    Question 1
    public static boolean palindromeLinkedList(LinkedList<Character> l){
        if(l.isEmpty()){
            return true;
        }
        Stack<Character> s = new Stack<>();
//        if given ll is even
        if(l.size()%2 == 0){
            for(int i=0; i<l.size(); i++){
                char element = l.get(i);
                if(s.isEmpty()){
                    s.push(element);
                }
                else if(s.peek() == element){
                    s.pop();
                }
                else{
                    s.push(element);
                }
            }
        }
//        if given ll is odd
        else{
            for(int i=0; i<l.size(); i++){
                char element = l.get(i);
                if(i==l.size()/2){
                    continue;
                }
                if(s.isEmpty()){
                    s.push(element);
                }
                else if(s.peek() == element){
                    s.pop();
                }
                else{
                    s.push(element);
                }
            }
        }
        return s.isEmpty();
    }


    public static void main(String[] args) {
        LinkedList<Character> l = new LinkedList<>();
        l.addLast('A');
        l.addLast('B');
        l.addLast('C');
        l.addLast('B');
        l.addLast('A');
        System.out.println(palindromeLinkedList(l));
    }
}
