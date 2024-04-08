// FINAL-- ONCE WE USED FINAL ( CONSTANT) WE CANNOT CHANGE THE VALUE.
//  FINAL IS USED IN VARIABLE, METHOD, CLASS-->

//  FINAL CLASS -->>
// final class Calc
// as the class is final not everyone can use it
 class Calc
{
    //FINAL METHOD-->> it helps in avoiding method overriding.
   public final void show()
   {
        System.out.println("By Navin");
   }

   public void add(int a, int b)
   {
    System.out.println(a+b);
   }
}

class AdvCalc extends Calc // this will not be able to implement as Calc is using a final keyword 
{
    public void show()
    {
        System.out.println("By John");
    }
}

public class Demo
{
    public static void main (String a[])
    {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(a:4, b:5);
    }
}

// public class Demo
// {
//     public static void main(String a[])
//     {   
//         // FINAL VARIABLE->
//         final int num =8;
//         num=9;
//         System.out.println(num);
//     }
// } 

 
 