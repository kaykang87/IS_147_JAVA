/* Kyong Kang
   Kyongk1@umbc.edu
 */
package com.company;

public class Main {
    public static void main(String[] args) {
        //arithmetical
        // + operator
        String myfirstString = "Java";
        String mysecondString = "Programming";
        String plusOperator = myfirstString + mysecondString;
        System.out.println("Using + operator " + plusOperator);

        // - Operator
        int number1 = 47;
        int number2 = 37;
        int minusOperator = number1 - number2;
        System.out.println("Using - Operator " + minusOperator);

        // * Operator
        int number3 = 3;
        int number4 = 3;
        int multiplyOperator = number3 * number4;
        System.out.println("Using * Operator " + multiplyOperator);

        // / Operator //
        int number5 = 4;
        int number6 = 2;
        int divisionOperator = number5 / number6;
        System.out.println("Using / Operator " + divisionOperator);

        // %Operator //
        int number7 = 4;
        int number8 = 2;
        int remainderOperator = number7 % number8;
        if (remainderOperator >= 0) {
            System.out.println("Using % Operator " + remainderOperator);
        }

        // ++Operator //
        int number9 = 5;
        int number10 = ++number9;
        System.out.println("Using ++ Operator " + number10);
        number9++;
        System.out.println("Using ++ Operator " + number9);

        // --Operator //
        int number12 = 20;
        int number13 = --number12;
        System.out.println("Using -- Operator " + number13);
    }
}
