
class student
{
    int marks;
    String name;
    int rollno;
}

public class Array_of_objects
{
    public static void main(String a[])
    {
        student s1 = new student();
        s1.rollno = 9;
        s1.marks = 81;
        s1.name = "Donga";

        student s2 = new student();
        s2.name = "Sudhi";
        s2.rollno = 2;
        s2.marks = 88;

        student s3 = new student();
        s3.name = "Deva";
        s3.rollno = 3;
        s3.marks = 93;

        student sarray[] = new student[3] ;  //(Like new int , here new student because of class named student)
        sarray[0] = s1;
        sarray[1] = s2;
        sarray[2] = s3;


        System.out.println(s1.name + ":" + s1.marks);


        for(int i = 0; i<sarray.length;i++)
        {
            System.out.println(sarray[i].name + ":" + sarray[i].marks);
        }

       


    }
}