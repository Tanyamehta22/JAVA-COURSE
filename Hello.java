// ARRAY OF OBJECTS IN JAVA---

class Student
{
    //instance variable as they are inside class
    int rollno;
    String name;
    int marks;
}
public class Hello
{
    pubic static void main(String a[])
    {

        Student s1 = new Student();
        s1.rollno =1;
        s1.name="Navin";
        s1.marks= 88;

        Student s2 = new Student();
        s2.rollno =2;
        s2.name="Harsh";
        s2.marks= 67;

        Student s1 = new Student();
        s3.rollno =3;
        s3.name="Kiran";
        s3.marks= 97;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0; i<students.length; i++)
        {
            System.out.println(stundents[i].name + ":" + students[i].marks);
        }



        // int nums[] = new int[3];  

        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;
         

   
        // for (int i=0; i<nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }

         
      
    }
}