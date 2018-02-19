/**
 * 对象序列化与反序列化(了解)
 */
package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Person implements Serializable {
//	private transient String name; // 被transient关键字修饰的属性不会进行序列化的操作
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class ObjectSerialize {
	public static final File FILE = new File("E:" + File.separator + "workspace" + File.separator
			+ "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "person.ser");

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ser(new Person("Java", 20));
		dser();
	}

	public static void ser(Object obj) throws FileNotFoundException, IOException { // 专门负责序列化对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE));
		oos.writeObject(obj);
		oos.close();
	}
	
	public static void dser() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));
		System.out.println(ois.readObject());
		ois.close();
	}
}
