package Chapter17.FunctionalInterface;

import java.util.function.BinaryOperator;

public class binaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator =(number, num) -> number * num;
        System.out.println(binaryOperator.apply(5, 10));
    }
}
