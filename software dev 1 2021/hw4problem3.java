import java.util.Scanner;

public class hw4problem3 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a genome string ");
        String genome = input.nextLine();
        boolean found = false;
        int start = -1;
        for (int i = 0; i < genome.length() -2; i++)
        {
            String triplet = input.nextLine();
            if (triplet.equals("ATG"))
            {
                start = i + 3;
            }
         
            if (triplet.equals("TAG") || triplet.equals("TAA") || triplet.equals("TGA"))
            {
                start += -1;
            }
            String gene = genome.substring(start, i);

            if (gene.length()%3 == 0)
            {
                found = true;
                System.out.println(gene);
                start = -1;
            }

        }

        if(found)
        {
            System.out.print("no gene is found");
        }
            
        input.close();
    }
    
}
