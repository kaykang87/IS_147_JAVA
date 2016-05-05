/* kyong kang
   kyongk1@umbc.edu
 */

package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int length = 8;
        Scanner input = new Scanner(System.in);
        int[] names = new int[length];
        for (int counter = 1; counter < length; counter++)
        {
            System.out.print("Enter the sales amount for Day " + counter + ": ");
            names[counter] = input.nextInt();
        }
        input.close();
        System.out.println(" \nSales for 7 days");
        System.out.println("------------------");

        int sum = 0;
        for (int counter = 1; counter < length; counter++)
        {
            System.out.println("Day " + counter + " Sales " + names[counter]);
            sum += names[counter];
        }
        System.out.println("\nTotal Sales: " + sum);
    }
}


