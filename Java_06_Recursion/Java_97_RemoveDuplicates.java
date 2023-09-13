package JavaDSA.Java_06_Recursion;

public class Java_97_RemoveDuplicates {
    public static String removeDuplicates(String s, int idx, StringBuilder ans, boolean[] map){
        if(idx == s.length()){
            return ans.toString();
        }

//        'a' - 'a' =0 ; 'b' - 'a' =1 ; 'c' - 'a' =2 ; 'z'-'a' =25
        int currChar=(int)s.charAt(idx), end=(int)('a');

        if(map[currChar-end]==false){
            ans.append(s.charAt(idx));
            map[currChar-end]=true;
            removeDuplicates(s, idx+1, ans, map);
        }

        removeDuplicates(s,idx+1, ans, map);
        return ans.toString();
    }

    public static void main(String[] args) {
        StringBuilder ans=new StringBuilder();
        boolean[] map=new boolean[26];
        String s="shadabhasanhakimi";
        System.out.println(removeDuplicates(s, 0, ans, map));
    }
}
