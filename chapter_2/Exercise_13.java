import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double money = input.nextDouble();
        double rate  = 0.05 / 12;
        double sum   = 0;

        sum = (money + sum) * (1 + rate);
        sum = (money + sum) * (1 + rate);
        sum = (money + sum) * (1 + rate);
        sum = (money + sum) * (1 + rate);
        sum = (money + sum) * (1 + rate);
        sum = (money + sum) * (1 + rate);
        
        System.out.println("After the sixth month, the account value is $" + sum);
    }
}
