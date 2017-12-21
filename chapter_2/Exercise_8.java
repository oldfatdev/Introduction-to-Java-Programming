import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args)
    {
        System.out.print("Enter the time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        int offset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis() + offset * 3600 * 1000;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
}
