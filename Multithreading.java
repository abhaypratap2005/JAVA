// Creating a class that implements the Runnable interface
class MyThread implements Runnable {
    // Defining the run method that contains the logic of the thread
    public void run() {
        // Printing the name of the current thread
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}

// Creating a class that contains the main method
public class Multithreading {
    // The main method
    public static void main(String[] args) {
        // Creating two objects of MyThread class
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        // Creating two threads and passing the MyThread objects as the target
        Thread thread1 = new Thread(t1, "Thread-1");
        Thread thread2 = new Thread(t2, "Thread-2");
        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
