import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        Double x1 = input.nextDouble();
        Double y1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        Double x2 = input.nextDouble();
        Double y2 = input.nextDouble();

        Double radius = 6371.01;
        Double d = radius * Math.acos(
            Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) 
            + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2))
            * Math.cos(Math.toRadians(y1 - y2)));

        System.out.printf("The distance between the two points is %f km\n", d);
    }
}