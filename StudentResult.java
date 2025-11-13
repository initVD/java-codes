import java.util.*;

interface CalculateResult {
    void CalculateTotal();
    void CalculatePercentage();
    void CalculateGrade();
}

class ZeroMarksException extends Exception {
    ZeroMarksException(String msg) {
        super(msg);
    }
}

class Student implements CalculateResult {
    String name;
    int m1, m2, m3;
    int total;
    double percentage;
    String grade;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void CalculateTotal() {
        total = m1 + m2 + m3;
    }

    public void CalculatePercentage() {
        percentage = total / 3.0;
    }

    public void CalculateGrade() {
        if (percentage >= 75) grade = "Distinction";
        else if (percentage >= 60) grade = "First Class";
        else if (percentage >= 50) grade = "Second Class";
        else grade = "Fail";
    }

    void display() {
        System.out.println(name + " | Total: " + total + " | %: " + percentage + " | Grade: " + grade);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();
            Student[] s = new Student[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for student " + (i + 1));
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks in 3 subjects: ");
                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();
                sc.nextLine();

                if (m1 < 0 || m2 < 0 || m3 < 0)
                    throw new ZeroMarksException("❌ Negative marks are not allowed!");

                s[i] = new Student(name, m1, m2, m3);
                s[i].CalculateTotal();
                s[i].CalculatePercentage();
                s[i].CalculateGrade();
            }

            System.out.println("\n✅ Student Results:");
            for (Student st : s) st.display();

        } catch (ZeroMarksException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
