package JavaDSA;

public class Java_02_Ternary_Operator {
    public static void main(String[] args) {
//        To check greatest number
        int a;
        a = (5>7)?5:7;
        System.out.println(a);

//        To check even number
        int num=7;
        String type = (num%2 == 0)?"Even":"Odd";
        System.out.println(type);
    }
}
