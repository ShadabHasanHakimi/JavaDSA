package JavaDSA.Java_11_Stacks;

import java.util.Stack;

public class Java_137_QNextGreaterElement {
    public static int[] nextGreater(int[] elements){
        int[] nextGreater = new int[elements.length];
        Stack<Integer> stack = new Stack<>();
        int i=elements.length-1;
        while(i>0){
            int j=elements.length-1;
            while(stack.isEmpty() && stack.peek()<=elements[j]){
                stack.pop();
                j--;
            }
            if(stack.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=elements[stack.peek()];
                stack.push(i);
            }
            i--;
        }
        return nextGreater;
    }

    public static void main(String[] args) {
        int[] elements = {6,8,0,1,3};
        int[] nextGreater = new int[elements.length];
        nextGreater = nextGreater(elements);
        for (int j : nextGreater) {
            System.out.println(j);
        }
    }
}
