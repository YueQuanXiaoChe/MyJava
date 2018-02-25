/**
 * Annotation与工厂设计模式
 */
package reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

interface IBook {
	public void look();
}

class PaperBook implements IBook {

	@Override
	public void look() {
		System.out.println("看纸质的书");
	}
	
}

@Retention(RetentionPolicy.RUNTIME)
@interface BookAnnotation {
	public Class<?> target(); // 定义的是实例化子类的类型
}

@BookAnnotation(target=PaperBook.class)
class BookFactory {
	private BookFactory() {}
	
	@SuppressWarnings("unchecked")
	public static <T>T getInstance() throws Exception {
		BookAnnotation ant = BookFactory.class.getAnnotation(BookAnnotation.class);
		return (T) ant.target().newInstance();
	}
}

public class AnnotationFactory {

	public static void main(String[] args) throws Exception {
		IBook ib = BookFactory.getInstance();
		ib.look();
	}

}
