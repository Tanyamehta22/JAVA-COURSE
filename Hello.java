/  INHERITANCE IN JAVA--


public class Hello
{
    public static void main(String a [])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(7,3);
        int r2 = obj.sub(4,5);
        int r3 = obj.multi(4,5);
        int r4 = obj.div(4,5);
        double r5 = obj.power(r3, r4);

        System.out.println(r1 + "" + r2 + ""  + r3 + "" + r4 + "" + r5);
    }
}


public class VeryAdvCalc extends AdvCalc
{
 public double power(int n1, int n2)
 {
    return Math.pow(n1,n2);
 }   
}