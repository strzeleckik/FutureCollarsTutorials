package main;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println(queue);

        String peekedElement = queue.peek();

        System.out.println(peekedElement);

        String polledElement = queue.poll();

        System.out.println(polledElement);

        String polledElement2 = queue.poll();

        System.out.println(polledElement2);

        System.out.println(queue.size());
    }
}
