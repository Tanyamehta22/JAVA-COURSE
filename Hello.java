//  THIS AND SUPER METHOD IN JAVA-->>

// NOTE-> EVERY CLASS IN JAVA EXTEND AN OBJECT CLASS-->
class A extends Object
{
    public A()
    {
        super(); // CALLING CONSTRUCTOR OF OBJECT CLASS
        System.out.println("in A");
    }

    public A( int n)
    {
        super();
        System.out.println("in A int");
    }

}

class B extends A 
{
    public B()
    {
        super(); // Super calls the constructor of super class this method is always here even if we don't write it. 
        System.out.println("in B");

    }

    public B(int n)
    {
        this(); // this will excute the constructor of the same class 
        // super(n); // now a parameteised super class will be called
        System.out.println("in B int");

    }
}

public class Hello
{
    public static void main(String a[])
    {
        B obj = new B();
    }

}