/* Kyong Kang
    kyongk1@umbc.edu
 */

package com.company;

public class Area
    {
    private double length;
    private double width;

    public Area()
    {
        length = 0;
        width = 0;
    }
    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

        public void setLength(double length) {
            this.length = length;
        }

    public double getWidth() {
        return width;
    }

        public void setWidth(double width) {
            this.width = width;
        }

    public double getAreaofTriangle()
    {
        return (this.length * (this.width / 2));
    }
    public double getPerimeter()
    {
        return ((this.length *2) + (this.width));
    }
}