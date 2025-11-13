import java.util.*;

class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) {
        super(msg);
    }
}

public class EmailException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Email Address: ");
            String email = sc.nextLine();

            if (Character.isDigit(email.charAt(0)) || !email.contains("@"))
                throw new InvalidEmailException("❌ Invalid Email Address!");
            else
                System.out.println("✅ Valid Email: " + email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
