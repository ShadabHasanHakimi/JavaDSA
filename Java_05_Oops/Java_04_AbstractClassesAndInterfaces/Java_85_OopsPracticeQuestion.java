package JavaDSA.Java_05_Oops.Java_04_AbstractClassesAndInterfaces;

public class Java_85_OopsPracticeQuestion {
    public static void main(String[] args) {
        Complex c=new Complex();
        c.Sum(7,-2,-5,4);
    }
}
//    Question 1
class Complex{
    void Sum(int real1, int imag1, int real2, int imag2){
        System.out.println("Sum = "+(real1+real2)+" + "+(imag1+imag2)+"i");
        Diff(real1, imag1, real2, imag2);
    }
    void Diff(int real1, int imag1, int real2, int imag2){
        System.out.println("Difference = "+(real1-real2)+" + "+(imag1-imag2)+"i");
        Mul(real1, imag1, real2, imag2);
    }
    void Mul(int real1, int imag1, int real2, int imag2){
        int real, imag;
        real=(real1*real2) - (imag1*imag2);
        imag=(imag1*real2) + (real1*imag2);
        System.out.println("Multiplication = "+real+" + "+imag+"i");
    }
}
