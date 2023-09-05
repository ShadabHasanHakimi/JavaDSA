package JavaDSA.Java_05_Oops.Java_02_ConstructorsAndDestructors;

public class Java_72_TypesOfConstructors {
    public static void main(String[] args) {
        Student1 S1=new Student1();     //Non Parameterised constructor
        Student1 S2=new Student1("Shadab");     //Parameterised constructor
        Student1 S3=new Student1("Hasan", 36);      //Parameterised constructor

        Student1 S4=new Student1(S3);       //Copy Constructor
        System.out.println(S4.name);
        System.out.println(S4.rno);
    }
}

class Student1{
    String name;
    int rno;
    Student1(){
        System.out.println("Non Parameterised Constructor is called!!!");
    }
    Student1(String name){
        this.name=name;
        System.out.println("Parameterised Constructor 1 is called!!!");
    }
    Student1(String name, int rno){
        this.name=name;
        this.rno = rno;
        System.out.println("Parameterised Constructor 2 is called!!!");
    }

    Student1(Student1 S){       //Copy constructor
        this.name= S.name;
        this.rno= S.rno;
        System.out.println("Copy constructor is called!!!");
    }
}
