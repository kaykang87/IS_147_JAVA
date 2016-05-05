/* Kyong Kang
   kyongk1@umbc.edu
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        // == Operator
        boolean firstString = ("Kyong" == "Kang");
        System.out.println("String Comparison " + firstString);

        // != Operator
        int number1 = 5;
        int number2 = 6;
        boolean secondString = (number1 != number2);
        System.out.println("String Comparison " + secondString);

        // > Operator
        int number3 = 7;
        int number4 = 6;
        boolean thirdString = (number4 > number3);
        System.out.println("String Comparison " + thirdString);

        // < Operator
        boolean fourthString = (number4 < number3);
        System.out.println("String Comparison " + fourthString);

        // <= Operator
        boolean fifthString = (number1 <= number2);
        System.out.println("String Comparison " + fifthString);

        // >= Operator
        boolean sixthString = (number2 >= number4);
        System.out.println("String Comparison " + sixthString);
    }
}
