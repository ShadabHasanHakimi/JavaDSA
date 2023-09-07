package JavaDSA.Java_05_Oops.Java_04_AbstractClassesAndInterfaces;

//Constructor chaining is the process of calling one constructor from another
//constructor with respect to current object.

//Constructor chaining can be done in two ways:
//Within same class: It can be done using this() keyword for constructors in the same class
//From base class: by using super() keyword to call the constructor from the base class.

//This process is used when we want to perform multiple tasks in a single
//constructor rather than creating a code for each task in a single
//constructor we create a separate constructor for each task and make their
//chain which makes the program more readable.
public class Java_84_ConstructorChaining {
    public static void main(String[] args) {
        Temp t=new Temp(6,7);
    }
}

class Temp{
    Temp(int x,int y){
        this(x);
        System.out.println(x*y);
    }
    Temp(int x){
        this();
        System.out.println(x);
    }
    Temp(){
        System.out.println("Default constructor");
    }
}
