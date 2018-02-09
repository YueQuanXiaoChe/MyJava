/**
 * 使用Runnable接口实现多线程
 */
package multiThread;

class NewThread implements Runnable { // 线程的主体类

	private String title;

	public NewThread(String title) {
		this.title = title;
	}

	@Override
	public void run() { // 所有的线程从此处开始执行
		for (int x = 0; x < 10; x++) {
			System.out.println(this.title + ", x = " + x);
		}
	}

}

public class RunnableDemo {

	public static void main(String[] args) {
		NewThread nt1 = new NewThread("线程A");
		NewThread nt2 = new NewThread("线程B");
		NewThread nt3 = new NewThread("线程C");
		new Thread(nt1).start();
		new Thread(nt2).start();
		new Thread(nt3).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello world!");
			}
		}).start();

		new Thread(() -> System.out.println("I LOVE YOU!")).start();
	}

}