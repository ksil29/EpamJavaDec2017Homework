package hackerrank.day6;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String inputString = scan.nextLine();
            for (int j = 0; j < inputString.length(); j += 2) {
                even.append(inputString.charAt(j));
            }
            for (int j = 1; j < inputString.length(); j += 2) {
                odd.append(inputString.charAt(j));
            }
            System.out.println(even.toString() + " " + odd.toString());
            even.delete(0, even.capacity());
            odd.delete(0, odd.capacity());
        }
        scan.close();
    }
}