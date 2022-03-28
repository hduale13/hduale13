import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
                              
            System.out.print("Enter the number of items: ");
            int i = sc.nextInt();
              
            System.out.print("Enter the weights for each item: ");
            int[] weightsArray = new int[i];
            for(int j = 0; j < i; j++) 
                {
                    weightsArray[j] = sc.nextInt();
                }
              
                
            System.out.print("Enter the weight limit for the bag: ");
            int weightLimit = sc.nextInt();
              
                //close the scanner
            sc.close();
              
            ArrayList<Integer> result = m(i, weightLimit, weightsArray);
              
        }
      
        public static ArrayList<Integer> m(int i, int weightLimit, int[] w) 
        {
    
            ArrayList<Integer> result = new ArrayList<Integer>();
              
            System.out.print("The maximum weight of the items placed in the bag is " + weightLimit);
              
            boolean matchFound = false;
            boolean matchPartialFound = false;
            int matchIndex1 = -1, matchIndex2 = -1;
            int maxWeight = -1;
              
            for(int j = 0; j < i-1; j++) 
            {
                for(int k = j+1; k < i; k++) 
                {
                    int sum = w[j] + w[k];
                              
                    if(sum == weightLimit) 
                    {
                        matchFound = true;
                        matchIndex1 = j;
                        matchIndex2 = k;
                        break;
                    }
                    
                    else if(sum < weightLimit) 
                    {
                        if(sum > maxWeight) 
                        {
                            maxWeight = sum;
                            matchIndex1 = j;
                            matchIndex2 = k;      
                            matchPartialFound = true;                                             
                        }
                    }
                }     
                if(matchFound)
                    break;
            }     
              
            System.out.println("");
            if(matchFound || matchPartialFound) 
            {
                System.out.println("The items in the bag are #" + (matchIndex1+1) + " #" + (matchIndex2+1));
                System.out.println("The weights of the items in the bag are " + w[matchIndex1] + " " + w[matchIndex2]);
                result.add(w[matchIndex1]);
                result.add(w[matchIndex2]);
            }
            oreturn result;
        }
}