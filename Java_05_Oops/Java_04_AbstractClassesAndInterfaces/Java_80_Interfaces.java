package JavaDSA.Java_05_Oops.Java_04_AbstractClassesAndInterfaces;

public class Java_80_Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();

        Rook r=new Rook();
        r.moves();
    }
}
interface ChessPlayer{
    void moves();       //By default public and static
    //We cannot provide implementation here because we have to follow Abstraction
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Moves in all direction.");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Moves up, down, left & right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Moves in all directions but only one step.");
    }
}
