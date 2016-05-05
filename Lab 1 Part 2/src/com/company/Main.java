/* Kyong Kang
   kyongk1@umbc.edu
 */

package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {


        double hours, payrate, grosspay, netPay;
        Scanner input = new Scanner (System.in);
        final double TAXRATE = .20;

        System.out.println ("Enter your Name");
        String Name = input.nextLine();
        System.out.println ("Enter your age");
        int age = input.nextInt();
        System.out.println ("Enter your hours");
        hours = input.nextDouble();
        System.out.println ("Enter your payrate");
        payrate = input.nextDouble();

        grosspay = hours * payrate;
        netPay = grosspay - (grosspay*TAXRATE);

        System.out.println("Your name is "+ Name);
        System.out.println("You are " + age + " yeras old");
        System.out.println("Your payrate is " + "$" + payrate);
        System.out.println("You have worked " + hours + " hours");
        System.out.println("Your taxrate is 20%");
        System.out.println("Your grosspay is " + "$" + grosspay + " and your netpay is " + "$" + netPay);

    }
}
