import java.util.Scanner;

public class hw3problem2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input your first x coordinate (x1); ");
        int x1 = sc.nextInt();
        
        System.out.print("Input your first y coordinate (y1); ");
        int y1 = sc.nextInt();
        
        System.out.print("Input your second y coordinate (y2); ");
        int y2 = sc.nextInt();
        
        System.out.print("Input your second x coordinate (x2); ");
        int x2 = sc.nextInt();
        
        sc.close();
        

        int m = (y2 - y1) / (x2 - x1);
        int b = (y1 - (m * x1));

        System.out.println("The equation of the points" + "(" + x1 + "," + y1 + ")" + "and (" + x2 +"," + y2 +")   is " + "y =" + m + "x+" + b);
    }

}