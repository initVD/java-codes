/**
 * Main application class to run two different tasks on separate threads.
 */
public class ThreadApplication {

    public static void main(String[] args) {
        // 1. Create the task objects
        // We are using the "Runnable" interface, which is the standard way
        // to define a task that a thread can run.
        AlphabetTask alphabetTask = new AlphabetTask();
        FibonacciTask fibonacciTask = new FibonacciTask();

        // 2. Create the Thread objects and give them their tasks
        Thread alphabetThread = new Thread(alphabetTask);
        Thread fibonacciThread = new Thread(fibonacciTask);

        // 3. Start both threads
        // Calling .start() tells the Java Virtual Machine (JVM) to
        // create a new thread and execute the .run() method of the task.
        // It does NOT call .run() directly.
        System.out.println("Starting both threads...");
        alphabetThread.start();
        fibonacciThread.start();
        System.out.println("Main method is done. Threads are now running.");
    }
}

/**
 * Task 1: Prints the alphabet 'A' through 'Z' 50 times.
 */
class AlphabetTask implements Runnable {
    
    @Override
    public void run() {
        System.out.println(">>> Alphabet Thread: Starting...");
        
        for (int i = 1; i <= 50; i++) {
            // Inner loop prints A-Z on one line
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.print(c);
            }
            // Add a new line and the count after each full A-Z sequence
            System.out.println(" (Alphabet Iteration " + i + ")");
        }
        
        System.out.println(">>> Alphabet Thread: Finished.");
    }
}

/**
 * Task 2: Prints the first 15 terms of the Fibonacci series.
 */
class FibonacciTask implements Runnable {

    @Override
    public void run() {
        System.out.println("### Fibonacci Thread: Starting...");
        
        int n = 15; // Number of terms to print
        
        // Using 'long' is safer for Fibonacci as numbers get big,
        // though 'int' would be fine for just 15 terms.
        long a = 0;
        long b = 1;

        System.out.print("### Fibonacci Thread: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            // Calculate the next term
            long nextTerm = a + b;
            
            // Update the previous two terms for the next loop
            a = b;
            b = nextTerm;
        }
        // Print a newline at the end
        System.out.println(); 
        
        System.out.println("### Fibonacci Thread: Finished.");
    }
}