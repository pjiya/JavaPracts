package Prac;

class CountThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Exp29 {
    public static void main(String[] args) {
        CountThread thread1 = new CountThread();
       // CountThread thread2 = new CountThread();
        
        // Start both threads
        thread1.start();
       // thread2.start();
    }
}
