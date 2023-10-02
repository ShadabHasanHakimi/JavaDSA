package JavaDSA.Java_09_ArrayLists.Java_02_ArrayListQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_122_ArrayListQuestions {
    public static ArrayList<Integer> isLonely(ArrayList<Integer> nums){
        int curr;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.size(); i++){
            curr = nums.get(i);
            int j=0;
            while(j<nums.size()){
                if(j==i){
                    j++;
                }
                else if(nums.get(j)==curr+1 || nums.get(j)==curr-1 || nums.get(j) == curr){
                    break;
                }
                else{
                    j++;
                }
            }
            if(j == nums.size()-1){
                ans.add(curr);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        System.out.println(isLonely(nums));
    }
}
