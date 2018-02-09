/**
 * 实现字符串首字母大写
 */
package algorithm;

public class ToFirstCharUpper {

	public static void main(String[] args) {
		System.out.println(initcap("smith"));
		System.out.println(initcap(""));
		System.out.println(initcap("a"));
	}

	public static String initcap(String str) {
		// "".equals(str) 和 str.osEmpty()
		if (str == null || "".equals(str)) { // 没有数据
			return str; // 进来什么数据就返回什么数据
		}
		if (str.length() > 1) {
			return str.substring(0, 1).toUpperCase() + str.substring(1);
		}
		return str.toUpperCase();
	}

}