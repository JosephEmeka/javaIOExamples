package Chapter16;

import java.util.Stack;

public class Example3 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(5);
        numbers.push(10);
        numbers.push(21);
        numbers.push(100);

        System.out.println(numbers);
        numbers.pop();
        numbers.pop(); //last in, first out - LIFO

        System.out.println(numbers);

    }
}
