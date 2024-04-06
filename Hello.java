public class Hello {
    public static void main(String[] args) {

        // LOGICAL OPERATORS--
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // boolean result = x > y && a > b;
        boolean result = x > y || a > b;
        boolean result1 = a > b;
        System.out.println(!result1);
        System.out.println(result);

    }
}