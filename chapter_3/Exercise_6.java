import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in punds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double METERS_PER_FOOT = 0.3048;

        double bmi = (pounds * KILOGRAMS_PER_POUND) / ((feet * METERS_PER_FOOT + inches * METERS_PER_INCH) * (feet * METERS_PER_FOOT + inches * METERS_PER_INCH));
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
