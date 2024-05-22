package Chapter17.Streams;

import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(14,4,7,1,2,4,9,7,3,8,9,5,6);
        numbers.stream()
                .map((number) -> String.format("number = %d", number))
                .forEach(System.out::println);
    }
}
