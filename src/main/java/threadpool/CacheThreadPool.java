package threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 缓存类线程池
 */
public class CacheThreadPool implements Executor{

    public void execute(Runnable command) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println(1);
                System.out.println(2);
            }
        });
    }
}
