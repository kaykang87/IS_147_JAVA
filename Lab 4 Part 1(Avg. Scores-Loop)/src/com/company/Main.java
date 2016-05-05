/* Kyong Kang
   kyongk1@umbc.edu
 */

package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("This Program Averages your test scores");
        TestScores();
    }

    public static void TestScores()
    {
        Scanner input = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        char repeat;
        do {
            System.out.println("Enter Score 1");
            double score1 = input.nextDouble();
            System.out.println("Enter Score 2");
            double score2 = input.nextDouble();
            System.out.println("Enter Score 3");
            double score3 = input.nextDouble();

            double avgScore = (score1 + score2 + score3) / 3;

            System.out.println("Your Average Score is  " + String.format("%.2f", avgScore));

            System.out.println("Would you like to average another set of scores? If not press Q to quit the program");
            String quit = keyboard.nextLine();
            repeat = quit.charAt(0);
            } while (repeat != 'Q' && repeat != 'q');
             System.out.print("Bye. Good luck on your next tests!");
    }
}
