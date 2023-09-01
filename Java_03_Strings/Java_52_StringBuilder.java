package JavaDSA.Java_03_Strings;

public class Java_52_StringBuilder {
//    We use string builder because of immtable character of strings
//    StringBuilder can be changed without making new
//    then we can convert string builder into string
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
//    If we have used string instead of StringBuilder than the below
//    loop would have run n^2 times where n is the number of characters added
//    But as we know that string builder is non immutable that's why the loop
//    will only run n times with TC = O(n)
    for(char ch='a'; ch<='z'; ch++){
        sb.append(ch);      //It will add ch to end of sb
    }
//    TC when string builder is used = O(26)
//    TC when String is used = O(26*26)
    System.out.println(sb);
}
}
