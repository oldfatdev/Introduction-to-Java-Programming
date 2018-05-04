import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        System.out.printf("Enter %d scores: ", n);
        Integer[] scores = new Integer[n];
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }
        int best = Collections.max(Arrays.asList(scores));
        for (int i = 0; i < n; i++) {
            int score = scores[i];
            if (score >= best - 10) {
                System.out.printf("Student %d score is %d and grade is A\n", i, score);
            }
            else if (score >= best - 20) {
                System.out.printf("Student %d score is %d and grade is B\n", i, score);
            }
            else if (score >= best - 30) {
                System.out.printf("Student %d score is %d and grade is C\n", i, score);
            }
            else if (score >= best - 40) {
                System.out.printf("Student %d score is %d and grade is D\n", i, score);
            }
            else {
                System.out.printf("Student %d score is %d and grade is F\n", i, score);

            }
        }
    }
}