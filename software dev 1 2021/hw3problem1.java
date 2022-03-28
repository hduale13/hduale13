import java.util.Scanner;

public class hw3problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your numerator: ");
        int numerator = sc.nextInt();
        System.out.println("Enter your denominator: ");
        int denominator = sc.nextInt();

        sc.close();

        if (numerator < denominator) {
            System.out.print(numerator + "/" + denominator + "is a proper fraction");
        } else if (numerator % denominator == 0) {
            System.out.println(numerator + "/" + denominator + "is an improper fraction");
            System.out.print(" ");
            System.out.println("It can be reduced to" + numerator / denominator);
        } else {
            System.out.print("The reduced fraction is " + numerator / denominator + "+" + numerator % denominator + "/"
                    + denominator);
        }

    }

}