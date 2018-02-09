/**
 * 方法引用
 * 
 * 引用静态方法 (类名称::方法名称)
 * 引用某个实例化对象的方法 (实例化对象::普通方法)
 * 引用某个特定类的方法 (类名称::普通方法)
 * 引用构造方法 (类名称::new)
 */
package functionInterface;

@FunctionalInterface
interface IUtilStatic<P, R> {
	public R transform(P p);
}

@FunctionalInterface
interface IUtilObject<R> {
	public R transform();
}

@FunctionalInterface
interface IUtilClass<R, P> {
	public R compare(P p1, P p2);
}

class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

@FunctionalInterface
interface IUtilNew<R, FP, SP> {
	public R create(FP fp, SP sp);
}

public class MethodReference {

	public static void main(String[] args) {
		IUtilStatic<Integer, String> ius = String::valueOf; // 进行方法引用
		String str = ius.transform(123); // 相当于 String.valueOf(123)
		System.out.println(str.length());

		IUtilObject<String> iuo = "hello"::toUpperCase; // 进行方法引用
		System.out.println(iuo.transform());

		IUtilClass<Integer, String> iuc = String::compareTo; // 进行方法引用
		System.out.println(iuc.compare("A", "a"));

		IUtilNew<Person, String, Integer> iun = Person::new; // 进行方法引用
		System.out.println(iun.create("Java", 20));
	}

}