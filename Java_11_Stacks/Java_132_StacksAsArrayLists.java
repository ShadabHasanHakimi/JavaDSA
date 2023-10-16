package JavaDSA.Java_11_Stacks;

import java.util.ArrayList;

public class Java_132_StacksAsArrayLists {
    static class Stacks{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.isEmpty();
        }

//        push
        public static void push(int data){
            list.add(data);
        }

//        pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

//        peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
