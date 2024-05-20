package Chapter16;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example5 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(5);
        queue.add(9);
        queue.add(3);
        queue.add(7);
        queue.add(2);
        queue.add(4);
        queue.add(2);

        System.out.println(queue);

        // queue.peek();// prints the first element after sorting in ascending order
        System.out.println(queue.peek());
        System.out.println(queue.size());

        //queue.offer(1);// does the same thing as add
    }
}
