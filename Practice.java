package JavaDSA;

public class Practice {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Given string is not palindrome!!!");
                return false;
            }
        }
        System.out.println("Given string is palindrome!!!");
        return true;
    }

    public static void main(String[] args) {
        String str="noon";
        isPalindrome(str);
    }
}
