/**
 * 通过反射调用构造方法
 */
package reflect;

import java.lang.reflect.Constructor;

class People {
	private String name;
	private int age;
	
	public People() {}
	public People(String name) {}
	public People(String name, int age) {}
}

// 以后的开发中简单Java类都要写无惨构造方法，否则会出现以下情况：利用反射机制调用简单Java构造方法时很麻烦
class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class ReflectConstructor {

	public static void main(String[] args) throws Exception {
		Class<?> cls = People.class;
		Constructor<?>[] conts = cls.getConstructors();
		for (Constructor<?> con : conts) {
			System.out.println(con);
		}
		
		// 简单Java类中没有无惨构造方法时，利用反射机制调用有参构造方法相当麻烦
		Class<?> cls1 = Student.class;
		Constructor<?> cont = cls1.getConstructor(String.class, int.class);
		System.out.println(cont.newInstance("Java", 20));
		
	}

}
