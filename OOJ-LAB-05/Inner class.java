import java.util.*;

class OuterClass {
    private String outerField = "Outer Field";

   
    class InnerClass {
        private String innerField = "Inner Field";


        public void display() {
            System.out.println("Accessing from InnerClass:");
            System.out.println("Outer Field: " + outerField);            
System.out.println("Inner Field: " + innerField);
        }
    }


    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.display(); 
    }
}

public class Inner {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(); 
        outer.createInner();     }
}
