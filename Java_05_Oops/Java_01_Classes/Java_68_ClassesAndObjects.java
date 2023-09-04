package JavaDSA.Java_05_Oops;

public class Java_68_ClassesAndObjects {
//    Objects: Entities in real world. Like pen, paper, animals, etc.
//    Classes: group of these objects.
//    Conventionally classes names are declared by starting with capital letter.

    public static void main(String[] args) {        //Compiler starts compiling from main function
        Pen p1 = new Pen();     // Created an object of Pen class named p1
//        Objects are created in heap
        p1.setColor("Blue");        // Functions are accessed using dot(.) operator
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

//Classes except public class are declared after public class
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}
