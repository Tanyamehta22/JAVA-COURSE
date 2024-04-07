// DEFUALT VS PARAMETERIZED CONSTRUCTOR IN JAVA---

class Human 
{
  private int age;
  priavte String name;


    //CONSRUCTOR - THEY HAVE SAME NAME AS CLASS AND ARE SIMILAR TO METHOD EXCEPT THEY DON'T HAVE A RETURN TYPE--->
    // WE DON'T NEED TO CALL A CONSTRUCTOR, WHENEVER WE CREATE AN OBJECT IT CALLS THE CONSTRUCTOR.
    // EVEN IF WE DO NOT CREATE A CONSTRUCTOR IT WILL AUTOMATICALLY BE CREATED 
    // BY DEFAULT WE CAN  ALSO ASSIGN VALUE IN CONSTRUCTOR-->

    // DEFAULT CONSTRUCTOR-->
    public Human()
    {
        // System.out.println("in constructor");
        age =12;
        name = "John";
    }

    // PARAMETERIZED CONSTRUCTOR-->
    public Human (int a, String n)
    {
        age = a;
        name = n;
    }

  // getter->
  public int getAge()
  {
    return age;
  }

  //setter->
  public void setAge(int age)
  {
      this.age = age; //THIS IS A KEYWORD THAT REPRESENTS CURRENT OBJECT..OBJECT WHICH IS CALLING THE METHOD.
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name =name;
  }
}

public class Demo
{
  public static void mai(String a[])
  {
    Human obj = new Human();
    Human obj1 = new Human(a:18, n:"Navin");
    System.out.println(obj.getName() + " : " + obj.getAge())
    System.out.println(obj1.getName() + " : " + obj1.getAge())

    // obj.age=11;
    // obj.name = "Navin";

    // obj.setAge(a:30);
    // obj.setName(n: "Reddy");

     
  }
}