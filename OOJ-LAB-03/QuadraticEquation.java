import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        // Check for real solutions
        if (discriminant > 0) {
            // Two real and distinct solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("There are two real solutions: x1 = %.2f, x2 = %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            // One real solution
            double root = -b / (2 * a);
            System.out.printf("There is one real solution: x = %.2f%n", root);
        } else {
            // No real solutions
            System.out.println("There are no real solutions.");
        }
        scanner.close();
    }
}
