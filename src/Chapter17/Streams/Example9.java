package Chapter17.Streams;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 4, 7, 1, 3, 2, 8, 9, 5, 6);
        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(result);
    }
}
