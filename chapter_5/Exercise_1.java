import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter an integer, the input ends if it is 0: ");

        int npositive = 0, nnegative = 0, total = 0, n = 0;
        int num;
        while((num = input.nextInt()) != 0) {
            total += num;
            n++;
            if (num > 0) {
                npositive++;
            }
            else {
                nnegative++;
            }
        }

        if (n > 0) {
            System.out.printf("The number of positives is %d\nThe number of negatives is %d\nThe total is %d\nThe average is %f\n", npositive, nnegative, total, total * 1.0 / n);
        }
        else {
            System.out.println("no numbers are entered except 0");
        }
        
    }
}