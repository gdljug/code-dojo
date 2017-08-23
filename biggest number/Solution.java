import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = -1;
        String next;
        while (n > 0) {
            n--;
            next = s.next();
            max = Math.max(Integer.valueOf(next.charAt(1) - '0'), max);
        }
        System.out.println(max);
    }
}
