/* Kyong Kang
    kyongk1@umbc.edu
 */

package com.company;

public class Employee
{
    int salary = 100000;
    public Employee()
    {

    }
    public Employee(int salary)
    {
        this.salary=salary;
    }
    public static void main(String args[])
    {
        Programmer p = new Programmer();
        System.out.println ("Programmer salary is:" + p.salary);
        System.out.println ("Bonus of Programmer is:" + p.bonus);
    }
}
class Programmer extends Employee
{
    int bonus = 5000;
    public Programmer()
    {

    }
    public Programmer(int Salary)
    {
        super();//call super class constructor
    }
}
