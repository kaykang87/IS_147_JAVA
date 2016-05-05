/* kyongk1@umbc.edu
    kyong kang
 */

package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        String firstName2 = firstName.toUpperCase();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        String lastName2 = lastName.toLowerCase();

        int randomNumber = 10 + (int)(Math.random()*90);

        System.out.println(firstName + " " + lastName + "'s password is "
                + firstName2.substring(firstName2.length()-1) + randomNumber + lastName2.substring(0, 3));

        // OR Using charAt Method //

        System.out.println(firstName + " " + lastName + "'s password is "
                + firstName2.charAt(firstName2.length()-1) + randomNumber + lastName2.charAt(0) +
                lastName2.charAt(1) + lastName2.charAt(2));
    }
}

