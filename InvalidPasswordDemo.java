// File name: InvalidPasswordDemo.java

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class InvalidPasswordDemo {
    public static void main(String[] args) {
        String username = "Vaidik";
        String password = "Vaidik123";  // not same → exception will occur

        try {
            if (!username.equals(password)) {
                throw new InvalidPasswordException("❌ Invalid Password: Username and Password do not match!");
            } else {
                System.out.println("✅ Login Successful!");
            }
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
