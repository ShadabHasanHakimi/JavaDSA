package JavaDSA.Java_11_Stacks;

import java.util.Stack;

public class Java_139_QDublicateParentheses {
    public static boolean isDuplicate(String eq){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<eq.length(); i++){
            int count = 0;
//            if '(' is found
            if(eq.charAt(i) == ')'){
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                s.pop();
                if(count < 1){
                    return true;
                }
            }
//            if any other char is found
            else{
                s.push(eq.charAt(i));
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String eq = "((a+b))";
        System.out.println(isDuplicate(eq));
    }
}
//TC : O(n)
