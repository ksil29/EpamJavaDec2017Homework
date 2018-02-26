package task2.snake;

public class Snake {

    private enum Direction {
        RIGHT, DOWN, LEFT, UP
    }

    public static void printSnake(int[][] array) {
        if (array == null || array.length == 0) {
            return;
        }
        Direction direction = Direction.RIGHT;
        int upBound = 1;
        int leftBound = 0;
        int rightBound = array[0].length - 1;
        int downBound = array.length - 1;
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length * array[0].length; i++) {
            System.out.print(array[y][x] + " ");
            switch (direction) {
                case RIGHT:
                    x++;
                    if (x == rightBound) {
                        direction = Direction.DOWN;
                        rightBound--;
                    }
                    break;
                case DOWN:
                    y++;
                    if (y == downBound) {
                        direction = Direction.LEFT;
                        downBound--;
                    }
                    break;
                case LEFT:
                    x--;
                    if (x == leftBound) {
                        direction = Direction.UP;
                        leftBound++;
                    }
                    break;
                case UP:
                    y--;
                    if (y == upBound) {
                        direction = Direction.RIGHT;
                        upBound++;
                    }
                    break;
            }
        }
    }
}
