import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            String num = sc.next();
            BigInteger bigNum = new BigInteger(num);
            String binNum = bigNum.toString(2);
            String revNum = new StringBuilder(binNum).reverse().toString();
            System.out.println(binNum.equals(revNum) ? "Yes" : "No");
        }
    }
}
