import java.util.Scanner;

public class hw6problem4 {

  public static double[][] inverse(double [][] A) {
      double temp;
      
      double det = (A[0][0]*A[1][1]) - (A[0][1]*A[1][0]);
      
      if(det == 0) {
          return null;
      } 
      else {
         
            temp = A[0][0];
            A[0][0] = A[1][1];
            A[1][1] = temp;
            
            A[0][1] = - A[0][1];
            A[1][0] = - A[1][0];
                  
            for(int i = 0; i < 2; ++i) 
            {
                for(int j = 0; j < 2; ++j)
                {
                    A[i][j] = (A[i][j]/det);
                }
            }
            
            return A;
            
        }
    }
    
    public static void main(String argv[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c, d: ");
        
        double [][] matrix  = new double[2][2];
        
        for(int i = 0; i < 2; ++i) 
        {
            for(int j = 0; j < 2; ++j)
                {
                    matrix[i][j] = sc.nextDouble();
                }
        }
    
        double [][] result = inverse(matrix);
        
        if(result == null) 
        {
            System.out.print("No inverse matrix");
        } else {
            
            for(int i = 0; i < 2; ++i) 
            {
                for(int j = 0; j < 2; ++j)
                {
                    System.out.print(result[i][j] + " ");
                }
                    System.out.print("\n");
            }
            
        }
        sc.close();
    }

}