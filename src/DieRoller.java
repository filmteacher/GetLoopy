import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args)
    {

        boolean done = false;

        do
        {
            int die1 = 0;
            int die2 = 0;
            int die3 = 0;
            int sum = 0;
            int row = 1;
            boolean triple = false;
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);
            String again = "";

            System.out.println("");
            System.out.println("  Roll  Die1  Die2  Die3  Sum");
            System.out.println("--------------------------------");

            do
            {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                System.out.printf("%5d %5d %5d %5d %5d\n", row, die1, die2, die3, sum);
                row++;

                if(die1==die2 && die2==die3)
                {
                    triple = true;
                }
            }
            while(!triple);

            System.out.print("Do you want to play again [Y/N]? ");
            again = in.nextLine();

            if(again.equalsIgnoreCase("N"))
            {
                done = true;
            }
        }while(!done);
    }
}