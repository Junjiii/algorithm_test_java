package test21_30;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class test28 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();
        AtomicInteger atomicInteger = new AtomicInteger(0);

        Arrays.stream(my_strings).forEach(e -> {
            int index = atomicInteger.getAndIncrement();
            result.append(e.substring(parts[index][0],parts[index][1] + 1));
        });

        return result.toString();
    }
}
