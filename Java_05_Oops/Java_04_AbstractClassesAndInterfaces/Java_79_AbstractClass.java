package JavaDSA.Java_05_Oops.Java_04_AbstractClassesAndInterfaces;


public class Java_79_AbstractClass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c=new Chicken();
        c.eat();
        c.walk();

//        Animal a=new Animal();  //We cannot create objects/instance of Abstract classes
    }
}
abstract class Animal{
    String color;
    Animal(){       //We can create Constructors of Abstract Classes
        color="Brown";
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();   //Abstract methods do not have implementation
//    Implementation of abstract methods is defined by its derived classes
}

class Horse extends Animal{
    Horse(){    //First constructor of Base class is called then Derived Class
        color="Black";
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }
}
