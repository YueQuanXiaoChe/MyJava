/**
 * 内建函数式接口
 * 
 * 功能型函数式接口: public interface Function<T, R> { public R apply(T t); }
 * 供给型函数式接口: public interface Supplier<R> { public R get(); }
 * 消费型函数式接口: public interface Consumer<T> { public void accept(T t); }
 * 断言型函数式接口: public interface Predicate<T> { public boolean test(T t); }
 * 
 */
package functionInterface;

import java.util.function.*;

public class BuildInFunctionalInterface {

	public static void main(String[] args) {
		Function<Integer, String> fun = String::valueOf;
		System.out.println(fun.apply(1000));

		Supplier<String> sup = "hello"::toUpperCase;
		System.out.println(sup.get());

		Consumer<String> cons = System.out::println;
		cons.accept("Hello world!");

		Predicate<String> pre = "##hello"::startsWith;
		System.out.println(pre.test("##"));
	}

}