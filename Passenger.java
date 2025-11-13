import java.util.*;

class Passenger {
    int id;
    String name;
    String destination;
    String contact;

    Passenger(int id, String name, String destination, String contact) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.contact = contact;
    }

    void display() {
        System.out.println("Passenger ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Destination: " + destination);
        System.out.println("Contact: " + contact);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Passenger p[] = new Passenger[10];

        System.out.println("Enter details of 10 passengers:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPassenger " + (i + 1) + " details:");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Destination: ");
            String dest = sc.nextLine();
            System.out.print("Contact: ");
            String contact = sc.nextLine();

            p[i] = new Passenger(id, name, dest, contact);
        }

        System.out.println("\n--- Passenger Details ---");
        for (int i = 0; i < 10; i++) {
            p[i].display();
        }

        sc.close();
    }
}
