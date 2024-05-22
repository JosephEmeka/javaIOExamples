package Chapter17.FunctionalInterface.Assignment;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerSample {
        public static void main(String[] args) {
            ObjIntConsumer<String> consumer = (str, value) -> System.out.println("String: " + str + ", Value: " + value);

            consumer.accept("Hello", 7);
            consumer.accept("Java", 9);
        }
    }

