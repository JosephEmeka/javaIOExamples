package Chapter15.JsonTask;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import static Chapter15.JsonTask.Type.CREDIT;
import static Chapter15.JsonTask.Type.DEBIT;

public class ReadJson {

    public static int totalTransactionAmount(String fileLocation) throws IOException {
        Path path = Paths.get(fileLocation);
        String filesContent = Files.readString(path);
        Transaction[] transactions = deserialize(filesContent);
        int total = 0;
        for (Transaction eachTransaction : transactions) {
            if(eachTransaction.getType() == CREDIT){
                total += eachTransaction.getAmount();
            }
            if(eachTransaction.getType() == DEBIT){
                total -= eachTransaction.getAmount();
            }
        }
        return total;
    }


    public static Transaction[] deserialize(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Transaction[].class);
        } catch (JsonProcessingException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public static int getDigits(String fileLocation) throws IOException {
        Path path = Paths.get(fileLocation);
        String filesContent = Files.readString(path);
        int digitsCount = 0;
        for (int i = 0; i < filesContent.length(); i++) {
            if (Character.isDigit(filesContent.charAt(i))) {
                digitsCount++;
            }

        }
        return digitsCount;
    }
}

