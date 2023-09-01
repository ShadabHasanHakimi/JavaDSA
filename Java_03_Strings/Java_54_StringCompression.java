package JavaDSA.Java_03_Strings;

public class Java_54_StringCompression {
    public static String stringCompression(String str){
        StringBuilder sb=new StringBuilder("");
        char ch;
        for(int i=0; i<str.length(); i++){
            int count=1;
            ch=str.charAt(i);
            while(i<str.length()-1 && ch==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="aaabbbbccddddeeeeeeeffg";
        System.out.println(stringCompression(str));
    }
}
