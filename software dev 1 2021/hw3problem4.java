import java.util.Scanner;

public class hw3problem4
{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int response = 0;

        int number1 = (int)(Math.random()* 10);
        int number2 = (int)(Math.random()* 10);

        while((response > 3) || (response == 0))
        {
            response = (int)(Math.random() * 10);
        }

        if (number1 < number2)
        {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();
        System.out.print(response);

        if (number1 - number2 == answer) 
        {
            if(response == 1)
            {
                System.out.println("correct");
            }
            if (response == 2)
            {
                System.out.println("Nice, Way to go!");
            }
            if (response == 3)
            {
                System.out.println("Excellent!");
            }
        }   

        else
        {
            if(response == 1)
            {
                System.out.println("Not quite");
            }
            if (response == 2)
            {
                System.out.println("Incorrect");
            }
            if (response == 3)
            {
                System.out.println("Wrong");
            }
        }
    }

}