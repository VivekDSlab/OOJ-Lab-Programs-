import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0));
            }
        }
        System.out.println("Your initials are: " + initials.toString().toUpperCase());
        scanner.close();
    }
}
