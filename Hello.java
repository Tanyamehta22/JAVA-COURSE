//  INHERITANCE IN JAVA--


public class Hello
{
    public static void main(String a [])
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(7,3);
        int r2 = obj.sub(4,5);
        int r3 = obj.multi(4,5);
        int r4 = obj.div(4,5);

        System.out.println(r1 + "" + r2 + ""  + r3 + "" + r4);
    }
}


public class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1*n2;   
    }

    public int div(int n1, int n2)
    {
        return n1/n2;   
    }
}


public class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

