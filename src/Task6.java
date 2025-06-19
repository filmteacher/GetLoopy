public class Task6 {
    public static void main(String[] args)
    {
        int stars = 5;
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= stars; col++)
            {
                System.out.print("* ");
            }
            stars--;
            System.out.println();
        }
    }
}