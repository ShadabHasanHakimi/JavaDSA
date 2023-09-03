package JavaDSA.Java_04_BitManipulation.Java_03_BitManipulationQuestions;

public class Java_66_FastExponentiation {
    public static int fastExpo(int n, int p){
        int ans=1;
        while(n>0){
            if((p&1)!=0){       //Checking whether the LSB is 1 or not, if 1 then multiply
                ans=ans*n;
            }
            n=n*n;
            p=p>>1;
        }
        return ans;
    }

    /* 1st Loop:
    n=5, ans=1, p=011
    ans=1*5, n=5*5=25, p=001

    2nd Loop:
    n=25, ans=5, p=001
    ans=25*5=125, n=25*25=625, p=000

    Loop ends...
    We can see than we have calculated it in 2 loops,
    usually it takes 3 loops
     */

    public static void main(String[] args) {
        System.out.println(fastExpo(5,3));
    }
}
