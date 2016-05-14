/* Kyong KAng
    kyongk1@umbc.edu
 */

package com.company;
import java.lang.Math;

//create Operation class
// define method name square with return type  int
// return n*n;
class Operation
{
    public String square(int n)
    {
        int squareArea = n*n;
        return("Area if the square is " + squareArea); //return n*n;
    }
}
public class Circle
{
    Operation o = new Operation();//create operation class object here
    final double PI = Math.PI;// define Math.PI property
    double area(int radius)
    {
       System.out.println(o.square(5));  //call  square method inside the area method
                    // return the area of a square value;
       double area = PI * Math.pow(radius, 2);
       return area; // return "How do I fix this";
    }

    public static void main(String args[])
    {
        //create Circle class object
        Circle c = new Circle();
        //call circle class area method pass some default value
        //store the result of area method into new variable
        double result = c.area(10);
        //print the result using variable;
        System.out.print("Area if the circle is " + result);
    }
}