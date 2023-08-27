public class Java_07_Hollow_Rectangle {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                if(i>0 && i<3 && j>0 && j<4){       // Or if(i==1 || i==4 ||j==1 || j== 4
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
