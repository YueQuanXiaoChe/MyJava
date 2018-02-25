/**
 * volatile关键字与懒汉式单例设计模式
 */
package reflect;

class Singleton {
	private volatile static Singleton instance; // 懒汉式所以不会进行对象的实例化
	
	private Singleton() {
		System.out.println("[构造方法]" + Thread.currentThread().getName());
	}
	
	public static Singleton getInstance() { // 如果想要保证性能高，此方法就不能使用同步
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

public class VolatileLazySingleton {

	public static void main(String[] args) {
		new Thread(()->Singleton.getInstance(), "线程A").start();
		new Thread(()->Singleton.getInstance(), "线程B").start();
		new Thread(()->Singleton.getInstance(), "线程C").start();
		new Thread(()->Singleton.getInstance(), "线程D").start();
		new Thread(()->Singleton.getInstance(), "线程E").start();
	}

}
