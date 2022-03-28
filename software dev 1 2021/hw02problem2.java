import java.util.Scanner;

public class hw02problem2 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter time in seconds: ");
        double T = sc.nextDouble();

        sc.close();
        double d = 0 * T + 9.8 * (T * T)/2; 

        System.out.print("The height of the building is " + d + "meters");
        
    }
}