
public class hw03problem3 {
    public static void main(String [] arg) {
        double max = 5;
        double min = -5;

        double x = min + Math.random() * (max - min);
        double y = min + Math.random() * (max - min);

        double d = Math.sqrt((x*x) + (y*y));
        System.out.println("the point is (" + x + " , " + y + ") and the distance between the point and the center is" + d);

    }

}


