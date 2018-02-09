/**
 * 泛型方法
 */
package generic;

public class GenericFun {

	public static void main(String[] args) {
		Integer[] data = fun(1, 2, 3, 4, 5, 6);
		for (Integer x : data) {  // 迭代和自动拆箱
			System.out.println(x);
		}
	}

	// <T>描述的事泛型标记的声明
	public static <T>T[] fun(T ... args){
		return args;
	}
  
}