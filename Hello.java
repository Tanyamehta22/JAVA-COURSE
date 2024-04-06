public class Hello {
    public static void main(String[] args) {

        //UPDATED SWITCH STATEMENT IN JAVA --

        String day = "Sunday";
        String result = "";

        result = switch(day)
        {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };

        System.out.println(result);
        

    }
}