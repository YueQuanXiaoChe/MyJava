/**
 * 判断一个字符串是否由数字所组成
 */
package algorithm;

public class IsComposedOfNnumbers {

	public static void main(String[] args) {
		String str = "1234567890";
		System.out.println(isNumber(str) ? "由数字所组成" : "由非数字所组成");
	}

	// 一般而言如果方法返回的是boolean类型，往往以isXxx()命名
	public static boolean isNumber(String str) {
		char[] data = str.toCharArray(); // 将字符串变为字符数组
		for (int i = 0; i < data.length; i++) {
			if (data[i] < '0' || data[i] > '9') { // 不是数字
				return false; // 后面不需要继续再排查
			}
		}
		return true; // 如果都没有错误，返回true
	}

}