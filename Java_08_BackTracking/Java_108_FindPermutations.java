package JavaDSA.Java_08_BackTracking;

//We will be given a string and we have to find all the permutations of that string
//For eg:
//Given string = "abc"
//Permutations = abc, acb, bac, bca, cab, cba (Total 6)
//Note : A String of length n will have n!(Factorial of n) Permutations
public class Java_108_FindPermutations {
    public static void findPermutations(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
//            Removing the ith character which is already chosen
            String newStr=str.substring(0, i)+str.substring(i+1);
//            Recursive call
            findPermutations(newStr, ans+curr);
        }
    }
//   TC: O(n*n!)

    public static void main(String[] args) {
        String str="abc";
        findPermutations(str, "");
    }
}
