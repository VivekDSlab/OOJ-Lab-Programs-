import java.util.ArrayList;
import java.util.Scanner;

class InvalidUSNException extends Exception {
    public InvalidUSNException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidSemesterException extends Exception {
    public InvalidSemesterException(String message) {
        super(message);
    }
}

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();
            if (!usn.matches("S\\d{5}")) {
                throw new InvalidUSNException("Invalid USN");
            }

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            if (!name.matches("[a-zA-Z ]+")) {
                throw new InvalidNameException("Invalid Name");
            }

            System.out.print("Enter Semester (1-8): ");
            int semester = scanner.nextInt();
            if (semester < 1 || semester > 8) {
                throw new InvalidSemesterException("Invalid Semester");
            }

            scanner.nextLine();
            ArrayList<String> courses = new ArrayList<>();
            System.out.print("Enter number of courses to register: ");
            int numCourses = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numCourses; i++) {
                System.out.print("Enter course name: ");
                String course = scanner.nextLine();
                courses.add(course);
            }

            System.out.println("\nStudent Registration Successful");
            System.out.println("USN: " + usn);
            System.out.println("Name: " + name);
            System.out.println("Semester: " + semester);
            System.out.println("Courses Registered: " + courses);

        } catch (InvalidUSNException e) {
            System.err.println(e.getMessage());
        } catch (InvalidNameException e) {
            System.err.println(e.getMessage());
        } catch (InvalidSemesterException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error occurred");
        } finally {
            scanner.close();
        }
    }
}
