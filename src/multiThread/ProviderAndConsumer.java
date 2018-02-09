/**
 * "生产者"与"消费者"模型
 */
package multiThread;

class DataProvider implements Runnable {

	private Data data;

	public DataProvider(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int x = 0; x < 50; x++) {
			if (x % 2 == 0) {
				this.data.set("Java", "静态语言" + x);
			} else {
				this.data.set("Python", "动态语言" + x);
			}
		}
	}

}

class DataConsumer implements Runnable {

	private Data data;

	public DataConsumer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int x = 0; x < 50; x++) {
			this.data.get();
		}
	}

}

class Data { // 负责数据保存

	private String title;
	private String note;
	// flag = false 表示允许生产，但不允许消费者取走
	// flag = true 表示生产完毕，允许消费者取走，但是不能够许生产
	private boolean flag = false;

	public synchronized void get() {
		if (this.flag == false) { // 允许生产，不能取走
			try {
				super.wait(); // 等待取走
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.title + " = " + this.note);
		this.flag = false; // 表示已经取走了，可以再次生产
		super.notify(); // 唤醒等待生产
	}

	public synchronized void set(String title, String note) {
		if (this.flag == true) { // 生产完毕，不能再次生产
			try {
				super.wait(); // 等待生产
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.title = title;
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.note = note;
		this.flag = true; // 表示生产完毕，可以被取走
		super.notify(); // 唤醒取走
	}

}

public class ProviderAndConsumer {

	public static void main(String[] args) {
		Data data = new Data();
		new Thread(new DataProvider(data)).start();
		new Thread(new DataConsumer(data)).start();
	}

}