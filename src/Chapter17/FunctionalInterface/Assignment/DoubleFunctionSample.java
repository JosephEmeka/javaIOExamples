package Chapter17.FunctionalInterface.Assignment;

import java.util.function.DoubleFunction;

public class DoubleFunctionSample {
    public static void main(String[] args) {
        DoubleFunction<Double> doubleFunction = number -> number / 2;
        double result = doubleFunction.apply(60);
        System.out.println(result);
    }
}
