package Chapter17.FunctionalInterface.Assignment;

import java.util.function.DoublePredicate;

public class DoublePredicateSample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = number -> number == 10;
        double number = 20;
        boolean testResult = doublePredicate.test(number);
        System.out.println(testResult);
    }
}
