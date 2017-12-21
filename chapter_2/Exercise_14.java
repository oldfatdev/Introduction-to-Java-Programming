import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.println("BMI is " + ((weight * 0.45359237) / (height * 0.0254) / (height * 0.0254)));
    }
}
