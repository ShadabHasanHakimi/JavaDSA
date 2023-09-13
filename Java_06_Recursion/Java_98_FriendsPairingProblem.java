package JavaDSA.Java_06_Recursion;

//Given n friends, each one can remain single or can be paired up with some other friend.
//Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
public class Java_98_FriendsPairingProblem {
    public static int friendsPair(int n){
        if(n==1 || n==2){
            return n;
        }

//        int singlePair = friendsPair(n-1);
//        int doublePair = friendsPair(n-2);
//
//        int doublePairWays = (n-1)*doublePair;
//
//        int totalPair = singlePair+doublePairWays;
//
//        return totalPair;

//        or

        return friendsPair(n-1)+(n-1)*friendsPair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPair(4));
    }
}
