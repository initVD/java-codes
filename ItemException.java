import java.util.*;

class QuantityException extends Exception {
    QuantityException(String msg) {
        super(msg);
    }
}

class PriceException extends Exception {
    PriceException(String msg) {
        super(msg);
    }
}

class Item {
    int code;
    String description;
    int quantity;
    double rate;

    Item(int code, String description, int quantity, double rate) {
        this.code = code;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;
    }

    void display() {
        System.out.println("Code: " + code + " | Description: " + description + 
                           " | Quantity: " + quantity + " | Rate: ₹" + rate);
    }
}

public class ItemException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("\nEnter details for item " + (i + 1) + ":");
                System.out.print("Item Code: ");
                int code = sc.nextInt();
                sc.nextLine();
                System.out.print("Description: ");
                String desc = sc.nextLine();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                System.out.print("Rate: ");
                double rate = sc.nextDouble();

                if (qty <= 0)
                    throw new QuantityException("❌ Quantity must be greater than zero!");
                if (rate <= 0)
                    throw new PriceException("❌ Rate must be greater than zero!");

                items[i] = new Item(code, desc, qty, rate);
            }

            System.out.println("\n✅ Item Details:");
            for (Item i : items) i.display();

        } catch (QuantityException | PriceException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
