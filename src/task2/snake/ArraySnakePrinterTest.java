package task2.snake;

public class ArraySnakePrinterTest {

    static int[][] testRectangle = {{1, 2, 3, 4, 5},
                                    {12, 13, 14, 15, 6},
                                    {11, 10, 9, 8, 7}};
    static int[][] testSquare = {{1, 2, 3},
                                 {8, 9, 4},
                                 {7, 6, 5}};
    static int[][] testLine = {{1, 2, 3}};
    static int[][] testSingle = {{1}};
    static int[][] testEmpty = {};
    static int[][] testNull = null;

    public static void main(String[] args) {
        ArraySnakePrinter.printArrayBySnakePattern(testRectangle);
        System.out.println();
        ArraySnakePrinter.printArrayBySnakePattern(testSquare);
        System.out.println();
        ArraySnakePrinter.printArrayBySnakePattern(testLine);
        System.out.println();
        ArraySnakePrinter.printArrayBySnakePattern(testSingle);
        System.out.println();
        ArraySnakePrinter.printArrayBySnakePattern(testEmpty);
        ArraySnakePrinter.printArrayBySnakePattern(testNull);
        ArraySnakePrinter.printArrayBySnakePattern(null);
    }
}
