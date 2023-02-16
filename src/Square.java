import java.util.Comparator;

public class Square implements Comparable<Square> {
    private double height;
    private double width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int compareTo(Square comparingSquare) {
    double perimeterOfSquare1 = (this.height * 2) + (this.width * 2);
    double perimeterOfSquare2 = (comparingSquare.height * 2) + (comparingSquare.width * 2);
    return Double.compare(perimeterOfSquare1, perimeterOfSquare2);
    }


    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}