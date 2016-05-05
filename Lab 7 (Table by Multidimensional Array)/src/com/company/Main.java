/* kyong kang
   kyongk1@umbc.edu
 */

package com.company;
public class Main {

    public static void main(String[] args)
    {
	    String[][] tableArray = new String[5][3];
        int rows =5;
        int columns =3;

        tableArray[0][0] = "Course Number  | ";
        tableArray[1][0] = "IS 147: ";
        tableArray[2][0] = "IS 247: ";
        tableArray[3][0] = "IS 410: ";
        tableArray[4][0] = "IS 420: ";

        tableArray[0][1] = " Course Name   |";
        tableArray[1][1] = "    Programming in Java I   ";
        tableArray[2][1] = "    Programming in Java II  ";
        tableArray[3][1] = "    Database Programming I  ";
        tableArray[4][1] = "    Database Programming II ";

        tableArray[0][2] = "    Room ";
        tableArray[1][2] = " Room 100 ";
        tableArray[2][2] = " Room 200 ";
        tableArray[3][2] = " Room 300 ";
        tableArray[4][2] = " Room 400 ";

        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.print(tableArray[i][j]);
            }
            System.out.println("\n----------------------------------------------------");
        }
    }
}
