/**
 * 大数字操作类
 */
package javaClassLib;

import java.math.BigDecimal;
import java.math.BigInteger;

class TestMath {
	// 用BigDecimal实现四舍五入
	public static double round(double num, int scale) {
		return new BigDecimal(num).divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}

public class BigNumber {

	public static void main(String[] args) {
		BigInteger bigA = new BigInteger("54656758161321549751654894");
		BigInteger bigB = new BigInteger("751654894");
		System.out.println("加法计算: " + bigA.add(bigB));
		System.out.println("减法计算: " + bigA.subtract(bigB));
		System.out.println("乘法计算: " + bigA.multiply(bigB));
		System.out.println("除法计算: " + bigA.divide(bigB));
		BigInteger[] result = bigA.divideAndRemainder(bigB);
		System.out.println("商: " + result[0] + " 余数: " + result[1]);
		
		System.out.println(TestMath.round(12548.2923414, 2));
	}

}
