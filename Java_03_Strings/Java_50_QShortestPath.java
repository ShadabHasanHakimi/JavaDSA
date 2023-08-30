package JavaDSA.Java_03_Strings;

public class Java_50_QShortestPath {
    public static void shortestPath(String path){
//        Because starting point is at (0,0)
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            if(dir=='N')
                y--;
            else if(dir=='S')
                y++;
            else if(dir=='E')
                x++;
            else if(dir=='W')
                x--;
            else{
                System.out.println("Invalid input!!!");
                return;
            }
        }
//        Now we have value of (x,y)
        float sPath=(float)Math.sqrt((x*x)+(y*y));
        System.out.println("Shortest path : "+sPath+" units");
    }

    public static void main(String[] args) {
        String path="WNENEESENNN";
        shortestPath(path);
    }
}
