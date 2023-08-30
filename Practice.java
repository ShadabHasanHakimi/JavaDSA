package JavaDSA;

public class Practice {
    public static void shortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else{
                System.out.println("Invalid Input!!!");
                return;
            }
        }
        float sPath=(float)Math.sqrt((x*x)+(y*y));
        System.out.println("Shortest path: "+sPath);
    }


}
