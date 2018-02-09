/**
 * 接口定义加强
 */
package designPattern;

interface INote {
	public void print();

	// 可以由类名称直接进行调用
	public static INote getInstance() { // 定义了静态方法
		return new NoteImpl();
	}

	// 使用static定义静态方法，通过接口名就可以调用
	public static void staticFun() {
		System.out.println("[static fun]");
	}

	// 使用default定义普通方法，需要通过对象调用
	public default void defaultFun() { // 追加了普通方法，有方法体了
		System.out.println("[default fun]");
	}
}

class NoteImpl implements INote {

	@Override
	public void print() {
		System.out.println("Hello world!");
	}

}

public class InterfaceExtension {

	public static void main(String[] args) {
		INote note = INote.getInstance();
		note.print();
		note.defaultFun();
		INote.staticFun();
	}

}