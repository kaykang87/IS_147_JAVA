/* Kyong Kang
   kyongk1@umbc.edu
 */

package com.company;

public class Main {
    public static void main(String[] args)
    {
        stringMethods();
    }
    public static void stringMethods()
    {
        String hello = "Hello World";
        System.out.println(hello.length());
        System.out.println(hello.substring(0, 5));
        System.out.println(hello.indexOf('W'));
        System.out.println(hello.charAt(6));
        System.out.println(hello.toUpperCase());
        String[] array = hello.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(hello.contains("Hello"));
        String hello1 = "hello world";
        System.out.println(hello.equalsIgnoreCase(hello1));
    }
}
