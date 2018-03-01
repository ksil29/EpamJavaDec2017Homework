package task1;

public class RectangleSquareCalculatorTest {
    public static void main(String[] args) {
        System.out.println(RectangleSquareCalculator.calculateSingleRectangleSquare(1, 2, 3, 4));
        System.out.println(RectangleSquareCalculator.calculateDoubleRectanglesIntersectionSquare(1, 3, 3, 1, 0, 0, 2, 2));
        System.out.println(RectangleSquareCalculator.calculateDoubleRectanglesIntersectionSquare(0, 0, 3, 3, 1, 1, 2, 2));
        System.out.println(RectangleSquareCalculator.calculateDoubleRectanglesIntersectionSquare(0, 0, 1, 1, 1, 1, 2, 2));
    }
}
