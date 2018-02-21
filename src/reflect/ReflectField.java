/**
 * 通过反射调用类成员
 */
package reflect;

import java.lang.reflect.Field;

class Car {
	public String name;
}

class Jeep extends Car {
	private String factory; // 做一个继承关系
}

public class ReflectField {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("reflect.Jeep");
		{ // 普通代码块
			Field[] fields = cls.getFields(); // 取得父类全部属性
			for (Field field : fields) {
				System.out.println(field);
			}
		}
		System.out.println("---------------------------------------");
		{ // 普通代码块
			Field[] fields = cls.getDeclaredFields(); // 取得本类全部属性
			for (Field field : fields) {
				System.out.println(field);
			}
		}
		Object obj = cls.newInstance(); // 必须实例化对象，否则类属性无法开辟空间
		Field field = cls.getDeclaredField("factory"); // 操作factory属性
		field.setAccessible(true); // 取消封装（取消private）
		field.set(obj, "北京"); // 等价于：对象.factory = "北京"
		System.out.println(field.get(obj));
		System.out.println(field.getType().getName()); // 取得属性类型名称：包.类
		System.out.println(field.getType().getSimpleName()); // 取得属性类型名称：类
	} 

}
