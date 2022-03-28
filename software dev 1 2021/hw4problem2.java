import java.util.Scanner;
public class hw4problem2 
{
    public static void main(String [] args)
    {
        double x = 0; double y = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of sides: ");
        int sides = sc.nextInt();

        System.out.println("Enter the radius of the bounding circle: ");
        double radius = sc.nextDouble();

        System.out.println("The coordinates of the points on a polygon are: ");
        for (int i=0; i < sides; i++)
        {
            double angle = 2 * Math.PI * i / sides; 
            double fx = x + radius * Math.cos(angle);
            double fy = y + radius * Math.sin(angle);

            System.out.format("(%.2f , %.2f)\n", fx,fy);
        }

        sc.close();
    }

}
