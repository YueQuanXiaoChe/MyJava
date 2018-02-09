/**
 * 泛型接口
 */
package generic;

interface IMessage<T> { // 在接口上定义了泛型
	public void print(T t);
}

// 在子类定义的时候继续使用泛型
class MessageImpl<T> implements IMessage<T> {

	public void print(T t) {
		System.out.println(t);
	}

}

// 在子类实现接口的时候明确给出具体类型
class NoteImpl implements IMessage<String> {

	public void print(String t) {
		System.out.println(t);
	}

}

public class GenericInterface {

	public static void main(String[] args) {
		IMessage<String> msg = new MessageImpl<String>();
		msg.print("Hello world!");

		IMessage<String> note = new NoteImpl();
		note.print("I love you!");
	}

}