// DYNAMIC METHOD DISPATCH IN JAVA--->>
class A
{
    public void show()
    {
        System.out.println("in A Show");
    }
        
    
}

class B extends A
{
    public void show()
    {
        System.out.println("in B Show");
    }

}

class C extends A
{
    public void show()
    {
        System.out.println("in C Show");
    }

}

 

public class Demo {
    public static void main(String a[])
    {
    //    A obj = new B(); // THIS IS POSSIBLE TO CREATE REFERENCE OF A SUPERCLASS AND OBJECT OF SUBCLASS
    //    obj.show();

    // THIS IS CALLED DYNAMIC METHOD DISPATCH-- WE DO NOT KNOW WHICH MWTHOD WILL RUN..IT WILL BE DECIDED IN RUN TIME.
       A obj = new A();  
       obj.show();

       obj = new B();
       obj.show();

       Obj = new C();
       obj.show();
    }
}