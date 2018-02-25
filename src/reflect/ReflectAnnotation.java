/**
 * 自定义Annotation
 */
package reflect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 表示此Annotation在运行时生效
@interface MyAnnotation { // 定义一个自己的Annotation
	public String name() default "Java"; // 表示定义了一个属性
	public int age() default 20; // 表示定义了一个属性
}

@SuppressWarnings("serial")
@MyAnnotation
class Member implements Serializable {
	
}

public class ReflectAnnotation {

	public static void main(String[] args) {
		Annotation[] ants = Member.class.getAnnotations();
		for (Annotation ant : ants) {
			System.out.println(ant);
		}
		
		{
			MyAnnotation ant = Member.class.getAnnotation(MyAnnotation.class);
			System.out.println("姓名：" + ant.name());
			System.out.println("年龄：" + ant.age());
		}
	}

}
