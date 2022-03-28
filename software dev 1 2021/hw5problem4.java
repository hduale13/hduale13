import java.util.Scanner;
public class hw5problem4 {
    public static void main(String [] args)
    {
        System.out.println("Enter your number of rows: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        for(int i = 0; i<rows; i++)
        {
            int number = 1;
            System.out.format("%" + (rows - 1) * 2 + "s" , "");
            for(int j=0; j<=i; j++)
            {
                System.out.format("%3d", number);
                number = number * (i - j)/(j+1);
            }
            System.out.println();
        }
        in.close();
    }
}
