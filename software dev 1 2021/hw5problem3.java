import java.util.Scanner;

public class hw5problem3 {

    public static String format(long seconds) {
        int hours = (int)(seconds / 3600) % 24; // JA
        seconds %= 3600;
        int minutes = (int) (seconds / 60);
        seconds %= 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        long seconds = in.nextLong();
        System.out.println("The hours, minutes, and seconds for total seconds 342324 is " + format(seconds));
        in.close();
    }
}