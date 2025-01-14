class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    protected int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Age cannot be less than 0.");
        }
        this.age = age;
        System.out.println("Father's age set to: " + this.age);
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to the father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age set to: " + this.sonAge);
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            Son son = new Son(50, 20);
            System.out.println("Successfully created Son instance with proper age.");
        } catch (WrongAgeException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }

        try {
            Son son = new Son(30, 30);
            System.out.println("Successfully created Son instance with invalid age.");
        } catch (WrongAgeException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }

        try {
            Son son = new Son(-10, 5);
            System.out.println("Successfully created Son instance with invalid father's age.");
        } catch (WrongAgeException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }
}
