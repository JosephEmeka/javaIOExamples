package Chapter16;

import java.util.HashSet;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Precious");
        names.add("Ball");
        names.add("Abigail");
        names.add("Rachel");
        names.add("Precious");

        System.out.println(names);
    }
}
