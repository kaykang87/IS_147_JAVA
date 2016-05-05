package com.company;

/**
 * Created by kkang on 3/29/2016.
 */

public class Book
{
    String title = "Greatness of King KK";
    private int pageNumber = 0;
    private double price = 0;
    private boolean usPublished = true;

    public static String myBook(String title)
    {
        return("The title of the book is " + title);
    }
    public static String myBook(int pageNumber)
    {
        return("This book contains " + pageNumber + " pages");
    }
    public static String myBook(double price)
    {
        return("Price of the book is " + "$" + price);
    }
    public static Boolean myBook(boolean usPublished)
    {
        return usPublished;
    }
}
