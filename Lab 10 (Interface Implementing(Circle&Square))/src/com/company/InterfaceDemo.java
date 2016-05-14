/* Kyong Kang
    kyongk1@umbc.edu
 */

package com.company;
import java.lang.Math;

public class InterfaceDemo
{
    public static void main(String args[])
    {
        //programming for interfaces not implementation
        Shape shape = new Circle(1);
        shape.draw();
        System.out.println("Area="+shape.getArea());
        //switching from one implementation to another easily
        Rectangle shape1 = new Rectangle(5,5);
        shape1.draw();
        System.out.println("Area="+shape1.getArea());
    }
}
//create interface with name Shape
interface Shape
{
    void draw();
    double getArea();
}
class Circle implements Shape                       //circle class that implements shape interface
{
    private double radius;
    public Circle()
    {
        System.out.println("Circle Constructor");
    }
    public Circle(double r) {
        this.radius = r;
    }
    @Override
    public void draw()
    {
        System.out.println ("Drawing Circle");
    }
    @Override
    public double getArea()
    {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }
    public double getRadius()
    {
        return this.radius;
    }
}
class Rectangle implements Shape
{
    private double width;
    private double height;
    public Rectangle()
    {
        System.out.println("Rectangle Constructor");
    }
    public Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }
    @Override
    public void draw()
    {
        System.out.println ("Drawing Rectangle");
    }
    @Override
    public double getArea()
    {
        return this.height * this.width;
    }
}