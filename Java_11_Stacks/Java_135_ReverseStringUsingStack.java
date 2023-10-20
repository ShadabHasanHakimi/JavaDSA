package JavaDSA.Java_11_Stacks;

import java.util.Stack;

public class Java_135_ReverseStringUsingStack {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder();
        while(!s.isEmpty()){
            res.append(s.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String rev = reverse(str);
        System.out.println(rev);
    }
}
