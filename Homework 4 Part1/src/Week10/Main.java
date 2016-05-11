package Week10;

public class Main{
    public Main(){
        System.out.println("Default constructor");
    }
    public Main(String str){
        //It will call a default constrctor
        System.out.println("Parametrized constructor with single param");
    }
    public Main(String str, int num){
        //It will call the constructor with String argument

        System.out.println("Parametrized constructor with double args");
    }
    public Main(int num1, int num2, int num3){
        // It will call the constructor with (String, integer) arguments

        System.out.println("Parametrized constructor with three args");
    }
    public static void main(String args[]){
        //Creating an object using Constructor with 3 int arguments

    }
}