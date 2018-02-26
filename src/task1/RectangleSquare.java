package task1;

import java.util.Arrays;

public class RectangleSquare {

    public static double singleRectangleSquare(double x1, double y1, double x2, double y2) {
        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);
        return width * height;
    }

    public static double intersectionRectangleSquare(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {

        //normalize
        if (x1 > x2) {
            double temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (y1 > y2) {
            double temp = y1;
            y1 = y2;
            y2 = temp;
        }
        if (x3 > x4) {
            double temp = x3;
            x3 = x4;
            x4 = temp;
        }
        if (y3 > y4) {
            double temp = y3;
            y3 = y4;
            y4 = temp;
        }

        double width = 0;
        double height = 0;

        if (x3 >= x1 && y3 >= y1 && x3 < x2 && y3 < y2) {

            width = x4 >= x2 ? x2 - x3 : x4 - x3;
            height = y4 >= y2 ? y2 - y3 : y4 - y3;

        } else if (x3 < x1 && y3 >= y1 && x4 >= x1 && x3 < x2) {

            width = x4 >= x2 ? x2 - x1 : x4 - x1;
            height = y4 >= y2 ? y2 - y3 : y4 - y3;

        } else if (x3 < x1 && y3 < y1 && x4 >= x1 && y4 >= y1) {

            width = x4 >= x2 ? x2 - x1 : x4 - x1;
            height = y4 >= y2 ? y2 - y1 : y4 - y1;

        } else if (x3 >= x1 && y3 < y1 && x3 < x2 && y4 >= y1){

            width = x4 >= x2 ? x2 - x3 : x4 - x3;
            height = y4 >= y2 ? y2 - y1 : y4 - y1;

        }
        return width * height;
    }
}
