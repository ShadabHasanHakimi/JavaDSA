package JavaDSA.Java_09_ArrayLists.Java_02_ArrayListQuestions;

import java.util.ArrayList;

//For given n lines on x-axis, use 2 lines to form a container such that it
//holds maximum water
public class Java_119_ContainerWithMostWater {
//    brute force approach
//    TC = O(n^2)
    public static int findMax(ArrayList<Integer> container){
        int water=Integer.MIN_VALUE;
        for(int i=0; i<container.size(); i++){
            for(int j=i+1; j<container.size(); j++){
                if(water < Math.min(container.get(i), container.get(j))*(j-1)){
                    water=Math.min(container.get(i), container.get(j))*(j-1);
                }
            }
        }
        return water;
    }

//    Two pointer approach
    public static int maxWater(ArrayList<Integer> container){
        int maxWater = 0;
        int lP=0;
        int rP=container.size()-1;
        while(lP<rP){
//            calculate water area
            int currWater = Math.min(container.get(lP), container.get(rP))*(rP-lP);
            maxWater = Math.max(currWater, maxWater);

//            update ptr with smaller height
            if(container.get(lP)<container.get(rP)){
                lP++;
            }
            else{
                rP--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> container=new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);
        System.out.println(maxWater(container));
    }
}
