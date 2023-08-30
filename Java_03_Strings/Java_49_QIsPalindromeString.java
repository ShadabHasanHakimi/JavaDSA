package JavaDSA.Java_03_Strings;

public class Java_49_QIsPalindromeString {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Given string is not a palindrome!!!");
                return false;
            }
        }
        System.out.println("Given string is a palindrome!!!");
        return true;
    }
//    TC: O(n)

    public static void main(String[] args) {
        String str="racecar";
        isPalindrome(str);
    }
}
