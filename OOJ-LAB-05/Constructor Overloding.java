class Cal {
    public Cal() {
        System.out.println("Default constructor called.");
    }
    public Cal(int a) {
        System.out.println("Single parameter constructor called with value: " + a);
    }
    public Cal(int a, int b) {
        System.out.println("Two parameters constructor called with values: " + a + " and " + b);
    }
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(5);
        Calculator calc3 = new Calculator(3, 7);

        System.out.println("Sum of 2 integers: " + calc1.add(5, 10));
        System.out.println("Sum of 2 doubles: " + calc1.add(5.5, 10.5));
        System.out.println("Sum of 3 integers: " + calc1.add(1, 2, 3));
    }
}
