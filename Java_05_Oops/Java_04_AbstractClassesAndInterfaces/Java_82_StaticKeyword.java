package JavaDSA.Java_05_Oops.Java_04_AbstractClassesAndInterfaces;

public class Java_82_StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="Bakshi's";
        Student s2=new Student();
//       schoolName will be same for every object of Student
//        If it is changed by any object then it will be changed for every object
        System.out.println(s2.schoolName);
    }
}
class Student{
    String name;
    int rno;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
