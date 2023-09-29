package JavaDSA.Java_09_ArrayLists.Java_02_ArrayListQuestions;

import java.util.ArrayList;
//Find if sum of two elements is equal to target or not in a sorted rotated
//List

public class Java_121_PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp=-1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp = bp+1;  //smallest element
        int rp = bp;    //Largest element
        int n = list.size();
        while(lp != rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp) <target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
//        sorted and rotated list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        pairSum2(list, 16);
    }
}
