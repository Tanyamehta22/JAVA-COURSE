//Object Class equals toString hashcode in Java--->>

class Laptop
{
    String mode;
    int price;

       
    @Override
    public String toString() {
        return "Laptop [mode=" + mode + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mode == null) ? 0 : mode.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (mode == null) {
            if (other.mode != null)
                return false;
        } else if (!mode.equals(other.mode))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    

     

   
}


public class Demo
{
    public static void main (String a[])
    {
        Laptop obj1 = new Laptop();
        obj1.model = "levenovo yoga";
        obj1.price = 1000;


        Laptop obj2 = new Laptop();
        obj2.model = "levenovo yoga1";
        obj2.price = 1000;


        boolean result = obj1.equals(obj2);

        // System.out.println(obj.toString()); // if this method is not implemented we will use the normal tostring default way but if its method is given , we will print the method.
        // this tostring is default..we may not need to type it.
        System.out.println(obj);
    }
}