package JavaDSA.Java_05_Oops.Java_03_Inheritance;

public class Java_78_FunctionOverriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();    //Function of child class will be called if object is of child class
    }
}
class Aml{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Deer extends Aml{
    void eat(){
        System.out.println("Eats grass");
    }
}
