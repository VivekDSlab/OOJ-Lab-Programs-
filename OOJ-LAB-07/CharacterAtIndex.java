import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < inputString.length()) {
            char character = inputString.charAt(index);
            System.out.println("The character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index! Please enter an index between 0 and " + (inputString.length() - 1));
        }
        scanner.close();
    }
}
