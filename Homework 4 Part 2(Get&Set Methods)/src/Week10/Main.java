package Week10;

public class Main
{
    public static void main(String args[])
    {
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
