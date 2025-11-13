class notDivisibleBy7 extends Exception {
    notDivisibleBy7(String msg) {
        super(msg);
    }
}

public class DivisibleBy7 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            if (num % 7 != 0)
                throw new notDivisibleBy7(" Number not divisible by 7!");
            else
                System.out.println("yes, " + num + " is divisible by 7.");
        } catch (notDivisibleBy7 e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid number in command line.");
        }
    }
}
