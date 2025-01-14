interface Stack {
    void push(int item);
    int pop();
    void display();
}
class FixedStack implements Stack {
    private int[] stack;
    private int top;

    public FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
class DynamicStack implements Stack {
    private int[] stack;
    private int top;

    public DynamicStack(int initialSize) {
        stack = new int[initialSize];
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack;
        System.out.println("Enter 'fixed' for Fixed Stack or 'dynamic' for Dynamic Stack:");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("fixed")) {
            System.out.println("Enter size of Fixed Stack:");
            int size = sc.nextInt();
            stack = new FixedStack(size);
        } else {
            System.out.println("Enter initial size of Dynamic Stack:");
            int size = sc.nextInt();
            stack = new DynamicStack(size);
        }

        while (true) {
            System.out.println("1. Push 2. Pop 3. Display 4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter element to push:");
                int element = sc.nextInt();
                stack.push(element);
            } else if (choice == 2) {
                int popped = stack.pop();
                if (popped != -1) {
                    System.out.println("Popped: " + popped);
                }
            } else if (choice == 3) {
                stack.display();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
