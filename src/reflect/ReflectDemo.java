/**
 * Class类对象的三种实例化模式
 */
package reflect;

import java.util.Date;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 实例化模式1
		Class<?> cls1 = new Date().getClass();
		System.out.println(cls1.getName());
		// 实例化模式2
		Class<?> cls2 = java.util.Date.class;
		System.out.println(cls2.getName());
		// 实例化模式3
		Class<?> cls3 = Class.forName("java.util.Date");
		System.out.println(cls3.getName());
		// 通过反射获取类的实例化对象
		Object obj = cls3.newInstance();
		System.out.println(obj);
		
	}

}
