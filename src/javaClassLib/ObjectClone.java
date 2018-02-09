/**
 * 对象克隆
 */
package javaClassLib;

class Person implements Cloneable {  // 必须实现此接口
	
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

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();  // 父类负责克隆
	}
}

public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Java", 10);
		Person p2 = (Person) p1.clone();
		p2.setAge(20);
		System.out.println(p1);
		System.out.println(p2);
	}

}
