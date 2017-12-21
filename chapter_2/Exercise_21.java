import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterest = input.nextDouble();

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        System.out.println("The interest is " + investmentAmount * Math.pow(1 + annualInterest / 1200, years * 12));
    }
}
