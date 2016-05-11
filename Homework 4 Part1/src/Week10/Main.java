package Week10;

public class Main{
    public Main(){
        System.out.println("Default constructor");
    }
    public Main(String str){
        //It will call a default constructor
        System.out.println(str);
    }
    public Main(String str, int num){
        //It will call the constructor with String argument
        System.out.println(str + " and " + num);
    }
    public Main(int num1, int num2, int num3){
        // It will call the constructor with (String, integer) arguments
        System.out.println(num1 + " " + num2 + " " + num3);
    }
    public static void main(String args[]){
        //Creating an object using Constructor with 3 int arguments
        Main constructor = new Main();
        Main constructor1 = new Main("Parametrized constructor with single param");
        Main constructor2 = new Main("Parametrized constructor with single param", 147);
        Main constructor3 = new Main(147, 157, 167);
    }
}