package JavaDSA.Java_04_BitManipulation.Java_03_BitManipulationQuestions;

public class Java_67_Questions {
    public static int question1(int x){
        return (x^x);
    }

    public static void question2(int x, int y){
        System.out.println("Before Swapping : x="+x+", y="+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swapping : x="+x+", y="+y);

    }

    public static void main(String[] args) {
//        System.out.println(question1(5));
        question2(3,5);
    }
}
