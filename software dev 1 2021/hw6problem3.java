import java.util.*;
public class hw6problem3
{
    public static void main(String [] args)
    {
        System.out.print("Enter the first string: ");
        Scanner input = new Scanner(System.in);
        String x = input.next();
        System.out.print("Enter the second string: ");
        input = new Scanner(System.in);
        String y = input.next();
        if(isAnagram(x,y))
        {
            System.out.println("The strings are an anagram");
        }
        else
        {
            System.out.println("They are not an anagram");
        }

    }

    public static boolean isAnagram(String s1, String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s1.toLowerCase();
        s1 = s1.replace(" ", " ");
        s2 = s2.replace(" ", " ");
        s1 = s1.replace("-", " ");
        s2 = s2.replace("-", " ");
        char [] chrArray1 = s1.toCharArray();
        char [] chrArray2 = s2.toCharArray();
        if(chrArray1.length != chrArray2.length)
        {
            return false;
        }
       
        Arrays.sort(chrArray1);
        Arrays.sort(chrArray2);
        for(int index = 0; index<chrArray1.length; index++)
        {
            if(chrArray1[index] != chrArray2[index])
            {
                return false;
            }
        }
        return true;
    }
}