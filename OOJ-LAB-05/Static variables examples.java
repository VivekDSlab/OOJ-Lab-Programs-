import java.util.*;

//Demonstrate Static variables and methods example.

class Counter {
    
    private static int count = 0;

    public Counter() {
        count++;    }


    public static int getCount() {
        return count;
    }
}

public class main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

              System.out.println("Total Counter instances: " + Counter.getCount());
    }
}
