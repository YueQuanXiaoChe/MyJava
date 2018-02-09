/**
 * 单例模式: 懒汉式
 */
package designPattern;

public class LazySingleton {

	// 再类的内部是允许访问私有的结构的，所以可以再类的内部产生实例化对象
	private static LazySingleton instance; // 内部产生实例化

	public static LazySingleton getInstance() {
		if (instance == null) { // 表示此时还没有实例化
			instance = new LazySingleton();
		}
		return instance;
	}

	private LazySingleton() { // 私有构造方法，所有的方法上都可以使用四种权限

	}

	public void print() {

	}

}