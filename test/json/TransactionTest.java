package json;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static Chapter15.JsonTask.ReadJson.getDigits;
import static Chapter15.JsonTask.ReadJson.totalTransactionAmount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    public void ComputeTotalAmountFromJasonFiles() throws IOException {
      String fileLocation = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\JsonTask\\Transactions.json";
      int expected = 9000;
      assertEquals(expected, totalTransactionAmount(fileLocation));
    }

    @Test
    public void testNumberOfDigitsInATestFile() throws IOException {
        String fileLocation = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\JsonTask\\NewTextFile.txt";
        int expected = 3;
        assertEquals(expected, getDigits(fileLocation));
    }
}
