import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum_of_digits = 0;
        while (number != 0) {
            sum_of_digits += number % 10;
            number /= 10;
        }
        System.out.println("The sum of digits is " + sum_of_digits);
    }
}
