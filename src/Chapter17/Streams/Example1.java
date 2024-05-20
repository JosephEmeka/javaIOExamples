package Chapter17.Streams;

import Chapter15.JsonTask.Transaction;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        // all Collections have a method collection
        // there are several ways to create a stream
        //  is not a collection
        //double colon is called method reference: it is a shorthand that can be used in place of lambda expression
        //that uses the same argument in the lambda expression
        Set<Integer> numbers = Set.of(20, 30, 40, 50);
        Stream<Integer> stream = numbers.stream();
        stream.forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();

        Stream<Transaction> transactionStream = Stream.of();

        Stream.of(new Transaction("100", "12345"),
                new Transaction("200", "34567"));

        transactionStream.forEach((transaction -> {
            System.out.printf("account with id %s has %s in it\n",
                    transaction.getAccountNumber(), transaction.getAmount());
        }));

        Stream<Integer> integerStream = Stream.generate(() -> new SecureRandom().nextInt()).limit(4);

        integerStream.forEach(System.out::println);

    }
}
