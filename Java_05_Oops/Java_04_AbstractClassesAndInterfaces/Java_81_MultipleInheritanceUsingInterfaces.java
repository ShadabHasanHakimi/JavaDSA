package JavaDSA.Java_05_Oops.Java_04_AbstractClassesAndInterfaces;

public class Java_81_MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Bear b=new Bear();
        System.out.println(b.color);
        b.eats();
    }
}
interface Herbivore{
    String color="Default";
    void eats();
}
interface Carnivore{
    String color="Default";
    void eats();
}

class Bear implements Herbivore, Carnivore{
    String color="Black";
    public void eats(){
        System.out.println("Eats veg and non veg both.");
    }
}
