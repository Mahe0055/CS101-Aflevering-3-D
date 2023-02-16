import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    Square square1 = new Square(20.0, 15.5);
    Square square2 = new Square(5.25, 12.8);

    ArrayList<Square> twoSquares = new ArrayList<>();
    twoSquares.add(square1);
    twoSquares.add(square2);
    System.out.println("Before sorting: " + twoSquares);
    Collections.sort(twoSquares);
    System.out.println("After sorting: " + twoSquares);
    }
}