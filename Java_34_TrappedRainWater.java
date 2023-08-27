public class Java_34_TrappedRainWater {
    public static void trappedRainWater(int[] h){
        //Time complexity will depend on the number
        //of heights given (TC=O(n))
        int n=h.length;
//        1. Calculate left max auxiliary array
        int[] leftMax = new int[n];
        leftMax[0]=h[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(h[i], leftMax[i-1]);
        }
//        2. Calculate right max auxiliary array
        int[] rightMax = new int[n];
        rightMax[n-1]=h[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(h[i], rightMax[i+1]);
        }
//        3. Calculate water level and trapped water
//        Water level = min of leftmax and rightmax
//        trapped water = water level - height
        int wl, tw=0;
        for (int j=0; j<n; j++){
            wl=(Math.min(leftMax[j], rightMax[j]));
            tw+=wl-h[j];
        }
        System.out.println("Total trapped water : "+tw);
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        trappedRainWater(height);
    }
}
