package hackerrank.day29;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int max = Integer.MIN_VALUE;
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b <= n; b++) {
                    int aAndB = a & b;
                    max = aAndB > max && aAndB < k ? aAndB : max;
                }
            }
            System.out.println(max);
        }
        scan.close();
    }
}