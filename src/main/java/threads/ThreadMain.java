package threads;

import java.util.stream.IntStream;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());

        Thread thread = new Thread(() -> {
            String name = "Konrad";
            System.out.println("threadId: " + Thread.currentThread().getId() + " name.length: " + name.length());
        });

        thread.start();

        final int from = 0;
        int to = 5;

        Runnable firstTask = () -> IntStream
                .range(from, to)
                .forEach(x -> System.out.println("Thread ID: " + Thread.currentThread().getId()+ " A: " + x));

        Runnable secondTask = () -> IntStream
                .range(6, 11)
                .forEach(x -> System.out.println("Thread ID: " + Thread.currentThread().getId() + " B: " + x));

        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);

        System.out.println("Main thread: " + Thread.currentThread().getId());

        firstThread.start();
        secondThread.start();

    }
}
