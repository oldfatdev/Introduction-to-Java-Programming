import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        System.out.println("The population in " + years + " is " + (int)Math.round(312032486 + years * 365 * 24 * 3600 / 7.0 - years * 365 * 24 * 3600 / 13.0 + years * 365 * 24 * 3600 / 45.0));
    }
}
