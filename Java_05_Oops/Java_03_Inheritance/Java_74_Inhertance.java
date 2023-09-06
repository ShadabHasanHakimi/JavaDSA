package JavaDSA.Java_05_Oops.Java_03_Inheritance;
//Also an example of single level Inheritance
public class Java_74_Inhertance {
    public static void main(String[] args) {
        Fish shark= new Fish();
        shark.eat();    //Now we can call functions of Parent class using objects of base class
    }
}

//Parent Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
