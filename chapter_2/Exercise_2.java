import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.1415926;
        double volume = area * length;
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The Volumn is ");
        System.out.println(volume);
    }
}
