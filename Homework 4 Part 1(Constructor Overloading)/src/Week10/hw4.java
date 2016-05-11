package Week10;

public class hw4
{
public hw4()
        {
        System.out.println("Default constructor");
        }
public hw4(String str)
        {
        //It will call a default constructor
        System.out.println(str);
        }
public hw4(String str,int num)
        {
        //It will call the constructor with String argument
        System.out.println(str+" and "+num);
        }
public hw4(int num1,int num2,int num3)
        {
        // It will call the constructor with (String, integer) arguments
        System.out.println(num1+" "+num2+" "+num3);
        }
}
