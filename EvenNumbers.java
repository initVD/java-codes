public class EvenNumbers {
    public static void main(String[] args) {
        
        System.out.println("Even numbers between 51 and 100:");
        
        // Start at 52 (the first even number in the range)
        // and add 2 in each loop iteration
        for (int i = 52; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}