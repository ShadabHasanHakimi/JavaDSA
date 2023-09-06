package JavaDSA.Java_05_Oops.Java_02_Constructors;

public class Java_71_Constructors {
    public static void main(String[] args) {
        Student s1=new Student("Shadab Hasan");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int rno;
    Student(String name){
        this.name=name;
        System.out.println("Constructor is called...");
    }
}
