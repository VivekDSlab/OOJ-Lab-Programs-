
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = removeDuplicates(input);
        System.out.println("String after removing consecutive duplicates: " + result);
    }
}
