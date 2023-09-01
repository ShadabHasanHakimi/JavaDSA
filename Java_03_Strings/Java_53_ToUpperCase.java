package JavaDSA.Java_03_Strings;

public class Java_53_ToUpperCase {
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
                    // Second condition in if will check whether
//            there is a word after space or space is the last word
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
//    TC: O(n)

    public static void main(String[] args) {
        String str="  hello My name is shadab Hasan hakimi  ";
        System.out.println(toUpperCase(str));
    }
}
