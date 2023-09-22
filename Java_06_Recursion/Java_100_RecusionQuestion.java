package JavaDSA.Java_06_Recursion;

public class Java_100_RecusionQuestion {
//    Question 1
//    public static void question1(int[] arr, int key, int N){
//        if(N==arr.length){
//            return;
//        }
//        if(arr[N]==key){
//            System.out.print(N);
//        }
//        question1(arr, key, N+1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr={3,2,4,5,6,2,7,2,2};
//        question1(arr,2,0);
//    }


//    Question 2
//    public static void question2(int num){
//        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        if(num==0){
//            return;
//        }
//        int lastDigit = num%10;
//        question2(num/10);
//        System.out.print(digits[lastDigit]+" ");
//    }
//
//    public static void main(String[] args) {
//        question2(20);
//    }


//    Question 3

//    public static int question3(String str){
//        if(str.length()==0){
//            return 0;
//        }
//        return question3(str.substring(1))+1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(question3("abcde"));
//    }


//    question 4
//    public static int question4(String str, int i, int j, int n){
//        if(n==1){
//            return 1;
//        }
//        if(n<=0){
//            return 0;
//        }
//        int res= question4(str,i+1, j, n-1)+
//                question4(str, i, j-1, n-1)-
//                question4(str, i+1, j-1, n-2);
//        if(str.charAt(i)==str.charAt(j)){
//            res++;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        String str="abcab";
//        int i=0, n=str.length(), j=n-1;
//        System.out.println(question4(str, i, j, n));
//    }


//    Tower Of Hanoi Puzzle
//    Question 5

//    Rules:
//    1. Only one disk transferred in one step
//    2. Smaller disks are always kept on top of larger disks
    public static void towerOfHanoi(int disks, String src, String helper, String dest){
//        Base condition : if number of disks becomes to zero, then transfer the last disk to destination
        if(disks==1){
            System.out.println("Disk "+disks+" transferred from "+src+" to "+dest);
            return;
        }
//        dest->helper and helper->destination
        towerOfHanoi(disks-1, src, dest, helper);
        System.out.println("Disk "+disks+" transferred from "+src+" to "+dest);
//        src->helper and helper->dest and dest->src
        towerOfHanoi(disks-1, helper, dest, src);
    }

    public static void main(String[] args) {
        int d=3;
        towerOfHanoi(d, "S", "H", "D");
    }
}
