/**
 * 创建各种线程池
 * 允许多个线程按照组的模式进行处理，这样在某一个业务逻辑非常复杂的环境下，
 * 性能就会得到很好的提升
 */
package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) throws Exception {
		// 现在创建了一个线程池的模型，但是里面没有线程
		// 创建无限大小的线程池
		// ExecutorService executorService = Executors.newCachedThreadPool();
		// 创建单线程的线程池
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		// 创建固定大小的线程池
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int x = 0; x < 10; x++) {
			// Thread.sleep(200);
			int index = x; // 保存一下x的内容
			executorService.submit(new Runnable() { // 创建并执行线程的操作

				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + "; x = " + index);
				}
			});
		}
		executorService.shutdown(); // 关闭线程池

		// 创建一个具有三个线程大小的定时调度线程池
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
		for (int y = 0; y < 10; y++) {
			int index = y;
			scheduledExecutorService.scheduleAtFixedRate(new Runnable() {

				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + "; x = " + index);
				}
			}, 3, 2, TimeUnit.SECONDS); // 使用的是一个秒的单位，表示3秒后开始执行，而后每2秒执行一次
		}
	}

}