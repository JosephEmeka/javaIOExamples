package Chapter17.FunctionalInterface.Assignment;

import java.util.function.IntConsumer;

public class IntConsumerSample {
       public static void main(String[] args) {
              IntConsumer intConsumer = number -> System.out.println("Result:" + (number * number));
              int number = 12;
              intConsumer.accept(number);
       }

}



