/**
 * 通过Callable接口实现多线程
 */
package multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		for (int x = 0; x < 20; x++) {
			System.out.println("x = " + x);
		}
		return "End";
	}

}

public class CallableDemo {

	public static void main(String[] args) throws Exception {
		FutureTask<String> task = new FutureTask<String>(new MyThread());
		new Thread(task).start(); // 启动多线程
		System.out.println(task.get());
	}

}