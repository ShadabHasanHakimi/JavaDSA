package JavaDSA.Java_05_Oops.Java_01_Classes;

public class Java_69_AccessSpecifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shadab Hasan Hakimi";
//        myAcc.password = "12341234";    //It will throw an error because password is private
//        But we can use a function to access the private member
        myAcc.setPassword("1234abcd");

    }
}

class BankAccount{
    public String username;
    private String password;
    void setPassword(String pass){
        password=pass;
    }
}
