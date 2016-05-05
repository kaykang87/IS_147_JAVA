/* Kyong Kang
    kyongk1@umbc.edu
 */
package com.company;
public class Main
{
    public static void main(String[] args)
    {
        Stars();
    }

    public static void Stars()
    {
        int MAX_ROWS = 1;
        System.out.println("Program output");
        for (int rows=10; rows >= MAX_ROWS; rows--)
        {
            for (int stars=1; stars<=rows; stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
