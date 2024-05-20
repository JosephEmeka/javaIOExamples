package Chapter17.FunctionalInterface.Assignment;

import Chapter15.JsonTask.Transaction;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerSample {
        public static void main(String[] args) {
            ObjDoubleConsumer<String> consumer = (str, value) -> System.out.println("String: " + str + ", Value: " + value);

            consumer.accept("Hello", 3.14);
            consumer.accept("Java", 42.0);
        }
}
