package hackerrank.day10;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int max = 0;
        int current = 0;

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            if (remainder == 1) {
                current++;
                max = Math.max(current, max);
            } else {
                current = 0;
            }
        }

        System.out.println(max);
    }
}