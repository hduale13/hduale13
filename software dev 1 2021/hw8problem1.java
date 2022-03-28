import java.util.*;
import java.util.Scanner;
public class hwproblem1
{
    public static ArrayList<String> split(String s,String delimiters){
        ArrayList<String> res = new ArrayList<String>(); // to store output
        int n = s.length(); // length of input String
        int m = delimiters.length(); // no. of delimiters
        String curr="";
        for(int i=0;i<n;i++){
            boolean found = false; // true if delimiters found
            for(int j=0;j<m;j++){
                if(s.charAt(i)==delimiters.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(found){ //if delimiters found add to result
                res.add(curr);
                curr = "";
            } else{ // else add current char to string
                curr = curr + "" + s.charAt(i);
            }
        }
        if(!curr.equals("")){ // add curr to res
            res.add(curr);
        }
        return res;
    }
        public static void main(String[] args) {
            System.out.print("Enter string: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.print("Enter delimiters: ");
            String delimiters = sc.nextLine();
                ArrayList<String> res = split(s,delimiters);
                for (int i = 0; i < res.size(); i++)  
            System.out.print(res.get(i) + " ");  
        }
}