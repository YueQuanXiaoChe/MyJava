/**
 * 通过反射获取父类信息
 */
package reflect;

interface ILanguage {}
interface IEat {}

class Person implements ILanguage, IEat {}

public class ReflectGetSuperClassInfo {

	public static void main(String[] args) {
		Class<?> cls = Person.class;
		System.out.println(cls.getPackage().getName());
		System.out.println(cls.getSuperclass().getName());
		Class<?>[] ifs = cls.getInterfaces();
		for (Class<?> i : ifs) {
			System.out.println(i.getName());
		}
	}

}
