package JavaDSA.Java_08_BackTracking;

//We will be given a string, and we have to find subsets of the given string
//using backtracking
//For eg: Given string = "abc"
//Susets or output will be = a, b, c, ab, bc, ac, abc, " " or null or empty set
//Total subsets = 8

/*If length of the given string is n then there can be total of 2^n subsets*/
public class Java_107_FindSubsets {
    public static void findSubsets(String str, String ans, int i){
        if(i==str.length()){
            if(ans.isEmpty()){
                System.out.println("NULL");
                return;
            }
            else {
                System.out.println(ans);
                return;
            }
        }
//        Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
//        No choice
        findSubsets(str, ans, i+1);
    }
//    TC= O(n)*O(2^n)   Because we have 2^n elements and n time is required to find 1 subset
//      = O(n*2^n)

    public static void main(String[] args) {
        String str="abc";
        findSubsets(str, "", 0);
    }
}
