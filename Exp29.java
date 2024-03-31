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
    
        thread1.start();
      
    }
}
