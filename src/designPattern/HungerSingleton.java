/**
 * 单例模式: 饿汉式
 */
package designPattern;

public class HungerSingleton {

	// 再类的内部是允许访问私有的结构的，所以可以再类的内部产生实例化对象
	private final static HungerSingleton INSTANCE = new HungerSingleton(); // 内部产生实例化

	public static HungerSingleton getInstance() {
		return INSTANCE;
	}

	private HungerSingleton() { // 私有构造方法，所有的方法上都可以使用四种权限

	}

	public void print() {

	}

}