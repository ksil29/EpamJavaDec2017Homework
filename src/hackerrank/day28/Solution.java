package hackerrank.day28;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputString = scan.nextLine().split(" ");
            if (inputString[1].endsWith("@gmail.com")) {
                list.add(inputString[0]);
            }
        }
        scan.close();

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}