/**
 * 反射、泛型与工厂设计模式
 */
package reflect;

interface IFruit {
	public void eat();
}

class Apple implements IFruit {

	@Override
	public void eat() {
		System.out.println("[Apple]吃苹果");
	}
	
}

class Orange implements IFruit {

	@Override
	public void eat() {
		System.out.println("[Orange]吃橘子");
	}
	
}

class Cherry implements IFruit {

	@Override
	public void eat() {
		System.out.println("[Cherry]吃樱桃");
	}
	
}

interface IMessage {
	public void print();
}

class MessageImpl implements IMessage {

	@Override
	public void print() {
		System.out.println("Hello world!");
	}
	
}

class Factory<T> {
	private Factory() {}
	
	@SuppressWarnings("unchecked")
	public static <T>T getInstance(String className) {
		T obj = null;
		try {
			obj = (T)Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return obj;
	}
}

public class ReflectFactory {

	public static void main(String[] args) {
		IFruit fruit = Factory.getInstance("reflect.Orange");
		fruit.eat();
		fruit = Factory.getInstance("reflect.Apple");
		fruit.eat();
		fruit = Factory.getInstance("reflect.Cherry");
		fruit.eat();
		IMessage msg = Factory.getInstance("reflect.MessageImpl");
		msg.print();
	}

}
