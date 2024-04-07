// STATIC VARIABLE--MAKING SOMETHING AS A CLASS MEMBER NOT A OBJECT MEMBER--

class Mobile 
{

  // called instance variable
  String brand;
  int price;
  Static String name;  // by using static we are making it common for all objects.

  public void show()
  {
    //varible inside method is called local variable
    // In non-static method we can use static variable
    System.out.println(brand + " : " + price + ":" + name +":");
  }
}

public class Hello
{
  public static void main(String a[])
  {
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price ="1500";
    // obj1.name = "SmartPhone";
    Mobile.name = "SmartPhone";  // static variable should be called with class name

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = "1700";
    // obj2.name = "SmartPhone";
    Mobile.name = "SmartPhone";
   

    obj1.name = "Phone"; // we are changing the name of obj1 but it will also change the name of obj2 as well because we are using static

    obj1.show();
    obj2.show();

  }
}