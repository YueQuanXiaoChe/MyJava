/**
 * 针对字符串进行处理操作
 */
package reflect.util;

public class StringUtils {
	private StringUtils() {}
	
	/**
	 * 首字母大写
	 * @param str 要处理的字符串
	 * @return 返回首字母大写的内容
	 */
	public static String initcap(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
