import java.util.Scanner;

class MyException extends Exception {
    int param;

    public MyException(int param) {
        this.param = param;
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number for division: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException();
            }

            int result = num1 / num2;
            System.out.println("Division Result: " + result);

            System.out.print("Enter a string to parse to number: ");
            String inputString = scanner.next();
            int parsedNumber = Integer.parseInt(inputString);

            System.out.print("Enter index to access in string: ");
            String exampleString = "Example";
            int indexString = scanner.nextInt();
            System.out.println("Character: " + exampleString.charAt(indexString));

            System.out.print("Enter index to access in array: ");
            int indexArray = scanner.nextInt();
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Array value: " + numbers[indexArray]);

            throw new MyException(5);

        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage().contains("string") ? "Index is invalid" : "Array index is invalid");
        } catch (MyException e) {
            System.out.println("MyException[" + e.param + "]");
        } catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception Handling Completed");
        }

        scanner.close();
    }
}
