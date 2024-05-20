package Chapter17.FunctionalInterface.Assignment;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate intPredicate = number -> number < 10;
        int value = 9;
        System.out.println(intPredicate.test(value));
    }
}
