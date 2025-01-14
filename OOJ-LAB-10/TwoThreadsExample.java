class Message1Thread extends Thread {
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Message2Thread extends Thread {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TwoThreadsExample {
    public static void main(String[] args) {
        Message1Thread thread1 = new Message1Thread();
        Message2Thread thread2 = new Message2Thread();

        thread1.start();
        thread2.start();
    }
}
