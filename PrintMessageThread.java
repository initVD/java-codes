// Define the task for printing a message
class MessageTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Java is Awesome");
        }
    }
}

public class PrintMessageThread {
    public static void main(String[] args) {
        // 1. Create the task
        MessageTask task = new MessageTask();
        
        // 2. Create the thread
        Thread messageThread = new Thread(task);
        
        // 3. Start the thread
        messageThread.start();
    }
}