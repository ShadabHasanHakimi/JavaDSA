package JavaDSA.Java_05_Oops.Java_03_Inheritance;

public class Java_76_HeirarchialInheritance {
    public static void main(String[] args) {
        Human h=new Human();
        h.eats();
        h.talk();
    }
}
//Base Class
class A{
    String color;
    void eats(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Breathes");
    }
}
//Base class 1
class Bird extends A{
    void fly(){
        System.out.println("Fly");
    }
}
//Base class 2
class Human extends A{
    void talk(){
        System.out.println("Talks");
    }
}
//Base class 3
class Reptiles{
    void ColdBlood(){
        System.out.println("Cold Blooded");
    }
}
