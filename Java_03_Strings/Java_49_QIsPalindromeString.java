package JavaDSA.Java_03_Strings;

public class Java_49_QIsPalindromeString {
//    public static boolean isPalindrome(String str){
//        for(int i=0; i<str.length()/2; i++){
//            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//                System.out.println("Given string is not a palindrome!!!");
//                return false;
//            }
//        }
//        System.out.println("Given string is a palindrome!!!");
//        return true;
//    }

//    More good approach
    public static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
        s=s.toLowerCase();
        sb.append(s.replaceAll("[^a-z0-9]", ""));
        s=sb.toString();
        // s=s.replaceAll("[^a-z0-9]", "");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
//    TC: O(n)

    public static void main(String[] args) {
        String str="r ace car";
        System.out.println(isPalindrome(str));
    }
}
