package Chapter17.FunctionalInterface.Assignment;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionSample {
    IntToDoubleFunction intToDoubleFunction = (number) -> Integer.valueOf(number).doubleValue();
    double number = intToDoubleFunction.applyAsDouble(808);
       
}
