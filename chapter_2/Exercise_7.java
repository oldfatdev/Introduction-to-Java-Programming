import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years, days;
        days = minutes / (24 * 60);
        years = days / 365;
        days -= years * 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
