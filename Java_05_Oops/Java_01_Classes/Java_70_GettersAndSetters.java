package JavaDSA.Java_05_Oops;

public class Java_70_GettersAndSetters {
//    getters and setters functions are used to access(obtain or change) the
//    private variables of a class

    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.setColor("Black");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
class Pen1{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color=color;   //this keyword is used to refer to the current object
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
