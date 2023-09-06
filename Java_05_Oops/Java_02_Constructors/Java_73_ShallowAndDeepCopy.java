package JavaDSA.Java_05_Oops.Java_02_Constructors;

public class Java_73_ShallowAndDeepCopy {
    public static void main(String[] args) {
        Details d1=new Details();
        d1.name="Shadab";
        d1.rno=36;
        d1.marks= new int[]{1, 2, 3};

        Details d2=new Details(d1);
//        d1.marks[2]=100;        //Changing in marks of 1 will change marks of 2 also(Shallow Copy)
        d1.marks[2]=100;        //Change in marks of 1 will not change in 2(Deep Copy)
        for(int e: d2.marks){
            System.out.println(e);
        }
    }
}

class Details{
    String name;
    int rno;
    int[] marks;
    Details(){};
//    Shallow copy constructor
//    Details(Details d1){
//        marks=new int [3];
//        this.name=d1.name;
//        this.rno=d1.rno;
//        this.marks=d1.marks;
//    }

//    Deep Copy constructor
    Details(Details d1){
        marks=new int[3];
        this.name=d1.name;
        this.rno=d1.rno;
        for(int i=0; i<marks.length; i++){
            this.marks[i]=d1.marks[i];
        }
    }
}
