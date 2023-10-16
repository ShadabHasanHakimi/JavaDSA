package JavaDSA.Java_11_Stacks;

import java.util.Stack;
public class Java_134_QPushAtBottomOfStack {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);

        int data = 1;
        pushAtBottom(s, data);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
