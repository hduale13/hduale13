import java.util.Scanner;
public class hw8problem2 
{ 
    static int nextBin(int weight[], int n, int c) 
    { 
        int res = 0, bin_rem = c; 
        for (int i = 0; i < n; i++) 
        { 
            if (weight[i] > bin_rem) 
            { 
                res++; // Use a new bin 
                bin_rem = c - weight[i]; 
            } 
            else
            {
                bin_rem -= weight[i]; 
                if((weight[i]+bin_rem)==10)
                {
                    System.out.println("Containers "+res+" contains objects with weight "+ weight[i]+" "+bin_rem);
                }
            }
        } 

        public static void main(String[] args) {
            int c = 10; 
            System.out.println("Enter the number of objects: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Enter the weights of the objects:");
            int []objects = new int[n];
            for(int i=0; i<n; i++)
            {
                objects[i] = sc.nextInt(); 
                    System.out.println("Number of bins required : " + nextBin(objects, n, c)); 
            }
            sc.close();
        }
        
    }
}