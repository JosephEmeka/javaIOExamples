package Chapter17.FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String , String> biConsumer = (firstname, surname) ->
                printFullName(firstname, surname);
        //biConsumer.accept("Joe", "Onah");
    };
    private static void printFullName(String firstname, String surname){
        System.out.println(firstname+" " +surname);

    }
}
