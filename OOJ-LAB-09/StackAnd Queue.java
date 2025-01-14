interface SimpleStack {
    void push(int item);
    int pop();
    void displayStack();
}

interface SimpleQueue {
    void enqueue(int item);
    int dequeue();
    void displayQueue();
}
import java.util.ArrayList;

class MyDataStructure implements SimpleStack, SimpleQueue {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> queue;

    public MyDataStructure() {
        stack = new ArrayList<>();
        queue = new ArrayList<>();
    }

    // Stack Methods
    public void push(int item) {
        stack.add(item);
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contents: " + stack);
        }
    }

    // Queue Methods
    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue.remove(0);
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue contents: " + queue);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyDataStructure ds = new MyDataStructure();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push to Stack");
            System.out.println("2. Pop from Stack");
            System.out.println("3. Display Stack");
            System.out.println("4. Enqueue to Queue");
            System.out.println("5. Dequeue from Queue");
            System.out.println("6. Display Queue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push to stack: ");
                    int stackItem = sc.nextInt();
                    ds.push(stackItem);
                    break;
                case 2:
                    int poppedItem = ds.pop();
                    if (poppedItem != -1) {
                        System.out.println("Popped from stack: " + poppedItem);
                    }
                    break;
                case 3:
                    ds.displayStack();
                    break;
                case 4:
                    System.out.print("Enter element to enqueue to queue: ");
                    int queueItem = sc.nextInt();
                    ds.enqueue(queueItem);
                    break;
                case 5:
                    int dequeuedItem = ds.dequeue();
                    if (dequeuedItem != -1) {
                        System.out.println("Dequeued from queue: " + dequeuedItem);
                    }
                    break;
                case 6:
                    ds.displayQueue();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
