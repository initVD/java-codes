import java.util.*;

abstract class Staff {
    int no;
    String name;

    void initData(int no, String name) {
        this.no = no;
        this.name = name;
    }

    abstract void calculateSalary();
}

class Typist extends Staff {
    int speed;
    double salary;

    Typist(int no, String name, int speed) {
        initData(no, name);
        this.speed = speed;
    }

    void calculateSalary() {
        if (speed < 40)
            salary = 4000;
        else
            salary = 5000;
    }

    void display() {
        System.out.println("\n--- Typist Details ---");
        System.out.println("ID: " + no);
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed + " wpm");
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Typist ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Typist Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Typing Speed (wpm): ");
        int spd = sc.nextInt();

        Typist t = new Typist(id, name, spd);
        t.calculateSalary();
        t.display();

        sc.close();
    }
}
