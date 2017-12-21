import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        System.out.print(celsius);
        System.out.print(" Celsius is ");
        System.out.print(9.0 / 5.0 * celsius + 32);
        System.out.println(" Fahrenheit");
    }
}
