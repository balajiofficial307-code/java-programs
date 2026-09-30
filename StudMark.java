import java.lang.*;
import java.io.*;
class student
{
    String name, result, grade;
    int roll_no;
    int m1, m2, m3, m4;
    int total;
    float per;
    void getdata() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name of Student");
        name = br.readLine();
        System.out.println("Enter Roll No. of Student");
        roll_no = Integer.parseInt(br.readLine());
        System.out.println("Enter marks for 1st subject: ");
        m1 = Integer.parseInt(br.readLine());
        System.out.println("Enter marks for 2nd subject:");
        m2 = Integer.parseInt(br.readLine());
        System.out.println("Enter marks for 3rd subject: ");
        m3 = Integer.parseInt(br.readLine());
        System.out.println("Enter marks for 4th subject: ");
        m4 = Integer.parseInt(br.readLine());
    }
    void calculate()
    {
        total = m1 + m2 + m3 + m4;
        per = total / 4;
        if (m1 >= 30 && m2 >= 30 && m3 >= 30 && m4 >= 30)
        {
            result = "Pass";
            if (per >= 75)
                grade = "First Class with Distinction";
            else if (per < 75 && per >= 60)
                grade = "First Class";
            else if (per < 60 && per >= 50)
                grade = "Second Class";
            else
                grade = "Third Class";
        }
        else
        {
            result = "Fail";
            grade = "*****";
        }
    }
    void show()
    {
        System.out.println("\tStudentMarklist");
        System.out.println("\t****************");
        System.out.println("\tRoll No. = " + roll_no);
        System.out.println("\tStudent Name = " + name);
        System.out.println("\tMarks of 1st Subject = " + m1);
        System.out.println("\tMarks of 2nd Subject = " + m2);
        System.out.println("\tMarks of 3rd Subject = " + m3);
        System.out.println("\tMarks of 4th Subject = " + m4);
        System.out.println("\tTotal Marks = " + total);
        System.out.println("\tPercentage = " + per + "%");
        System.out.println("\tResult = " + result);
        System.out.println("\tGrade = " + grade);
    }
}
class StudMark
{
    public static void main(String args[]) throws IOException
    {
        student s = new student();
        s.getdata();
        s.calculate();
        s.show();
    }
}