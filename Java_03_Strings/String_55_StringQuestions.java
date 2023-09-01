package JavaDSA.Java_03_Strings;

import java.util.Arrays;

public class String_55_StringQuestions {
//    question number 1 : count the occurrences of small vowels
    public static int question1(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
        }
        return count;
    }

//    question number 5 : Determine if two strings are anagrams of each other
    public static void anagrams(String str1, String str2){
//        Converting to lower case so that we dont have to check for lower and upper case seperately
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

//        Checking whether the length of both the strings are equal or not
        if(str1.length()==str2.length()){
//            Converting both the strings to char array for comparing
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

//            Sorting both the char arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

//            Checking the equality
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println("Given Strings are not anagrams of each other!!!");
                    return;
                }
            }
            System.out.println("Given string are anagrams of each other!!!");
        }
        else {
            System.out.println("Given strings are not anagrams of each other");
            return;
        }
    }

    public static void main(String[] args) {
//        String str="a em nioy uz";
//        System.out.println(question1(str));

        String str1="Race", str2="cAre";
        anagrams(str1, str2);
    }
}
