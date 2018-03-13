package hackerrank.day26;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int dayActual = scan.nextInt();
        int monthActual = scan.nextInt();
        int yearActual = scan.nextInt();
        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();
        scan.close();
        int fine = 0;

        if (yearExpected < yearActual) {
            fine = 10000;
        } else if (yearExpected == yearActual) {
            if (monthExpected < monthActual) {
                fine = (monthActual - monthExpected) * 500;
            } else if (monthExpected == monthActual && dayExpected < dayActual) {
                fine = (dayActual - dayExpected) * 15;
            }
        }
        System.out.println(fine);
    }
}