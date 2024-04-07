// ENCAPSULATION IN JAVA---

class Human 
{
  private int age;
  priavte String name;

  public int getAge()
  {
    return age;
  }

  public void setAge(int a)
  {
      age = a;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String n)
  {
    name =n;
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