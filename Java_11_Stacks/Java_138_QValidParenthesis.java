package JavaDSA.Java_11_Stacks;

import java.util.Stack;

public class Java_138_QValidParenthesis {
    public static boolean isValid(String parenthesis){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<=parenthesis.length()-1; i++){
            if(parenthesis.charAt(i)=='(' || parenthesis.charAt(i)=='{' || parenthesis.charAt(i)=='['){
                s.push(parenthesis.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(s.peek()=='(' && parenthesis.charAt(i)==')'){
                    s.pop();
                }
                else if(s.peek()=='{' && parenthesis.charAt(i)=='}'){
                    s.pop();
                }
                else if(s.peek()=='[' && parenthesis.charAt(i)==']'){
                    s.pop();
                }
                else
                    return false;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String parenthesis = "()";
        System.out.println(isValid(parenthesis));
    }
}
