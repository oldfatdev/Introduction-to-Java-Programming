import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        int day = (today + elapsedDays) % 7;

        if (today == 0) {
            System.out.print("Today is Sunday ");
        }
        else if (today == 1) {
            System.out.print("Today is Monday ");
        }
        else if (today == 2) {
            System.out.print("Today is Tuesday ");
        }
        else if (today == 3) {
            System.out.print("Today is Wednesday");
        }
        else if (today == 4) {
            System.out.print("Today is Thursday ");
        }
        else if (today == 5) {
            System.out.print("Today is Friday ");
        }
        else if (today == 6) {
            System.out.print("Today is Saturday ");
        }

        if (day == 0) {
            System.out.println("and the future day is Sunday");
        }
        else if (day == 1) {
            System.out.println("and the future day is Monday");
        }
        else if (day == 2) {
            System.out.println("and the future day is Tuesday");
        }
        else if (day == 3) {
            System.out.println("and the future day is Wednesday");
        }
        else if (day == 4) {
            System.out.println("and the future day is Thursday");
        }
        else if (day == 5) {
            System.out.println("and the future day is Friday");
        }
        else if (day == 6) {
            System.out.println("and the future day is Saturday");
        }
    }
}
