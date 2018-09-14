package java8.task;

import java.util.concurrent.*;

/**
 * <pre>
 * </pre>
 *
 * @author jianwu6 [2018/9/14 15:32]
 */
public class CallableSample {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        Callable<String> task = () -> {
            TimeUnit.SECONDS.sleep(1);
            return "Doing task ...";
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<String> result = executor.submit(task);

        System.out.println(result.get(100, TimeUnit.SECONDS));

        executor.shutdown();
    }
}
