import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double miles = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        System.out.println("The cost of driving is " + (miles / milesPerGallon * pricePerGallon));
    }
}
