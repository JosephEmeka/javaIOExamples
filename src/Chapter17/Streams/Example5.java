package Chapter17.Streams;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("QWERTY", "ASDFG", "ABCDFFF", "ABC");
        numbers.stream().map(String::length).forEach(System.out::println);
    }
}
