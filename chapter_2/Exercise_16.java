import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        System.out.println("The area of the hexagon is " + (3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2)));
    }
}
