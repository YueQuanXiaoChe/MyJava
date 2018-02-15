/**
 * ThreadLocal类（减少一些重要的引用传递）
 */
package javaClassLib;

class Msg {
	private String note;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}

class MsgConsumer {
	public void print() {
		System.out.println(Thread.currentThread().getName() + " : " + MsgUtil.get().getNote());
	}
}

class MsgUtil {
	private static ThreadLocal<Msg> threadLocal = new ThreadLocal<Msg>();
	
	public static void set(Msg msg) {
		threadLocal.set(msg);
	}
	
	public static Msg get() {
		return threadLocal.get();
	}
	
	public static void remove() {
		threadLocal.remove();
	}
}

public class ThreadLocalDemo {

	public static void main(String[] args) {
		new Thread(() -> {
			Msg msg = new Msg();
			msg.setNote("Hello world!");
			MsgUtil.set(msg);
			new MsgConsumer().print();
		}, "用户A").start();
		new Thread(() -> {
			Msg msg = new Msg();
			msg.setNote("I don't give a shit!");
			MsgUtil.set(msg);
			new MsgConsumer().print();
		}, "用户B").start();
	}

}
