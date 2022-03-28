import java.util.Scanner;

public class hw02problem3 {
    public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the force applied: ");
        double F = sc.nextDouble();
        System.out.println("Enter the mass: ");
        double mass = sc.nextDouble();
        System.out.println("Enter the acceleration: ");
        double a = sc.nextDouble();
        sc.close();

        double g = 9.8;
        
        double friction = (F - (mass * a))/(mass * g);

        System.out.print("The coefficient of friction is" + friction);
    }
}
