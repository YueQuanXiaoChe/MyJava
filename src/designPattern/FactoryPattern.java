/**
 * 接口的设计模式: 工厂设计模式
 */
package designPattern;

interface Ifruit {
	public abstract void print();
}

class Apple implements Ifruit {

	public void print() {
		System.out.println("这是一个苹果");
	}

}

class Banana implements Ifruit {

	public void print() {
		System.out.println("这是一个香蕉");
	}

}

class FruitFactory {

	// 因为此时 FruitFactory 产生实例化对象没有意义
	public static Ifruit getInstance(String className) {
		if ("apple".equals(className)) {
			return new Apple();
		}
		if ("banana".equals(className)) {
			return new Banana();
		}
		return null;
	}

}

public class FactoryPattern {

	public static void main(String[] args) {
		Ifruit fruit1 = FruitFactory.getInstance("apple");
		fruit1.print();
		Ifruit fruit2 = FruitFactory.getInstance("banana");
		fruit2.print();
	}

}