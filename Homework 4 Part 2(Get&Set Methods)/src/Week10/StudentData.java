/* Kyong Kang
   kyongk1@umbc.edu
 */

package Week10;

public class StudentData
{
    // create 3 private properties studentID, studentName, studentAge
    private int studentIDNUM;
    private String studentID;
    private String studentName;
    private int studentAge;

    //create default constructor and assign default values to above properties
    public StudentData()
    {
        studentIDNUM = 12345;
        studentID = "UMBC";
        studentName = "Kyong Kang";
        studentAge = 25;
    }
    //create parameterized constructor which takes 3 parameters
    //pass and assign properties
    public StudentData(String id, int idnum)
    {
        System.out.print("Your Student ID is ");
        System.out.println(id + idnum);
    }
    public StudentData(String name)
    {
        System.out.print("Your name is ");
        System.out.println(name);
    }
    public StudentData(int num)
    {
        System.out.print("Your age is ");
        System.out.println(num);
    }
    // define Getter and setter methods for all properties
}
class TestOverloading {
    public static void main(String args[]) {
        //This object creation would call the default constructor
        //StudentData()
       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
        StudentData calling = new StudentData();
        calling.StudentData(studentID, studentIDNUM);
        calling.StudentData(studentName);
        calling.StudentData(studentAge);
    }
}