package Chapter17.Streams;

import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {
        String word = "hello";

       word.chars()
               .filter((number)->number>100)
               .mapToObj ((number)->Boolean.TRUE)
               .reduce((false) ,(a, b)-> a!=b);
    }
}
