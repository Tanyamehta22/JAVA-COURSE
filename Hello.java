 // METHOD OVERRIDING IN JAVA-->>

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+ n2;
    }

    
}

class AdvCalc extends Calc
{
    // this method override the above method of A as more preferernce is given to its own method-->>
    public int add(int n1, int n2)
    {
        return n1+ n2+1;
    }


}

public class Hello
{
    public static void main(String a[])
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(n1:3, n2:4);
        System.out.println(r1);
    }
}