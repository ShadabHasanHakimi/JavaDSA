package JavaDSA.Java_03_Strings;

public class Java_51_StringBasics_2 {
//    Function substring
    public static String subString(String str, int si, int ei){
        String substr="";       // Initialising a empty substring
        for(int i=si; i<ei; i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
//        //        String Comparison
//        String s1="Tony", s2="Tony";
//        String s3=new String("Tony");
//
//        if(s1==s2){
//            System.out.println("true");
//        }
//
//        if(s1==s3){
//            System.out.println("true");
//        }
////        s1==s3 is false because new string method makes new string
////        at new address and s1 and s2 points to a same string that's
////        why address wise s1 and s3 are different
//        else
//            System.out.println("false");
//
////        To overcome above situation we use equals() method
//        if(s1.equals(s3)){
//            System.out.println("true");
//        }
//        else
//            System.out.println("false");

//        Function Substring
        String str="Hello World";
        System.out.println(subString(str, 2,7));
//        Inbuilt substring function
        System.out.println(str.substring(2,7));
    }
}
