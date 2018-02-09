/**
 * 匿名内部类的使用
 */
package designPattern;

interface IMessage {
	public abstract void print();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		IMessage msg = new IMessage() { // 匿名内部类
			public void print() {
				System.out.println("--- 匿名内部类的使用 ---");
			}
		};

		fun(msg);
	}

	public static void fun(IMessage msg) {
		msg.print();
	}

}