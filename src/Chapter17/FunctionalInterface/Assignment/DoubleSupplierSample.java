package Chapter17.FunctionalInterface.Assignment;

import java.util.Random;
import java.util.function.DoubleSupplier;

public class DoubleSupplierSample {
        public static void main(String[] args) {
            DoubleSupplier supplier = () -> 689 * 100;
            double value = supplier.getAsDouble();
            System.out.println("Random double value: " + value);
        }

}
