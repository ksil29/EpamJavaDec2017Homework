package task2.snake;

public class Main {
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
        Snake.printSnake(testRectangle);
        System.out.println();
        Snake.printSnake(testSquare);
        System.out.println();
        Snake.printSnake(testLine);
        System.out.println();
        Snake.printSnake(testSingle);
        System.out.println();
        Snake.printSnake(testEmpty);
        Snake.printSnake(testNull);
        Snake.printSnake(null);
    }
}
