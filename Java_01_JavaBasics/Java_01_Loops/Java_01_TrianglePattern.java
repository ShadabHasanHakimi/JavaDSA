package JavaDSA.Java_01_JavaBasics;
public class Java_01_TrianglePattern {
    public static void print(int nRows, int nCols){
        for(int i=1; i<=nRows; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5,5);
    }

    public static class Java_01_Variables_Questions {
    //    Question no :1
    //    public static void main(String[] args) {
    //        int a, b, c;
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter three numbers to find their average:");
    //        a = sc.nextInt();
    //        b = sc.nextInt();
    //        c = sc.nextInt();
    //        int avg = (a+b+c)/2;
    //        System.out.println("Average of given numbers is : "+avg);
    //    }change
    
    //    Question no:2
    //    public static void main(String[] args) {
    //        int s;
    //        System.out.println("Enter the side of square:");
    //        Scanner sc = new Scanner(System.in);
    //        s = sc.nextInt();
    //        int area = s*s;
    //        System.out.println("Area of given square is "+area);
    //    }
    
    //    Question :3
    //    public static void main(String[] args) {
    //        float pen, pcl, ers;
    //        System.out.println("Enter the cost of pencil, pen and eraser" +
    //                " to calculate total cost(With and Without gst:");
    //        Scanner sc = new Scanner(System.in);
    //        pen = sc.nextFloat();
    //        pcl = sc.nextFloat();
    //        ers = sc.nextFloat();
    //        float t_cost, cost;
    //        cost = pen+pcl+ers;
    //        t_cost = cost + (cost*0.18f);
    //        System.out.println("Cost without gst = "+cost);
    //        System.out.println("Cost with gst = "+t_cost);
    //    }
    
    //    Question :4
    //    Answer : Double
    
    //    Question : 5
    //    No, it will not give any error because we can use _ and $
    //    variable name in java
    
    }
}
