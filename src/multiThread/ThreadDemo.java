/**
 * 继承Thread类实现多线程
 */
package multiThread;

class TempThread extends Thread { // 线程的主体类
	private String title;

	public TempThread(String title) {
		this.title = title;
	}

	@Override
	public void run() { // 所有的线程从此处开始执行
		super.run();
		for (int x = 0; x < 10; x++) {
			System.out.println(this.title + ", x = " + x);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		TempThread mt1 = new TempThread("线程A");
		TempThread mt2 = new TempThread("线程B");
		TempThread mt3 = new TempThread("线程C");
		mt1.start();
		mt2.start();
		mt3.start();
	}

}