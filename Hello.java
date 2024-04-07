// CONSTRUCTOR IN JAVA---

class Human 
{
  private int age;
  priavte String name;


    //CONSRUCTOR - THEY HAVE SAME NAME AS CLASS AND ARE SIMILAR TO METHOD EXCEPT THEY DON'T HAVE A RETURN TYPE--->
    // WE DON'T NEED TO CALL A CONSTRUCTOR, WHENEVER WE CREATE AN OBJECT IT CALLS THE CONSTRUCTOR.
    // BY DEFAULT WE CAN  ALSO ASSIGN VALUE IN CONSTRUCTOR-->

    public Human()
    {
        // System.out.println("in constructor");
        age =12;
        name = "John";
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
    // obj.age=11;
    // obj.name = "Navin";
    obj.setAge(a:30);
    obj.setName(n: "Reddy");

    System.out.println(obj.getName() + " :" + obj.getAge());
  }
}