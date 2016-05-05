/* Kyong Kang
   kyongk1@umbc.edu
 */

package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        calculatorMethod();
    }

    public static void calculatorMethod()
    {
        Scanner numbers = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        char repeat1;

        do
        {
            System.out.println("Input the first number.");
            double number1 = numbers.nextDouble();
            System.out.println("Input the second number.");
            double number2 = numbers.nextDouble();

            System.out.println("Here are the menus");
            System.out.println("Press 0 to Quit");
            System.out.println("Press 1 to Add");
            System.out.println("Press 2 to Subtract");
            System.out.println("Press 3 to Multiply");
            System.out.println("Press 4 to Divide");
            int menuPress = keyboard.nextInt();

                if (menuPress == 0)
                {
                    System.out.println("Thank you for using the program. See you again!");
                    System.exit(0);
                }
                else if (menuPress == 1)
                {
                    double addNumber = number1 + number2;
                    System.out.println("Your result is " + addNumber);
                }
                else if (menuPress == 2)
                {
                    double subtractNumber = number1 - number2;
                    System.out.println("Your result is " + subtractNumber);
                }
                else if (menuPress == 3)
                {
                    double multiplyNumber = number1 * number2;
                    System.out.println("Your result is " + String.format("%.2f", multiplyNumber));
                }
                else if (menuPress == 4)
                {
                    double divideNumber = number1 / number2;
                    System.out.println("Your result is " + String.format("%.2f", divideNumber));
                }
                else
                {
                    System.out.println("Error: Wrong Input");
                }
                System.out.println("Would you like to continue using the program? " +
                        "Press Y/y to Continue or N/n to Quit");
                repeat1 = keyboard.next().charAt(0);

        } while (repeat1 == 'Y' || repeat1 == 'y');
    }
}
