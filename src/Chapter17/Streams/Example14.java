package Chapter17.Streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
       numbers = numbers.stream().limit(3).toList();
        System.out.println(numbers);
    }
}
