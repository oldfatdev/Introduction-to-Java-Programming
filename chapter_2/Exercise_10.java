import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amout of water in kilograms: ");
        double M = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        System.out.println("The energy needed is " + M * (finalTemperature - initialTemperature) * 4184);
    }
}
