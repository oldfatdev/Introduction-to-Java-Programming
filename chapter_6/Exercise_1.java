public class Exercise_1 {
    public static void main(String[] args)
    {
        for(int i = 1; i <= 100; i++)
        {
            System.out.printf("%d ", getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.print('\n');
            }
        }
    }

    public static int getPentagonalNumber(int n)
    {
        return n * (3 * n - 1) / 2;
    }
}