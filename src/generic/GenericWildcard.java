/**
 * 泛型: 通配符
 */
package generic;

class Message<T> {

	private T note;

	public void setNote(T note) {
		this.note = note;
	}

	public T getNote() {
		return note;
	}

}

public class GenericWildcard {

	public static void main(String[] args) {
		Message<String> msg = new Message<String>();
		msg.setNote("Hello world!");
		wildcardBasic(msg);
		wildcardSuper(msg);

		Message<Integer> data = new Message<Integer>();
		data.setNote(19861216);
		wildcardExtends(data);
	}

	// 此时使用通配符"?"描述的事它可以接收任意类型，
	// 但是由于不确定类型，所以"temp"无法调用修改属性内容的方法，只能调用获取属性内容的方法
	public static void wildcardBasic(Message<?> temp) {
		System.out.println(temp.getNote());
	}

	// 在通配符"?"的基础上又产生了2个子通配符
	// "? extends 类" : 设置泛型上限，表示只能设置 Number 或其子类，例如: Integer/Double/等
	public static void wildcardExtends(Message<? extends Number> temp) {
		System.out.println(temp.getNote());
	}

	// "? super 类" : 设置泛型下限，表示只能设置 String 或其父类，例如: String/Object
	public static void wildcardSuper(Message<? super String> temp) {
		System.out.println(temp.getNote());
	}

}