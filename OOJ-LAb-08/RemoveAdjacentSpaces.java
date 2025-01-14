
import java.util.Scanner;

public class RemoveAdjacentSpaces {
    public static String removeExtraSpaces(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with adjacent spaces: ");
        String input = scanner.nextLine();
        String result = removeExtraSpaces(input);
        System.out.println("String after removing extra spaces: " + result);
    }
}
