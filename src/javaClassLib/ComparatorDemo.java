/**
 * 挽救的比较器
 */
package javaClassLib;

import java.util.Arrays;
import java.util.Comparator;

class People{
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
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

class PeopleComparator implements Comparator<People> {
	
	@Override
	public int compare(People o1, People o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}else if(o1.getAge() < o2.getAge()){
			return -1;
		}
		return 0;
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		People[] data = new People[] {
				new People("Java", 20),
				new People("Python", 10),
				new People("AS", 3),
				new People("TS", 1),
				new People("C", 21)
		}; 
		Arrays.sort(data, new PeopleComparator());
		System.out.println(Arrays.toString(data));
	}

}
