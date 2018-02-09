/**
 * Lambda表达式
 */
package functionInterface;

@FunctionalInterface // 是一个函数式编程接口，只允许有一个方法
interface IMessage {
	public void print();
}

@FunctionalInterface // 是一个函数式编程接口，只允许有一个方法
interface IMath {
	public int add(int x, int y);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// 函数式编程的使用
		IMessage msg = () -> System.out.println("Hello world!");
		msg.print();

		IMessage newMsg = () -> {
			System.out.println("Hello");
			System.out.println("world!");
		};
		newMsg.print();

		IMath im = (n1, n2) -> n1 + n2;
		System.out.println(im.add(1, 2));
	}

}