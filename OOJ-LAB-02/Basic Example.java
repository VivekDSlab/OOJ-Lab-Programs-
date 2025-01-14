#Class(basic example)
import java.util.*;
class Box {
    double width;
    double height; // Corrected from "hight" to "height"
    double depth;
}
class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.width = 10;
        myBox.height = 20; // Corrected variable name to "height"
        myBox.depth = 15;
        // Calculate the volume
        vol = myBox.width * myBox.height * myBox.depth;
        // Display the volume
        System.out.println("Volume is " + vol);
    }
}
