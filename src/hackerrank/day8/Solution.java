package hackerrank.day8;

import java.util.*;
import java.io.*;

//Complete this code or write your own from scratch

class Solution {
    public static void main(String[] argh) {
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (map.containsKey(s)) {
                System.out.println(String.format("%s=%d", s, map.get(s)));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
