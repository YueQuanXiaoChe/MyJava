/**
 * 数字操作类(四舍五入)
 */
package javaClassLib;

class MyMath {
	/**
	 * 进行数据的四舍五入操作
	 * @param num 表示原始的操作数据
	 * @param scale 表示保留的小数位数
	 * @return 已经正确四舍五入后的内容
	 */
	public static double round(double num, int scale) {
		return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
	}
}

public class MathDemo {

	public static void main(String[] args) {
		double num = 82389.556789;
		System.out.println(Math.round(num));
		System.out.println(Math.round(15.5));
		System.out.println(Math.round(15.51));
		// 如果负数小数没大于0.5都不进位
		System.out.println(Math.round(-15.5));
		System.out.println(Math.round(-15.51));
		
		System.out.println(MyMath.round(1823.2567, 2));
	}

}
