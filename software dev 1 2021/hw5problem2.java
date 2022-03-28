import java.util.Scanner;

public class hw5problem2 {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = input.nextLine();
        System.out.println("the New string is: " + title(str));
        input.close();
    }

    public static String title(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if ((i == 0 && Character.isLowerCase(ch))
                    || (i > 0 && sb.charAt(i - 1) == ' ' && Character.isLowerCase(ch)))
                sb.replace(i, i + 1, Character.toUpperCase(ch) + " ");
        }
        return sb.toString();
    }

}