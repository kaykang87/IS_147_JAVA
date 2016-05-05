/* Kyong Kang
   kyongk1@umbc.edu
 */

package com.company;

public class Main {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        System.out.println("The added numbers are " + Add(num1, num2));

        System.out.println("The subtracted numbers are " + Sub(num1, num2));

        System.out.println("The multiplied numbers are " + Mul(num1, num2));

        System.out.println("The divided numbers are " + Div(num1, num2));
    }

    public static int Add(int add1, int add2) {
        int add3 = add1 + add2;
        return add3;
    }
    public static int Sub(int sub1, int sub2){
        int sub3 = sub2 - sub1;
        return sub3;
    }

    public static int Mul(int mul1, int mul2){
        int mul3 = mul1 * mul2;
        return mul3;
    }

    public static int Div(int div1, int div2){
        int div3 = div2 / div1;
        return div3;
    }
}



