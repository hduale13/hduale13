import java.util.Scanner;

public class hw4problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int integer = sc.nextInt();
        int inside = integer;
        int outside = 1;
        int d = 2;
        sc.close();
        while (d * d <= inside) {
            if (inside % (d * d) == 0) {
                inside = inside / (d * d);
                outside = outside * d;
            } else
                d += 1;
        }

        if (outside != 1 && inside != 1) {
            System.out.println("sqrt(" + integer + ") is " + outside + "sqrt(" + inside + ")");

        }

        if (outside != 1 && inside == 1) {
            System.out.println("sqrt(" + integer + ") is " + outside);
        }

        if (outside == 1 && inside != 1) {
            System.out.println("sqrt(" + integer + ") is sqrt(" + inside + ")");
        }

        if (outside == 1 && inside == 1) {
            System.out.println("sqrt(" + integer + ") is " + 1);
        }

    }
}
