/**
 * 通过反射调用普通方法
 */
package reflect;

import java.lang.reflect.Method;

class Worker {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Worker() {
		
	}
	public Worker(String name) {
		this.name = name;
	}
	public Worker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ReflectMethod {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("reflect.Worker");
		Method[] mets = cls.getMethods(); // 取得全部方法
		for (Method met : mets) {
			System.out.println(met);
		}
		
		String attribute = "name";
		String value = "Java";
		Object obj = cls.newInstance(); // 任何情况下调用类中的普通方法都必须有实例化对象
		// 取得setName这个方法的实例化对象,设置方法名称和参数类型
		// setName()是方法名称，但是这个方法名称是根据给定的属性信息拼凑得来的，同时该方法需要接受一个String型的参数
		Method setMethod = cls.getMethod("set" + initcap(attribute), String.class);
		// 随后需要通过Method类对象调用知道丁的方法，调用方法必须有实例化对象，同时要传入一个参数
		setMethod.invoke(obj, value); // 相当于Worker对象.setName(value)
		Method getMethod = cls.getMethod("get" + initcap(attribute));
		Object ret = getMethod.invoke(obj); // Worker对象.getName()
		System.out.println(ret);
	}
	
	public static String initcap(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}
