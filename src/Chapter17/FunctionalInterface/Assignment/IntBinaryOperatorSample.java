package Chapter17.FunctionalInterface.Assignment;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorSample {
    public static void main(String[] args) {
        IntBinaryOperator addition = (a, b) -> a + b;
        int result = addition.applyAsInt(5, 3);
        System.out.println("Addition result: " + result);
    }
}
