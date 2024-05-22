package Chapter17.Streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Example13 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
//        double average = numbers.stream()
        IntSummaryStatistics stats= numbers.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
//                .average().orElseThrow(() -> new RuntimeException("number not present"));
        .summaryStatistics();
        System.out.println(stats);
        stats.accept(10);
        System.out.println(stats);
    }
}
