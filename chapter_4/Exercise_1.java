import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        Double r = input.nextDouble();
        Double s = 2 * r * Math.sin(Math.PI / 5);
        Double area =  (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println("The area of the pentagon is " + area);
    }
}