package Chapter17.FunctionalInterface.Assignment;

import java.util.function.IntFunction;

public class IntFunctionSample {
    public static void main(String[] args) {
        IntFunction<Integer> number = (value) -> value + value;
        int result = 56;
        System.out.println(number.apply(result));
    }
}
