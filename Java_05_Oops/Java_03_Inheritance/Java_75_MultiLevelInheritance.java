package JavaDSA.Java_05_Oops.Java_03_Inheritance;

public class Java_75_MultiLevelInheritance {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eats();
        d1.legs = 4;
        System.out.println(d1.legs);
    }
}
class Animals{  //Base Class
    String color;
    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammals extends Animals{  //Derived class for Animals and Base class for Dog
    int legs;
}
class Dog extends Mammals{  //Derived class
    String breed;
}
