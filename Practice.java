package JavaDSA;


import java.util.Stack;

public class Practice {
    public static int[] nextG(int[] elements){
        int[] nextG = new int[elements.length];
        Stack<Integer> s = new Stack<>();
        s.push(elements.length-1);
        for(int i = elements.length-1; i>=0; i--){
            while(!s.isEmpty() && elements[s.peek()]>=elements[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i] = -1;
            }
            else
                nextG[i] = elements[s.peek()];
            s.push(i);
        }
        return nextG;
    }
    public static void main(String[] args) {
        int[] elements = {6,8,0,1,3};
        int[] nextGreater = new int[elements.length];
        nextGreater = nextG(elements);
        for (int j : nextGreater) {
            System.out.print(j+" ");
        }
    }
}


