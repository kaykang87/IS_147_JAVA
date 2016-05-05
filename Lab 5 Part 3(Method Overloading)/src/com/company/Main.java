/*Kyong Kang
  kyongk1@umbc.edu
 */
package com.company;

public class Main
{

    public static void print()
    {
        System.out.println("Kyong Kang");
    }

    public static void main(String[] args)

    {
        print();
        Book bookClass = new Book();
        Book bookClass2 = new Book();

        System.out.println(bookClass.myBook("Book title is different"));
        System.out.println(bookClass.myBook(350));
        System.out.println(bookClass2.myBook(22.55));
        System.out.println("The book is US Published: " + bookClass2.myBook(true));
    }

}
