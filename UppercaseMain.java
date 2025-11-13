class UppercaseException extends Exception {
    UppercaseException(String msg) {
        super(msg);
    }
}

public class UppercaseMain {
    public static void main(String[] args) {
        try {
            String input = args[0];
            if (input.equals(input.toUpperCase()))
                throw new UppercaseException("❌ String is in UPPERCASE!");
            else
                System.out.println("✅ Valid String: " + input);
        } catch (UppercaseException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Please provide a string in command line.");
        }
    }
}
