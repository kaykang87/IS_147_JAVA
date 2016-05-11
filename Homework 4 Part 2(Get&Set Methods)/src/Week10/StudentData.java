/* Kyong Kang
   kyongk1@umbc.edu
 */

package Week10;

public class StudentData
{
    // create 3 private properties studentID, studentName, studentAge
    private int studentID;
    private String studentName;
    private int studentAge;
    //create default constructor and assign default values to above properties
    public StudentData()
    {
        studentID = 12345;
        System.out.println(studentID);
        studentName = "Kyong Kang";
        System.out.println(studentName);
        studentAge = 25;
        System.out.println(studentAge);
    }
    //create parameterized constructor which takes 3 parameters
    //pass and assign properties
    public StudentData(int studentID, String studentName, int studentAge)
    {
        System.out.println("Your id is " +studentID+ ". Your name is " + studentName + " and your age is " + studentAge);
    }
    // define Getter and setter methods for all properties
    public void setID(int idnum)
    {
        this.studentID = idnum;
    }
    public int getID(){
        return studentID;
    }
    public void setName(String name)
    {
        this.studentName = name;
    }
    public String getName(){
        return studentName;
    }
    public void setAge(int num)
    {
        this.studentAge = num;
    }
    public int getAge(){
        return studentAge;
    }
}
class TestOverloading
{
    public static void main(String args[])
    {
        //This object creation would call the default constructor
        //StudentData()
        StudentData data = new StudentData();
       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
        StudentData data1 = new StudentData(11191987, "Bob Evans", 40);
        data.setName("hahaha");
        System.out.println(data.getName());
        data.setID(58123);
        System.out.println(data.getID());
        data.setAge(18);
        System.out.println(data.getAge());
    }
}
