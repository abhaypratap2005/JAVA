// Importing the required classes
import java.util.*;

public class ThreadPriorityExample extends Thread {
    public void run() {
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args) {
        ThreadPriorityExample th1 = new ThreadPriorityExample();
        ThreadPriorityExample th2 = new ThreadPriorityExample();
        ThreadPriorityExample th3 = new ThreadPriorityExample();

        // Displaying the default priorities
        System.out.println("Priority of th1: " + th1.getPriority());
        System.out.println("Priority of th2: " + th2.getPriority());
        System.out.println("Priority of th3: " + th3.getPriority());

        // Setting priorities explicitly
        th1.setPriority(6);
        th2.setPriority(3);
        th3.setPriority(9);

        // Displaying updated priorities
        System.out.println("Updated priority of th1: " + th1.getPriority());
        System.out.println("Updated priority of th2: " + th2.getPriority());
        System.out.println("Updated priority of th3: " + th3.getPriority());

        // Main thread details
        System.out.println("Currently executing thread: " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread: " + Thread.currentThread().getPriority());
    }
}
