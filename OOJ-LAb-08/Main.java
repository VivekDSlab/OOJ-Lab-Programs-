package myPackage;
public class Greet {
    public void displayMessage() {
        System.out.println("Hello from myPackage!");
    }
}


import myPackage.Greet;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.displayMessage();
    }
}
