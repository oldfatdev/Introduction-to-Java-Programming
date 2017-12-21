import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble() / 100.0;
        System.out.println("The gratuity is $" + subtotal * gratuity_rate + " and total is $" + subtotal * (1 + gratuity_rate));
    }
}
