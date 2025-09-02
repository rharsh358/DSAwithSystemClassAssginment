package practical.multithreading;

import java.util.concurrent.*;

record MyCallable(String name) implements Callable<String> {

    @Override
    public String call() throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append("Callable ")
                    .append(name)
                    .append(" - Iteration ")
                    .append(i)
                    .append("\n");
            Thread.sleep(500); // Simulate some work with sleep
        }

        return result.toString();
    }

}


public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        MyCallable callable1 = new MyCallable("Task 1");
        MyCallable callable2 = new MyCallable("Task 2");

        try {
            Future<String> future1 = executor.submit(callable1);
            Future<String> future2 = executor.submit(callable2);

            // Do other tasks if needed

            // Get the results from the callables

            String result1 = future1.get(); // This will block until the result is available
            System.out.println("Result from Callable 1:\n" + result1);

            String result2 = future2.get(); // This will block until the result is available
            System.out.println("Result from Callable 2:\n" + result2);


        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            executor.shutdown();
        }


    }
}
