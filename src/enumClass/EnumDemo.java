/**
 * 枚举(多例模式)
 */
package enumClass;

interface IColor {
	public String getColor();
}

enum Color implements IColor {
	RED("红色"),GREEN("绿色"),BLUE("蓝色");  // 如果定义有很多内容，枚举对象必须写在第一行
	
	private String title;
	
	private Color(String title) {  // 构造方法绝对不能使用public
		this.title = title;
	}
	
	public String toString() {  // 覆写Object类中的方法
		return this.title;
	}

	@Override
	public String getColor() {
		return this.title;
	}
}

enum Sex {
	MALE("男"),FEMALE("女");
	
	private String title;
	
	private Sex(String title) {
		this.title = title;
	}
	
	public String toString() {
		return this.title;
	}
}

class Person {
	private String name;
	private int age;
	private Sex sex;
	
	public Person(String name, int age, Sex sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}

enum PhoneOS {
	ANDROID,IOS;
}

public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Color.RED);
		
		for(Color temp : Color.values()) {
			System.out.println(temp.ordinal() + " : " + temp.name());
		}
		
		IColor ic = Color.GREEN;
		System.out.println(ic.getColor());
		
		Person per = new Person("Java", 20, Sex.MALE);
		System.out.println(per);
		
		switch (PhoneOS.ANDROID) {
			case ANDROID:
				System.out.println("Android系统");
				break;
        	case IOS:
				System.out.println("ios系统");
				break;
		}
		System.out.println(PhoneOS.IOS);
	}

}
