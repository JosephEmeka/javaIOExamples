package Chapter17.FunctionalInterface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierSample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier = () -> {
            String name = "Precious";
            name.equals("Precious");
            return true;
        };
        boolean result = booleanSupplier.getAsBoolean();
        System.out.println(result);
    }
}
