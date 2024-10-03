package CODSOFT;
import java.util.Scanner;
import java.util.Random;
public class randomNumberGame
{
    public static void main(String []args)
    {
        int number,hit,guessNo,i,Try;
        Random randomNo =new Random();
        hit=0;
        Try=0;
        System.out.println("You have only 10 try!");
        for(i=1;i<=10;i++)
        {
            number = randomNo.nextInt(100);
            System.out.println("Enter a Guesed Number between 1 to 99:");
            Scanner scanner = new Scanner(System.in);
            guessNo = scanner.nextInt();
            if (guessNo == number)
            {
                System.out.println("Hurry! You hit the right guess." + guessNo);
                hit++;
                System.out.println("Total no of win :"+hit);
                break;
            }
            else
            {
                if (number > guessNo) {
                    System.out.println("Too Low Guess " + " ,Random no. is: " + number);
                }
                if (number < guessNo) {
                    System.out.println("Too high Guess " + " ,Random no. is: " + number);
                }
                Try++;
                System.out.println("Total no of try:" + Try);
            }
        }
        System.out.println("You are out of no.of trail FAIL!");
    }
}