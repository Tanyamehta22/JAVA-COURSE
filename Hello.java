// STATIC BLOCK--
class Mobile 
{

  // called instance variable
  String brand;
  int price;
  Static String name;  // by using static we are making it common for all objects.

 //STATIC BLOCK--IT WILL BE CALLED ONLY ONCE->

  static
  {
    name = "Phone";
    System.out.println("in statis block");
  }
  public Mobile()
  {
    brand = "";
    price = 200;
    System.out.println("in constructor");
  }

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
    Class.forName(className: "Mobile"); 
    //THIS WILL CALL THE CLASS EVEN WHEN WE DON'T CREATE AN OBJECT

     
    // Mobile obj1 = new Mobile();
    // obj1.brand = "Apple";
    // obj1.price ="1500";
    // // obj1.name = "SmartPhone";
    // Mobile.name = "SmartPhone";  // static variable should be called with class name

    
   

    // obj1.name = "Phone"; // we are changing the name of obj1 but it will also change the name of obj2 as well because we are using static

    // obj1.show();
    // obj2.show();

    // // CALLING STATIC METHOD--
    // Mobile.show1(obj1);

  }
}