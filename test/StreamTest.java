import Chapter15.JsonTask.Transaction;
import Chapter17.Streams.StreamOperations;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static Chapter15.JsonTask.ReadJson.deserialize;
import static Chapter17.Streams.MethodsTask.getTransactionsOn;
import static Chapter17.Streams.StreamOperations.getEvenNumbersOf;
import static org.junit.jupiter.api.Assertions.*;

public class StreamTest {
    @Test
    public void testGetEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var evenNumbers = getEvenNumbersOf(numbers);
        System.out.printf("Even numbers of: %s are %s ", numbers, evenNumbers);
        assertNotNull(evenNumbers);
        assertEquals(5, evenNumbers.size());
    }

    @Test
    public void testMapCodePointToCharacter() {
        List<Integer> codePoints = List.of(65, 97, 98, 66, 69, 48);
        Map<Integer, String> map = StreamOperations.mapCodePointToCharacter(codePoints);
        Map<Integer, String> expected = Map.of(
                65, "A",
                97, "a",
                98, "b",
                66, "B",
                69, "E",
                48, "0");
        System.out.println(map);
        assertNotNull(map);
        assertEquals(expected, map);
    }

    @Test
    public void testGetNumbersFormatted() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10);
        String result = StreamOperations.getNumbersFormatted(numbers);
        String expected = "[1 ,2 ,2 ,3 ,4 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ]";
        assertNotNull(result);
        System.out.println(result);
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertEquals(expected, result);

    }

  @Test
public void getTransactionOnADay() throws IOException {
    String fileLocation = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\Chapter15\\JsonTask\\Transactions.json";
    LocalDate date = LocalDate.of(2024, 5 ,16);
    Transaction[] transactions = deserialize(fileLocation);
    List<Transaction> expected = Collections.emptyList();
    List<Transaction> actual = getTransactionsOn(date, fileLocation);
    assertEquals(expected, actual);
}
}