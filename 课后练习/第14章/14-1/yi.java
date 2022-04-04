public class yi {

    public static void main(String[] args) {

        String text = "001234A2";

        int value = toInteger(text);

        System.out.println("Value= " + value);

    }

    public static int toInteger(String text) {
        try {

            System.out.println("Begin parse text: " + text);

            // An Exception can throw here (NumberFormatException).
            int value = Integer.parseInt(text);

            return value;

        } catch (NumberFormatException e) {

           
            // In the case of 'text' is not a number.
            // This catch block will be executed.            
            System.out.println("Number format exception " + e.getMessage());

            // Returns 0 if NumberFormatException occurs
            return 0;

        } finally {

            System.out.println("End parse text: " + text);

        }
    }

}