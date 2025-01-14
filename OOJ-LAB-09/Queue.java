interface Queue {
    void enqueue(int item);
    int dequeue();
    void display();
}
class FixedQueue implements Queue {
    private int[] queue;
    private int front, rear, size;

    public FixedQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == queue.length) {
            System.out.println("Queue Overflow");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = item;
            size++;
        }
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int item = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return item;
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }
            System.out.println();
        }
    }
}
class DynamicQueue implements Queue {
    private int[] queue;
    private int front, rear, size;

    public DynamicQueue(int initialCapacity) {
        queue = new int[initialCapacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == queue.length) {
            int[] newQueue = new int[queue.length * 2];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(front + i) % queue.length];
            }
            queue = newQueue;
            front = 0;
            rear = size - 1;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int item = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return item;
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue queue;
        System.out.println("Enter 'fixed' for Fixed Queue or 'dynamic' for Dynamic Queue:");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("fixed")) {
            System.out.println("Enter size of Fixed Queue:");
            int size = sc.nextInt();
            queue = new FixedQueue(size);
        } else {
            System.out.println("Enter initial size of Dynamic Queue:");
            int size = sc.nextInt();
            queue = new DynamicQueue(size);
        }

        while (true) {
            System.out.println("1. Enqueue 2. Dequeue 3. Display 4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter element to enqueue:");
                int element = sc.nextInt();
                queue.enqueue(element);
            } else if (choice == 2) {
                int dequeued = queue.dequeue();
                if (dequeued != -1) {
                    System.out.println("Dequeued: " + dequeued);
                }
            } else if (choice == 3) {
                queue.display();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
