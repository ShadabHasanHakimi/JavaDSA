package JavaDSA.Java_05_Oops.Java_03_Inheritance;

public class Java_77_FunctionOverloading {  //Compile time polymorphism
    public static void main(String[] args) {
        Calculator c=new Calculator();
//        Functions with same name but different return type of parameters
        System.out.println(c.sum(3,5));
        System.out.println(c.sum((float)3.2, (float)7.9));
        System.out.println(c.sum(2,5,4));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
