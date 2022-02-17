import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        Scanner input = new Scanner(System.in);
        double guess = 0;

        System.out.println("Guess a number between 1 to 10: ");
        guess = input.nextDouble();

        if (guess == val)
        {
            System.out.println("You are on the money!");
        }
        else if (guess > val)
        {
            System.out.println("You are high!");
        }
        else
        {
            System.out.println("You are low!");
        }
    }
}
