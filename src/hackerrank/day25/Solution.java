package hackerrank.day25;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int inputInt;
        for (int i = 0; i < n; i++) {
            inputInt = scan.nextInt();
            System.out.println(isPrime(inputInt) ? "Prime" : "Not prime");
        }
        scan.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}