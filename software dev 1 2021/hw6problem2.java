import java.util.Scanner;

public class hw6problem2 
{

    public static int[] count(String s) 
    {
        int[] counts = new int[10];
        for(int i = 0; i < s.length(); ++i) 
        {
            if(Character.isDigit(s.charAt(i))) 
            {
                counts[s.charAt(i)-'0']++;
            }
        }
        return counts;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = in.nextLine();
        int[] counts = count(line);
        for(int i = 0; i < counts.length; ++i) 
        {
            if(counts[i] != 0) 
            {
                System.out.printf("Digit %d occurs %d times\n", i, counts[i]);
            }
        }
        in.close();
    }


}
