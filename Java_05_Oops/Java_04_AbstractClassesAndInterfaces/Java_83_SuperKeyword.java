package JavaDSA.Java_05_Oops.Java_04_AbstractClassesAndInterfaces;

public class Java_83_SuperKeyword {
    public static void main(String[] args) {
        Horses h=new Horses();
    }
}
class Animals{
    Animals(){
        System.out.println("Animals constructor is called");
    }
}
class Horses extends Animals{
    Horses(){
        super();    //constructor of immediate parent class will be called
        System.out.println("Horse constructor is called");
    }
}
