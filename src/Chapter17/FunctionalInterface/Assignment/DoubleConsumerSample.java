package Chapter17.FunctionalInterface.Assignment;

import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {

      public static void main(String[] args) {
          DoubleConsumer doubleConsumer = (num) -> {
              double result = num + num;
              System.out.println("Result: " + result);
          };
          doubleConsumer.accept(400);
      }
}
