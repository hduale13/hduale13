import java.util.Scanner;

public class hw02problem1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle; ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle; ");
        Double width = sc.nextDouble();
        sc.close();

        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt( length * length + width * width);

        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Diagonal is " + diagonal);
        
    }
}

