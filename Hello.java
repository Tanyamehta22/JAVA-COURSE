// THIS KEYWORD IN JAVA---

class Human 
{
  private int age;
  priavte String name;

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