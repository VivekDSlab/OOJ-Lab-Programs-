import java.util.Scanner;

class Sgpa 
{
    String name;
    String usn;
    int credits[] = new int[5];
    int marks[] = new int[5];
    double sgpa;
    int grade[] = new int[5];

    double calculate(int m[], int c[]) 
  {
        int j;
        double sum = 0.0;
        int div = 0;
        for (j = 0; j < 5; j++) 
        {
            if (m[j] != 100) 
            {
                grade[j] = (m[j] + 10) / 10;
            } 
            else 
            {
                grade[j] = 10;
            }
            div = credits[j] + div;
            sum = sum + (grade[j] * credits[j]);
            System.out.println("Grade for subject " + (j + 1) + ": " + grade[j]); // error check
        }
        sgpa = sum / div;
        System.out.println("SGPA: " + sgpa);
        return sgpa;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and then USN:");
        Sgpa obj = new Sgpa();
        obj.name = sc.nextLine();
        obj.usn = sc.nextLine();
        System.out.println("Now enter subject credits:");
        int i;
        for (i = 0; i < 5; i++) 
        {
            obj.credits[i] = sc.nextInt();
        }
        System.out.println("Now enter subject marks:");
        for (i = 0; i < 5; i++) 
        {
            obj.marks[i] = sc.nextInt();
        }
        double result = obj.calculate(obj.marks, obj.credits);
        System.out.println("Final SGPA for " + obj.name + " (" + obj.usn + ") is: " + result);
    }
}
