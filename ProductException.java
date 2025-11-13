import java.util.*;

class InvalidProductException extends Exception {
    InvalidProductException(String msg) {
        super(msg);
    }
}

public class ProductException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Product Code: ");
            String code = sc.nextLine();
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Product Weight: ");
            double weight = sc.nextDouble();

            if (weight > 100) {
                throw new InvalidProductException(" Invalid Product: Weight exceeds 100!");
            } else {
                System.out.println("\n Product Details:");
                System.out.println("Code: " + code);
                System.out.println("Name: " + name);
                System.out.println("Weight: " + weight);
            }
        } catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
