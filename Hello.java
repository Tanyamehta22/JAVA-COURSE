// STRINGBUFFER AND STRINGBUILDER IN JAVA--
public class Hello
{
  public static void main(string a[])
  {
        StringBuffer sb = new StringBuffer(); // return 16 as this is the buffer size

        StringBuffer sb = new Stringbuffer("Navin"); // will return 21 (16+5)

        System.out.println(sb.capacity());
        System.out.println(sb.length()); //return 5

        sb.append("Reddy")
        System.out.println(sb) // will return Navin Reddy

        String str = sb.toString(); //will convert stringbuffer to string using tostring

        sb.deleteCharAt(index:2); //delete the index at the given data

        sb.insert(0, "Java");
        sb.setLength(newlength :30);
        sb.ensureCapacity(minimumCapacity: 100);

        // DIFFERENCE BETWEEN STRING BUFFER AND STRING BUILDER--
        // STRING BUFFER IS THREAD SAFE AND STRING BUIDER IS NOT
  }
}