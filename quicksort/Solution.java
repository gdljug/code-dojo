import java.io.*;
import java.util.*;

public class Solution {
    
    public static void swap(int[] ints, int i, int j) {
        int t = ints[i];
        ints[i] = ints[j];
        ints[j] = t;
    }

    public static void print(int[] ints) {
        StringBuilder b = new StringBuilder();
        for (int i : ints) {
            b.append(i).append(' ');
        }
        System.out.println(b);
    }

    public static int partition(int[] ints, int lo, int hi) {
        int pivot = ints[hi];
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (ints[j] < pivot) {
                swap(ints, i, j);
                i++;
            }
        }

        if (pivot < ints[i]) {
            swap(ints, hi, i);
        }

        print(ints);
        return i;
    }

    public static void quicksort(int[] ints, int lo, int hi) {
        int p;
        if (lo < hi) {
            p = partition(ints, lo, hi);
            quicksort(ints, lo, p - 1);
            quicksort(ints, p + 1, hi);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ints = new int[n];
        int i = 0;

        while (n > 0) { ints[i++] = in.nextInt(); n--; }
        quicksort(ints, 0, ints.length - 1);
    }
}
