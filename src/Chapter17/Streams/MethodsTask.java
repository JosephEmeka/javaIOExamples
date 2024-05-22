package Chapter17.Streams;

import Chapter15.JsonTask.Transaction;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static Chapter15.JsonTask.ReadJson.deserialize;

public class MethodsTask {
    public static List<Transaction> getTransactionsOn(LocalDate date, String fileLocation) throws IOException {
        Path path = Paths.get(fileLocation);
        String filesContent = Files.readString(path);
        Transaction[] transactions = deserialize(filesContent);
        return Arrays.stream(transactions).filter((item)-> item.getDate().equals(date)).collect(Collectors.toList());
    }


   public static List<Transaction> transactionsWithinThePeriod(LocalDate startDate, LocalDate endDate, String fileLocation) throws IOException {
    Path path = Paths.get(fileLocation);
    String filesContent = Files.readString(path);
    Transaction[] transactions = deserialize(filesContent);
    return Arrays.stream(transactions)
            .filter(transaction -> transaction.getDate().isAfter(startDate) && transaction.getDate().isBefore(endDate))
            .collect(Collectors.toList());
}

   public static double averageTransactionAmountForPeriod(LocalDate startDate, LocalDate endDate, String fileLocation) throws IOException {
    Path path = Paths.get(fileLocation);
    String filesContent = Files.readString(path);
    Transaction[] transactions = deserialize(filesContent);
    return Arrays.stream(transactions)
            .filter(transaction -> transaction.getDate().isAfter(startDate) && transaction.getDate().isBefore(endDate))
            .mapToDouble(Transaction::getAmount)
            .average()
            .orElse(0.0);
}

 public static void main(String[] args) throws IOException {
        LocalDate endDate = LocalDate.of(2024, 5, 18);
        LocalDate date = LocalDate.of(2024, 5, 16);
        String fileLocation = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\Chapter15\\JsonTask\\Transactions.json";
        System.out.println(getTransactionsOn(date, fileLocation));
        System.out.println(transactionsWithinThePeriod(date, endDate, fileLocation));
}
}
