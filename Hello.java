// CLASS AND OBJECT PRACTICLE IN JAVA-->

class Calculator
{
    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }

}

public class Hello
{
    public static void main(String a[])
    {
        int num1=4;
        int num2=5;
        
        //OBJECT CREATION-
        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        // int result = num1 + num2;
        System.out.println(result);
    }

} 