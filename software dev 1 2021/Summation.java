import java.util.Arrays;
import java.util.Scanner;
public class Summation {
   public static void main(String[] args){
      System.out.println("Enter the required size of the array :: ");
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int []myArray = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<size; i++){
         myArray[i] = sc.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      System.out.println("Sum of the elements of the array :"+sum);
      sc.close();
   }
}
