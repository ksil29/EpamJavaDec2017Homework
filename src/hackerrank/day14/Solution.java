package hackerrank.day14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int... elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : elements) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        maximumDifference = Math.abs(max - min);
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}