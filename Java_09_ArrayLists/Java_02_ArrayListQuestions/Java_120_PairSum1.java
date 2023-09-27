package JavaDSA.Java_09_ArrayLists.Java_02_ArrayListQuestions;

import java.util.ArrayList;

public class Java_120_PairSum1 {
    public static boolean pairSum1(ArrayList<Integer> num, int target){
        int i=0;
        int j=num.size()-1;
        while(i<j){
            if(num.get(i)+num.get(j)==target){
                return true;
            }
            if(num.get(i)+num.get(j)<target)
                i++;
            else
                j--;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum1(list, 10));
    }
}
