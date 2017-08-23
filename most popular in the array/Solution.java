import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> ints = new ArrayList<>();
        while (s.hasNextInt()) ints.add(s.nextInt());
        
        System.out.println(
            ints.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max((i, j) -> Long.compare(i.getValue(), j.getValue()) )
                .get().getKey()
        );
    }
}
