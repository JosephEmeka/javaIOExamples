package Chapter16;


import java.util.Map;

public class Example6 {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                1, "One",
                2, "Two",
                3, "Three",
                4, "Four");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
    }

}
