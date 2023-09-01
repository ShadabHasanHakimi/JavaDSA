package JavaDSA.Java_03_Strings;

public class Java_48_StringBasics_1 {
    public static void printString(String name){
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String name;
//        name = sc.next();       // Only read one word
//        name = sc.nextLine();          //Reads full line
//        System.out.println(name);

//        Concatenation in Java
        String fName = "Shadab";
        String lName = "Hasan";
        String fullName = fName + " " + lName;
//        System.out.println(fName);
//        System.out.println(lName);
//        System.out.println(fullName);

//        charAt
        System.out.println(fName.charAt(0));

//        charAt function
        printString(fullName);
    }
}
