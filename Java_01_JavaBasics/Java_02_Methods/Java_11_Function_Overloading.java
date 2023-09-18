package JavaDSA.Java_01_JavaBasics.Java_02_Methods;

public class Java_11_Function_Overloading {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a=3, b=29, c=9;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}
