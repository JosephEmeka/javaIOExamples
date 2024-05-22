package Chapter17.Streams;

import java.util.List;

public class Example11 {
    public static void main(String[] args) {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(10,20,30,40,50),
                List.of(100,200,300,400,500)
        );
        System.out.println(numbers.stream()
                .flatMap((list) ->list.stream())
                .toList());
    }
}
