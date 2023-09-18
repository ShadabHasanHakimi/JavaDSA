package JavaDSA.Java_07_DivideAndConquer;

public class Java_105_DivideAndConquerQuestions {
//    Question 1
    public static void question1(String[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
//        Partition
        int mid = si+(ei-si)/2;

        question1(arr, si, mid);
        question1(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(String[] arr, int si,int mid, int ei){
        String[] temp=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
    }

//    Question 2
//    if left and right is not equal then the below function counts
//    the number of the majority element
    public static int count(int[] nums, int num, int lo, int hi){
        int count=0;
        for(int i=lo; i<=hi; i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    public static int majorityElement(int[] nums, int lo, int hi){
        if(lo==hi){
            return nums[lo];
        }

        int mid= lo+(hi-lo)/2;
        int left=majorityElement(nums, lo, mid);
        int right=majorityElement(nums, mid+1, hi);

        if(left==right){
            return left;
        }
        int leftCount=count(nums, left, lo, hi);
        int rightCount=count(nums, right, lo, hi);
        return leftCount>rightCount?left:right;
    }
    public static int majorityElement(int[] nums){
        return majorityElement(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
//        String[] arr={"sum", "earth", "mars", "mercury"};
//        question1(arr, 0, arr.length-1);
//        for(String e: arr){
//            System.out.print(e+" ");
//        }

        int[] nums={2,2,1,1,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
