import java.util.Scanner;

import java.util.Random;

public class hw4problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: Addition");

            System.out.println("2: Subtraction");

            System.out.println("3: Multiplication");

            System.out.println("4: Division");

            System.out.println("5: Exit");

            System.out.println("Enter a choice: ");

            int answer = 0, choice = sc.nextInt(), number1 = 0, number2 = 0;

            Random rand = new Random();
            switch (choice) {
            case 1:
                number1 = rand.nextInt(10);
                number2 = rand.nextInt(10);

                System.out.println("What is " + number1 + "+" + number2 + "?");
                answer = sc.nextInt();
                if (answer == number1 + number2) {
                    System.out.println("Correct");
                }

                else {
                    System.out.println("Wrong, the correct answer is " + (number1 + number2));
                }
                return;

            case 2:
                number1 = rand.nextInt(10);
                number2 = rand.nextInt(10);

                System.out.println("What is " + number1 + "-" + number2 + "?");
                answer = sc.nextInt();

                if (answer == number1 - number2) {
                    System.out.println("Correct");
                }

                else {
                    System.out.println("Wrong, the correct answer is " + (number1 - number2));
                }
                return;

            case 3:
                number1 = rand.nextInt(10);
                number2 = rand.nextInt(10);
                System.out.println("What is " + number1 + "x" + number2 + "?");
                answer = sc.nextInt();

                if (answer == number1 * number2) {
                    System.out.println("Correct");
                }

                else {
                    System.out.println("Wrong, the correct answer is " + (number1 * number2));
                }
                return;

            case 4:
                number1 = rand.nextInt(10);
                number2 = rand.nextInt(10);

                System.out.println("What is " + number1 + "/" + number2 + "?");
                answer = sc.nextInt();

                if (answer == number1 / number2) {
                    System.out.println("Correct");
                }

                else {
                    System.out.println("Wrong, the correct answer is " + (number1 / number2));
                }
                return;

            case 5:
                System.exit(0);

            }
            sc.close();
            System.out.println("Do you want to continue? (Yes or No: ");
            String c = sc.nextDouble(); // JA: You cannot read a double into a string
            if (c.equals("No") || c.equals("no"))
                ;
            {
                System.out.println("Goodbye!");
            }
            if (c.equals("Yes") || c.equals("yes"))
                ;
            {
                continue;
            }

        }

    }

}
