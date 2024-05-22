package Chapter17.Streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamOperations {

    public static List<Integer> getEvenNumbersOf(List<Integer> numbers) {
        return numbers.stream().filter((item) -> item % 2==0).collect(Collectors.toList());
    }

    public static Collection<Integer> getNewEvenNumbersOf(List<Integer> numbers) {
        return numbers.stream()
                .filter((item) -> item % 2==0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoints) {
        return codePoints.stream()
                .collect(Collectors.toMap((codepoint)->codepoint, Character::toString));
    }

    public static String getNumbersFormatted(List<Integer> numbers) {
        return numbers.stream()
                .map((number) ->number+ " ")
                .collect(Collectors.joining(",", "[", "]"));
    }

}
