/**
 * ThreadLocal类
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
	public void print(Msg msg) {
		System.out.println(Thread.currentThread().getName() + " " + msg.getNote());
	}
}

public class ThreadLocalDemo {

	public static void main(String[] args) {
		new Thread(() -> {
			Msg msg = new Msg();
			msg.setNote("Hello world!");
			new MsgConsumer().print(msg);
		}, "用户A").start();
		new Thread(() -> {
			Msg msg = new Msg();
			msg.setNote("I don't give a shit!");
			new MsgConsumer().print(msg);
		}, "用户B").start();
	}

}
