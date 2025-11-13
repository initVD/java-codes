import java.util.*;

class NegativeValueException extends Exception {
    NegativeValueException(String msg) {
        super(msg);
    }
}

public class NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0)
                throw new NegativeValueException("❌ Negative Value Entered!");
            else
                System.out.println("✅ Positive Number: " + num);
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
