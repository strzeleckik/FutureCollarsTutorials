package streams;

import java.util.List;
import java.util.stream.IntStream;

public class ReduceMain {
    public static void main(String[] args) {
        List<Integer> grades = List.of(1, 5, 6, 4);
        int sum = grades.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
