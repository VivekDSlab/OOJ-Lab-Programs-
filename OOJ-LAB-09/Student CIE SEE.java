// File: CIE/Student.java
package CIE;

public class Student {
    public String usn, name;
    public int sem;

    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }
}
// File: CIE/Internals.java
package CIE;

public class Internals {
    public int[] internalMarks = new int[5];
}
// File: SEE/External.java
package SEE;

import CIE.Student;

public class External extends Student {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }
}
// File: Main.java
import CIE.*;
import SEE.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        External[] students = new External[n];
        Internals[] internals = new Internals[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            students[i] = new External(usn, name, sem);
            internals[i] = new Internals();

            System.out.println("Enter internal marks (5 courses):");
            for (int j = 0; j < 5; j++) {
                internals[i].internalMarks[j] = sc.nextInt();
            }

            System.out.println("Enter SEE marks (5 courses):");
            for (int j = 0; j < 5; j++) {
                students[i].seeMarks[j] = sc.nextInt();
            }
        }

        System.out.println("\nFinal Marks:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student: " + students[i].name + " (" + students[i].usn + ")");
            for (int j = 0; j < 5; j++) {
                int finalMarks = internals[i].internalMarks[j] + (students[i].seeMarks[j] / 2);
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
            System.out.println();
        }
        sc.close();
    }
}
