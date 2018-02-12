/**
 * 比较器
 */
package javaClassLib;

import java.util.Arrays;

class MyPerson implements Comparable<MyPerson>{
	private String name;
	private int age;
	
	public MyPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "MyPerson [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(MyPerson o) {
		if(this.age > o.age) {
			return 1;
		}else if(this.age < o.age) {
			return -1;
		}
		return 0;
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		MyPerson[] data = new MyPerson[] {
				new MyPerson("Java", 20),
				new MyPerson("Python", 10),
				new MyPerson("AS", 3),
				new MyPerson("TS", 1),
				new MyPerson("C", 21)
		}; 
		Arrays.sort(data);
		for (MyPerson myPerson : data) {
			System.out.println(myPerson);
		}
	}

}
